package br.usp.libras.contextualiser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.usp.libras.dic.SignDictionary;
import br.usp.libras.sign.Sign;
import br.usp.libras.sign.VerbType;
import br.usp.libras.sign.movement.Direction;
import br.usp.libras.sign.movement.HandMovement;
import br.usp.libras.sign.movement.Segment;
import br.usp.libras.sign.movement.Speed;
import br.usp.libras.sign.symbol.Hand;
import br.usp.libras.sign.symbol.HandOrientation;
import br.usp.libras.sign.symbol.HandPlane;
import br.usp.libras.sign.symbol.HandShape;
import br.usp.libras.sign.symbol.Symbol;
import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.PhraseTags;
import br.usp.libras.syntax.SyntacticTags;
import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.TokenProperties;

public class ContextualiserTest {

	private Sign eu = this.generateSign("EU");
	private Sign voce = this.generateSign("VOCÊ");
	private Sign olhar = this.generateOlhar();
	private Sign bola = this.generateSign("BOLA");
	private Sign pingpong = this.generateSign("PING-PONG");
	private Sign bolaPingpong = this.generateSign("BOLA-PING-PONG", "ping-pong");

	@Test
	public void shouldTranslateBolaPingpongAsOnlyOneSign() {

		SignDictionary dic = setUpDic();
		List<TokenMorph> tokens = getStatement1(); // bola ping-pong, eu olho

		Contextualiser contex = new Contextualiser(dic);
		List<Sign> signs = contex.contextualise(tokens);

		assertEquals(3, signs.size());
		assertEquals(this.bolaPingpong, signs.get(0));
		assertEquals(this.eu, signs.get(1));
		assertEquals(this.olhar, signs.get(2));
	}
	
	@Test
	public void shouldConjugateOlhar() {
		
		SignDictionary dic = setUpDic();
		List<TokenMorph> tokens = getStatement2(); // eu, você olhar

		Contextualiser contex = new Contextualiser(dic);
		List<Sign> signs = contex.contextualise(tokens);
		
		assertEquals(3, signs.size());
		Sign olharConjugado = signs.get(2);
		assertEquals("OLHAR", olharConjugado.getName());
		Hand hand = olharConjugado.getSymbols().get(0).getRightHand();
		assertEquals(HandOrientation.WHITE, hand.getOrientation());
		Segment seg = hand.getMovement().getSegments().get(0);
		assertEquals(Direction.PARA_TRAS, seg.getDirection());
	}
	
	@Test
	public void shouldMakeSignMovementFast(){
		
		SignDictionary dic = setUpDic();
		List<TokenMorph> tokens = getStatementEuOlheiRapidamente();
		
		Contextualiser contex = new Contextualiser(dic);
		List<Sign> signs = contex.contextualise(tokens);
		
		assertEquals(2, signs.size());
		Sign olheiSign = signs.get(1);
		assertEquals("OLHAR", olheiSign.getName());
		HandMovement move = olheiSign.getSymbols().get(0).getRightHand().getMovement();
		assertEquals(Speed.RAPIDO, move.getSpeed());
		
	}
	

	private Sign generateSign(String signName) {

		Sign sign = new Sign();
		sign.setName(signName);
		return sign;
	}

	private Sign generateSign(String signName, String literal) {

		Sign sign = new Sign();
		sign.setName(signName);
		sign.addLiteral(literal);
		return sign;
	}

	private Sign generateOlhar() {
		
		HandMovement mov = new HandMovement();
		mov.addSegment(Direction.PARA_FRENTE);
		Hand hand = new Hand();
		hand.setShape(HandShape.MAO_2);
		hand.setOrientation(HandOrientation.BLACK);
		hand.setPlane(HandPlane.VERTICAL);
		hand.setMovement(mov);
		Symbol symbol = new Symbol();
		symbol.setRightHand(hand);
		Sign sign = new Sign();
		sign.setName("OLHAR");
		sign.setVerbType(VerbType.CONCORDA_COM_SUJEITO_E_OBJETO);
		sign.addSymbol(symbol);
		return sign;
	}
	
	private SignDictionary setUpDic() {

		SignDictionary dic = mock(SignDictionary.class);
		when(dic.translate("bola")).thenReturn(this.translateBola());
		when(dic.translate("ping-pong")).thenReturn(this.translatePingPong());
		when(dic.translate("eu")).thenReturn(this.translateEu());
		when(dic.translate("olhar")).thenReturn(this.translateOlhar());
		when(dic.translate("você")).thenReturn(this.translateVoce());
		return dic;
	}

	private List<Sign> translateBola() {

		List<Sign> signs = new ArrayList<Sign>();
		signs.add(this.bola);
		signs.add(this.bolaPingpong);
		return signs;
	}

	private List<Sign> translatePingPong() {

		List<Sign> signs = new ArrayList<Sign>();
		signs.add(this.pingpong);
		return signs;
	}

	private List<Sign> translateEu() {

		List<Sign> signs = new ArrayList<Sign>();
		signs.add(this.eu);
		return signs;
	}

	private List<Sign> translateVoce() {

		List<Sign> signs = new ArrayList<Sign>();
		signs.add(this.voce);
		return signs;
	}

	private List<Sign> translateOlhar() {

		List<Sign> signs = new ArrayList<Sign>();
		signs.add(this.olhar);
		return signs;
	}

	private List<TokenMorph> getStatement1() {

		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("bola", "bola", SyntacticTags.ACC, PhraseTags.NP, MorphTags.NOUN, "F=S");
		tokens.add(tk);
		tk = new TokenMorph("ping-pong", "ping-pong", SyntacticTags.ACC, PhraseTags.NP, MorphTags.NOUN, "M=S");
		tokens.add(tk);
		tk = new TokenMorph("Eu", "eu", SyntacticTags.SUBJ, PhraseTags.NP, MorphTags.PRON_PERS, "M=1S=NOM");
		tokens.add(tk);
		tk = new TokenMorph("olho", "olhar", SyntacticTags.VERB, PhraseTags.VP, MorphTags.V_FIN, "PR=1S=IND");
		tokens.add(tk);
		return tokens;
	}

	private List<TokenMorph> getStatement2() {

		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("eu", "eu", SyntacticTags.ACC, PhraseTags.NP, MorphTags.PRON_PERS, "M/F=1S=NOM");
		tokens.add(tk);
		tk = new TokenMorph("Você", "você", SyntacticTags.SUBJ, PhraseTags.NP, MorphTags.PRON_PERS, "M/F=3S=NOM");
		tokens.add(tk);
		tk = new TokenMorph("olha", "olhar", SyntacticTags.VERB, PhraseTags.VP, MorphTags.V_FIN, "PR=3S=IND");
		tk.setProperty(TokenProperties.SUBJECT_TYPE_KEY, TokenProperties.SECPERSON);
		tokens.add(tk);
		return tokens;
	}
	
	private List<TokenMorph> getStatementEuOlheiRapidamente() {

		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("eu", "eu", SyntacticTags.SUBJ, PhraseTags.NP, MorphTags.PRON_PERS, "M/F=1S=NOM");
		tokens.add(tk);
		tk = new TokenMorph("olhei", "olhar", SyntacticTags.VERB, PhraseTags.VP, MorphTags.V_FIN, "PR=1S=IND");
		tk.setProperty(TokenProperties.SUBJECT_TYPE_KEY, TokenProperties.FIRSTPERSON);
		tk.setProperty(TokenProperties.ADV_TYPE_KEY, TokenProperties.ADV_MAN_FAST);
		tokens.add(tk);
		return tokens;
	}
	
	

}

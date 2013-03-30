package br.usp.libras.contextualiser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.usp.libras.dic.SignDictionary;
import br.usp.libras.dic.WikiLibrasDictionary;
import br.usp.libras.sign.Literal;
import br.usp.libras.sign.Sign;
import br.usp.libras.sign.VerbType;
import br.usp.libras.sign.movement.Speed;
import br.usp.libras.sign.symbol.Symbol;
import br.usp.libras.syntax.MorphTags;
import br.usp.libras.syntax.TokenMorph;
import br.usp.libras.syntax.TokenProperties;

public class Contextualiser {

    public boolean verbose = false;
    
    private Map<TokenMorph, List<Sign>> relcompleta = null;
    
    private SignDictionary dic;
    private Sign joker;

    public Contextualiser() {
        dic = new WikiLibrasDictionary();
        joker = dic.signByName("CORINGA");
    }

    public Contextualiser(SignDictionary dic) {
        this.dic = dic;
        this.joker = dic.signByName("CORINGA");
    }

    public List<Sign> contextualise(List<TokenMorph> tokens) {
//        rel = getTokSignRelation(tokens);
        
        relcompleta = getCompleteTokSignRelation(tokens);
        
        //checa akeles q tem mais de um sinal possivel
        for (TokenMorph tok : tokens) {
          List<Sign> ls = relcompleta.get(tok);
          //procuremos por literais p incorporar ao sinal!
          //TODO: e se cada sinal plausivel tiver um correspondente nos demais tokens? qual escolher pra sobreviver?
          //TODO: e se nenhum bater?!
          boolean achouliteralproS=false;;
          
          if(ls!=null)
          if(ls.size()>0){
              Sign sganhador=null;
              Sign sdefault=null;//akele q n tem literal
              for(Sign s : ls){
                  achouliteralproS = false;
                  //percorremos os literais
                  if(s.getLiterals()==null || s.getLiterals().size()==0)
                      sdefault=s;
                  
                  for(Literal l: s.getLiterals() ){
                      //checamos se ha algum token cuja dicWord seja igual a este literal
                      for(TokenMorph toklit: tokens){
                          if(toklit!=tok){
                              //cuidado para n tirar o token da lista sendo ITERADA!!!
                              //-solucao:retira a entrada do token do Mapa RELCOMPLETA
                              if(l.getLiteral().equals(toklit.getLemma())){
                                  if (verbose)System.out.println(l.getLiteral() + " bateu!!");
                                  relcompleta.remove(toklit);
                                  achouliteralproS = true;
                                  break;
                              }else
                                  if (verbose)System.out.println(l.getLiteral() + " n bateu " + toklit.getLemma());
                          }
                      }
                      if (verbose)System.out.println("achou: " + achouliteralproS);
                      if(achouliteralproS)break;
                  }
                  if(achouliteralproS){
                      sganhador = s;
                      break;
                  }
              }
              //se achamos literal pra esse Sinal,setamos a lista do token para conter apenas esse elemento
              if(achouliteralproS && sganhador!=null){
                  ls = new ArrayList<Sign>();
                  ls.add(sganhador);
                  relcompleta.put(tok, ls);
              }else if(! achouliteralproS){
                  ls = new ArrayList<Sign>();
                  ls.add(sdefault);
                  relcompleta.put(tok, ls);                  
              }
          }
        }
        
        List<Sign> retorno =new ArrayList<Sign>();
        
        //exibe resultados....
        for (TokenMorph tok : tokens) {
            List<Sign> ls = relcompleta.get(tok);
            if(ls==null || ls.isEmpty()) {
                if (verbose)
                System.out.println(tok.getLexeme()+"\t-> nulo");
            }else{
                processTokProperties(tok);
                retorno.add(ls.get(0));
            }
        }
        
        
        return retorno;
    }

    private void processTokProperties(TokenMorph tok) {
        Map<String, String> propsmap = tok.getProperties();
        Set<String> propskey = propsmap.keySet();

        if (relcompleta.get(tok) == null || relcompleta.get(tok).isEmpty())
            return;
        //Sing associated to the token being analyzed
        Sign sign = (relcompleta.get(tok)).get(0);

        if (verbose)
            if (verbose)System.out.println(tok.getLexeme() + "\t being processed");

        //iterates over the properties of a TOKEN
        for (String prop : propskey) {
            String propval = propsmap.get(prop);

            if (verbose)
                if (verbose)System.out.println("\t" + prop + "\t" + propval);

            //TODO: nullPointer exception
            if (prop.equals(TokenProperties.ADV_TYPE_KEY)) {
                if (propval.equals(TokenProperties.ADV_MAN_FAST)) {
                    //TODO:como saber em q mao agir?? ->o VJ. eh destro..
                    for (Symbol s : sign.getSymbols()) {
                        if(s.getRightHand().getMovement()!=null)
                            s.getRightHand().getMovement().setSpeed(Speed.RAPIDO);
                        //else -- o sinal n tinha movimento
                        //    s.getRightHand().setMovement(new HandMovement());
                        //                        if (verbose)System.out.println(s.getRightHand());
                    }
                } else if (propval.equals(TokenProperties.ADV_MAN_SLOW)) {
                    //TODO:como saber em q mao agir?? ->o VJ. eh destro..
                    for (Symbol s : sign.getSymbols()) {
                        s.getRightHand().getMovement().setSpeed(Speed.LENTO);
                        //                        if (verbose)System.out.println(s.getRightHand());
                    }
                } else if (propval.equals(TokenProperties.ADV_DEG_POS)) {
                    //tipicamente, duplica a mao esquerda. se ela jah existir, agiliza ambas
                    for (Symbol s : sign.getSymbols()) {
                        if (s.getLeftHand() == null) {
                            s.setLeftHand(s.getRightHand().copy());//Hand left = s.getRightHand().;
                        } else {//there was already a left hand. So we must increase speed
                            s.getRightHand().getMovement().setSpeed(Speed.RAPIDO);
                            s.getLeftHand().getMovement().setSpeed(Speed.RAPIDO);
                        }
                    }
                }
            }else if (prop.equals(TokenProperties.SUBJECT_TYPE_KEY) && MorphTags.isVerb(tok.getMorphTag()) && sign.getVerbType() == VerbType.CONCORDA_COM_SUJEITO_E_OBJETO) {
                if(propval.equals(TokenProperties.FIRSTPERSON)){
                    if(verbose)System.out.println("Nao faz nada, eh primeira pessoa");
                } else if(propval.equals(TokenProperties.SECPERSON)){
                    if (verbose)System.out.println("invertendo ordem");
                    for (Symbol s : sign.getSymbols()) {
                        if(s.getLeftHand()!=null)s.getLeftHand().invertMovement();
                        if(s.getRightHand()!=null)s.getRightHand().invertMovement();
                    }
                }
                
            }

        }

    }

    /**
     * cada token morph pode corresponder a mais de um sinal.por isso se usa lista
     * @param tokens
     * @return
     */
    public Map<TokenMorph, List<Sign>> getCompleteTokSignRelation(List<TokenMorph> tokens) {
        Map<TokenMorph, List<Sign>> relation = new HashMap<TokenMorph, List<Sign>>();
        //TODO: deleatur:
     //   List<Sign> signs = new ArrayList<Sign>();

        // Get WebService instance
//        WikiLibrasDictionary dic = new WikiLibrasDictionary();
        // Asks dictionary for word
        if (verbose)
            System.out.println("-------OBTAINING SIGNS----------------------");
        for (TokenMorph token : tokens) {
            //Sign s = dic.simpleTranslate(token.getDicWord());
            List<Sign> sl = dic.translate(token.getLemma());
            if(sl==null || sl.isEmpty()) {
                sl = new ArrayList<Sign>();
              
                if (joker != null) 
                    sl.add(joker);
            }

            relation.put(token, sl);
        }
        if (verbose)
            System.out.println("-------SIGNS OBTAINED----------------------");
        return relation;
    }
    
    
    
    public Map<TokenMorph, Sign> getTokSignRelation(List<TokenMorph> tokens) {
        Map<TokenMorph, Sign> relation = new HashMap<TokenMorph, Sign>();

        // Get WebService instance
        WikiLibrasDictionary dic = new WikiLibrasDictionary();
        // Asks dictionary for word
        if (verbose)
            System.out.println("-------OBTAINING SIGNS----------------------");
        for (TokenMorph token : tokens) {
            Sign s = dic.simpleTranslate(token.getLemma());

            if (verbose)
                System.out.println(token.getLexeme() + "\t->" + s);
            relation.put(token, s);
        }
        if (verbose)
            System.out.println("-------SIGNS OBTAINED----------------------");
        return relation;
    }

}

package br.usp.libras.translator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.usp.libras.dic.SignDictionary;
import br.usp.libras.sign.Sign;

public class TranslatorTest {

	private Sign voce = this.generateSign("VOCÊ");
	private Sign olhar = this.generateSign("OLHAR");
	private Sign bola = this.generateSign("BOLA");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testTranslate() throws IOException {
        
    	SignDictionary dic = setUpDic();
    	Translator translator = new Translator(dic);
        List<Sign> signs = translator.translate("Você olhava a bola");
        
        assertEquals(3, signs.size());
        assertEquals("BOLA", signs.get(0).getName());
        assertEquals("VOCÊ", signs.get(1).getName());
        assertEquals("OLHAR", signs.get(2).getName());
    }
    
	private Sign generateSign(String signName) {

		Sign sign = new Sign();
		sign.setName(signName);
		return sign;
	}
    
	private SignDictionary setUpDic() {

		SignDictionary dic = mock(SignDictionary.class);
		when(dic.translate("bola")).thenReturn(this.translateBola());
		when(dic.translate("você")).thenReturn(this.translateVoce());
		when(dic.translate("olhar")).thenReturn(this.translateOlhar());
		return dic;
	}
	
	private List<Sign> translateBola() {

		List<Sign> signs = new ArrayList<Sign>();
		signs.add(this.bola);
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

}

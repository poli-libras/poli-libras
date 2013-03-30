package br.usp.libras.dic;

import java.util.List;

import javax.jws.WebMethod;

import br.usp.libras.sign.Sign;
import br.usp.wikilibras.ws.ISignDictionaryWS;
import br.usp.wikilibras.ws.SignDictionaryWSService;

/**
 * Implementa a interface SignDictionary para obter os dados do dicionário
 * a partir do webservice remoto do wikilibras
 * @author leonardo
 *
 */
public class WikiLibrasDictionary implements SignDictionary {
    
    private ISignDictionaryWS port;
    
    public WikiLibrasDictionary() {
        
        SignDictionaryWSService servico = new SignDictionaryWSService();
        this.port = servico.getSignDictionaryWSPort();
    }

    @WebMethod
    public Sign signByName(String name) {
        
        br.usp.wikilibras.ws.Sign s = port.signByName(name);
        return ClassConverter.convert(s);
    }

    @WebMethod    
    public List<Sign> nearSigns(String name) {
        
        List<br.usp.wikilibras.ws.Sign> signs = port.nearSigns(name);
        return ClassConverter.convert(signs);
    }
    
    @WebMethod
    public List<Sign> translate(String word) {
        
        List<br.usp.wikilibras.ws.Sign> signs = port.translate(word);
        return ClassConverter.convert(signs);
    }
    
    public Sign simpleTranslate(String word) {
        
        br.usp.wikilibras.ws.Sign s = port.simpleTranslate(word);
        return ClassConverter.convert(s);
    }
    
}

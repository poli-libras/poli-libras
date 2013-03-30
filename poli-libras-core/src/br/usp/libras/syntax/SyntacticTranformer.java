package br.usp.libras.syntax;

import java.util.List;

public interface SyntacticTranformer {

    public List<TokenMorph> transform(String sentence);

}

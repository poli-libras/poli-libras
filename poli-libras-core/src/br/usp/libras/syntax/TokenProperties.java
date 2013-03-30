package br.usp.libras.syntax;

public class TokenProperties {
    
	public static final String SUBJECT_TYPE_KEY = "suj";
	public static final String FIRSTPERSON      = "1";
	public static final String SECPERSON        = "2";
	public static final String THIRDPERSON      = "3";

	public static final String ADV_TYPE_KEY     = "tipoadv";
    
	// the values below must be sync with tagger.properties!
    public static final String ADV_DEG_POS      = "ADV-INT-MAIS";
    public static final String ADV_DEG_NEG      = "ADV-INT-MENOS";
    public static final String ADV_MAN_FAST     = "ADV-MODO-RAPIDO";
    public static final String ADV_MAN_SLOW     = "ADV-MODO-DEVAGAR";

    public static final String LINKING_VERB      = "VERBOS-LIGACAO";
}

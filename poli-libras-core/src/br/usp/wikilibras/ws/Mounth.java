
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mounth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mounth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="RETA_FECHADA"/>
 *     &lt;enumeration value="FECHADA_PARA_FRENTE"/>
 *     &lt;enumeration value="SORRISO_FECHADO"/>
 *     &lt;enumeration value="SORRISO_ABERTO"/>
 *     &lt;enumeration value="METADE_SORRISO_METADE_RETA"/>
 *     &lt;enumeration value="TRISTE_FECHADA"/>
 *     &lt;enumeration value="TRISTE_ABERTA"/>
 *     &lt;enumeration value="ABERTA"/>
 *     &lt;enumeration value="ABERTA_PARA_FRENTE"/>
 *     &lt;enumeration value="ABERTA_FRANZIDA_AO_REDOR"/>
 *     &lt;enumeration value="OVAL_ABERTA"/>
 *     &lt;enumeration value="BOCEJO"/>
 *     &lt;enumeration value="RETANGULAR_ABERTA_HORIZONTAL"/>
 *     &lt;enumeration value="RETANGULAR_ABERTA_VERTICAL"/>
 *     &lt;enumeration value="BEIJO"/>
 *     &lt;enumeration value="BEIJO_PROJETANDO"/>
 *     &lt;enumeration value="TENSA"/>
 *     &lt;enumeration value="TENSA_PARA_FRENTE"/>
 *     &lt;enumeration value="TENSA_PARA_TRAS"/>
 *     &lt;enumeration value="SUGADOS"/>
 *     &lt;enumeration value="LABIO_SUPERIOR_SOBRE_LABIO_INFERIOR"/>
 *     &lt;enumeration value="LABIO_INFERIOR_SOBRE_LABIO_SUPERIOR"/>
 *     &lt;enumeration value="UMA_DOBRA_AO_REDOR_DA_BOCA"/>
 *     &lt;enumeration value="DOBRAS_AO_REDOR_DA_BOCA"/>
 *     &lt;enumeration value="UMA_DOBRA_AO_REDOR_DO_LADO_DIREITO_DA_BOCA"/>
 *     &lt;enumeration value="DOBRAS_AO_REDOR_DO_LADO_DIREITO_DA_BOCA"/>
 *     &lt;enumeration value="LADO_DIREITO_ERGUIDO"/>
 *     &lt;enumeration value="AMBOS_LADOS_ERGUIDOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mounth")
@XmlEnum
public enum Mounth {

    NADA,
    RETA_FECHADA,
    FECHADA_PARA_FRENTE,
    SORRISO_FECHADO,
    SORRISO_ABERTO,
    METADE_SORRISO_METADE_RETA,
    TRISTE_FECHADA,
    TRISTE_ABERTA,
    ABERTA,
    ABERTA_PARA_FRENTE,
    ABERTA_FRANZIDA_AO_REDOR,
    OVAL_ABERTA,
    BOCEJO,
    RETANGULAR_ABERTA_HORIZONTAL,
    RETANGULAR_ABERTA_VERTICAL,
    BEIJO,
    BEIJO_PROJETANDO,
    TENSA,
    TENSA_PARA_FRENTE,
    TENSA_PARA_TRAS,
    SUGADOS,
    LABIO_SUPERIOR_SOBRE_LABIO_INFERIOR,
    LABIO_INFERIOR_SOBRE_LABIO_SUPERIOR,
    UMA_DOBRA_AO_REDOR_DA_BOCA,
    DOBRAS_AO_REDOR_DA_BOCA,
    UMA_DOBRA_AO_REDOR_DO_LADO_DIREITO_DA_BOCA,
    DOBRAS_AO_REDOR_DO_LADO_DIREITO_DA_BOCA,
    LADO_DIREITO_ERGUIDO,
    AMBOS_LADOS_ERGUIDOS;

    public String value() {
        return name();
    }

    public static Mounth fromValue(String v) {
        return valueOf(v);
    }

}

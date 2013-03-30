
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for location.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="location">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ESPACO_NEUTRO"/>
 *     &lt;enumeration value="TOPO_DA_CABECA"/>
 *     &lt;enumeration value="TESTA"/>
 *     &lt;enumeration value="ROSTO"/>
 *     &lt;enumeration value="ROSTO_SUPERIOR"/>
 *     &lt;enumeration value="ROSTO_INFERIOR"/>
 *     &lt;enumeration value="ORELHA"/>
 *     &lt;enumeration value="OLHOS"/>
 *     &lt;enumeration value="NARIZ"/>
 *     &lt;enumeration value="BOCA"/>
 *     &lt;enumeration value="CHOCHECHAS"/>
 *     &lt;enumeration value="QUEIXO"/>
 *     &lt;enumeration value="PESCOCO"/>
 *     &lt;enumeration value="OMBRO"/>
 *     &lt;enumeration value="BUSTO"/>
 *     &lt;enumeration value="ESTOMAGO"/>
 *     &lt;enumeration value="CINTURA"/>
 *     &lt;enumeration value="BRACOS"/>
 *     &lt;enumeration value="ANTEBRACO"/>
 *     &lt;enumeration value="COTOVELO"/>
 *     &lt;enumeration value="PULSO"/>
 *     &lt;enumeration value="PALMA"/>
 *     &lt;enumeration value="COSTAS_DA_MAO"/>
 *     &lt;enumeration value="LADO_INDICADOR"/>
 *     &lt;enumeration value="LADO_DEDO_MINIMO"/>
 *     &lt;enumeration value="DEDOS"/>
 *     &lt;enumeration value="PONTA_DOS_DEDOS"/>
 *     &lt;enumeration value="DEDO_MINIMO"/>
 *     &lt;enumeration value="ANULAR"/>
 *     &lt;enumeration value="DEDO_MEDIO"/>
 *     &lt;enumeration value="INDICADOR"/>
 *     &lt;enumeration value="POLEGAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "location")
@XmlEnum
public enum Location {

    ESPACO_NEUTRO,
    TOPO_DA_CABECA,
    TESTA,
    ROSTO,
    ROSTO_SUPERIOR,
    ROSTO_INFERIOR,
    ORELHA,
    OLHOS,
    NARIZ,
    BOCA,
    CHOCHECHAS,
    QUEIXO,
    PESCOCO,
    OMBRO,
    BUSTO,
    ESTOMAGO,
    CINTURA,
    BRACOS,
    ANTEBRACO,
    COTOVELO,
    PULSO,
    PALMA,
    COSTAS_DA_MAO,
    LADO_INDICADOR,
    LADO_DEDO_MINIMO,
    DEDOS,
    PONTA_DOS_DEDOS,
    DEDO_MINIMO,
    ANULAR,
    DEDO_MEDIO,
    INDICADOR,
    POLEGAR;

    public String value() {
        return name();
    }

    public static Location fromValue(String v) {
        return valueOf(v);
    }

}

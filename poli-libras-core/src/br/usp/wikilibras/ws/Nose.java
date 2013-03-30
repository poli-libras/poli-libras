
package br.usp.wikilibras.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="nose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADA"/>
 *     &lt;enumeration value="NARIZ"/>
 *     &lt;enumeration value="TOQUE_NA_PONTA_DO_NARIZ"/>
 *     &lt;enumeration value="FRANZIDO"/>
 *     &lt;enumeration value="SE_MEXE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "nose")
@XmlEnum
public enum Nose {

    NADA,
    NARIZ,
    TOQUE_NA_PONTA_DO_NARIZ,
    FRANZIDO,
    SE_MEXE;

    public String value() {
        return name();
    }

    public static Nose fromValue(String v) {
        return valueOf(v);
    }

}

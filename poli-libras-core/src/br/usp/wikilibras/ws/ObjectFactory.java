
package br.usp.wikilibras.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.usp.wikilibras.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NearSigns_QNAME = new QName("http://ws.wikilibras.usp.br/", "nearSigns");
    private final static QName _Translate_QNAME = new QName("http://ws.wikilibras.usp.br/", "translate");
    private final static QName _SignByName_QNAME = new QName("http://ws.wikilibras.usp.br/", "signByName");
    private final static QName _TranslateResponse_QNAME = new QName("http://ws.wikilibras.usp.br/", "translateResponse");
    private final static QName _SimpleTranslate_QNAME = new QName("http://ws.wikilibras.usp.br/", "simpleTranslate");
    private final static QName _NearSignsResponse_QNAME = new QName("http://ws.wikilibras.usp.br/", "nearSignsResponse");
    private final static QName _SignByNameResponse_QNAME = new QName("http://ws.wikilibras.usp.br/", "signByNameResponse");
    private final static QName _SimpleTranslateResponse_QNAME = new QName("http://ws.wikilibras.usp.br/", "simpleTranslateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.usp.wikilibras.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Literal }
     * 
     */
    public Literal createLiteral() {
        return new Literal();
    }

    /**
     * Create an instance of {@link Word }
     * 
     */
    public Word createWord() {
        return new Word();
    }

    /**
     * Create an instance of {@link SimpleTranslateResponse }
     * 
     */
    public SimpleTranslateResponse createSimpleTranslateResponse() {
        return new SimpleTranslateResponse();
    }

    /**
     * Create an instance of {@link SignByName }
     * 
     */
    public SignByName createSignByName() {
        return new SignByName();
    }

    /**
     * Create an instance of {@link NearSignsResponse }
     * 
     */
    public NearSignsResponse createNearSignsResponse() {
        return new NearSignsResponse();
    }

    /**
     * Create an instance of {@link SignByNameResponse }
     * 
     */
    public SignByNameResponse createSignByNameResponse() {
        return new SignByNameResponse();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link Translate }
     * 
     */
    public Translate createTranslate() {
        return new Translate();
    }

    /**
     * Create an instance of {@link Sign }
     * 
     */
    public Sign createSign() {
        return new Sign();
    }

    /**
     * Create an instance of {@link NearSigns }
     * 
     */
    public NearSigns createNearSigns() {
        return new NearSigns();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link Hand }
     * 
     */
    public Hand createHand() {
        return new Hand();
    }

    /**
     * Create an instance of {@link SimpleTranslate }
     * 
     */
    public SimpleTranslate createSimpleTranslate() {
        return new SimpleTranslate();
    }

    /**
     * Create an instance of {@link HandMovement }
     * 
     */
    public HandMovement createHandMovement() {
        return new HandMovement();
    }

    /**
     * Create an instance of {@link Inherence }
     * 
     */
    public Inherence createInherence() {
        return new Inherence();
    }

    /**
     * Create an instance of {@link Face }
     * 
     */
    public Face createFace() {
        return new Face();
    }

    /**
     * Create an instance of {@link TranslateResponse }
     * 
     */
    public TranslateResponse createTranslateResponse() {
        return new TranslateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearSigns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "nearSigns")
    public JAXBElement<NearSigns> createNearSigns(NearSigns value) {
        return new JAXBElement<NearSigns>(_NearSigns_QNAME, NearSigns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Translate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "translate")
    public JAXBElement<Translate> createTranslate(Translate value) {
        return new JAXBElement<Translate>(_Translate_QNAME, Translate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "signByName")
    public JAXBElement<SignByName> createSignByName(SignByName value) {
        return new JAXBElement<SignByName>(_SignByName_QNAME, SignByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranslateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "translateResponse")
    public JAXBElement<TranslateResponse> createTranslateResponse(TranslateResponse value) {
        return new JAXBElement<TranslateResponse>(_TranslateResponse_QNAME, TranslateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleTranslate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "simpleTranslate")
    public JAXBElement<SimpleTranslate> createSimpleTranslate(SimpleTranslate value) {
        return new JAXBElement<SimpleTranslate>(_SimpleTranslate_QNAME, SimpleTranslate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearSignsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "nearSignsResponse")
    public JAXBElement<NearSignsResponse> createNearSignsResponse(NearSignsResponse value) {
        return new JAXBElement<NearSignsResponse>(_NearSignsResponse_QNAME, NearSignsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "signByNameResponse")
    public JAXBElement<SignByNameResponse> createSignByNameResponse(SignByNameResponse value) {
        return new JAXBElement<SignByNameResponse>(_SignByNameResponse_QNAME, SignByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleTranslateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wikilibras.usp.br/", name = "simpleTranslateResponse")
    public JAXBElement<SimpleTranslateResponse> createSimpleTranslateResponse(SimpleTranslateResponse value) {
        return new JAXBElement<SimpleTranslateResponse>(_SimpleTranslateResponse_QNAME, SimpleTranslateResponse.class, null, value);
    }

}

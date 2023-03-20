
package nswi145;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nswi145 package. 
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

    private final static QName _ApproveMap_QNAME = new QName("http://nswi145/", "ApproveMap");
    private final static QName _ApproveMapResponse_QNAME = new QName("http://nswi145/", "ApproveMapResponse");
    private final static QName _Exception_QNAME = new QName("http://nswi145/", "Exception");
    private final static QName _UploadMap_QNAME = new QName("http://nswi145/", "UploadMap");
    private final static QName _UploadMapResponse_QNAME = new QName("http://nswi145/", "UploadMapResponse");
    private final static QName _Map_QNAME = new QName("http://nswi145/", "map");
    private final static QName _MapUploadResult_QNAME = new QName("http://nswi145/", "mapUploadResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nswi145
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApproveMap }
     * 
     */
    public ApproveMap createApproveMap() {
        return new ApproveMap();
    }

    /**
     * Create an instance of {@link ApproveMapResponse }
     * 
     */
    public ApproveMapResponse createApproveMapResponse() {
        return new ApproveMapResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link UploadMap }
     * 
     */
    public UploadMap createUploadMap() {
        return new UploadMap();
    }

    /**
     * Create an instance of {@link UploadMapResponse }
     * 
     */
    public UploadMapResponse createUploadMapResponse() {
        return new UploadMapResponse();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link MapUploadResult }
     * 
     */
    public MapUploadResult createMapUploadResult() {
        return new MapUploadResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveMap }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApproveMap }{@code >}
     */
    @XmlElementDecl(namespace = "http://nswi145/", name = "ApproveMap")
    public JAXBElement<ApproveMap> createApproveMap(ApproveMap value) {
        return new JAXBElement<ApproveMap>(_ApproveMap_QNAME, ApproveMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveMapResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApproveMapResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://nswi145/", name = "ApproveMapResponse")
    public JAXBElement<ApproveMapResponse> createApproveMapResponse(ApproveMapResponse value) {
        return new JAXBElement<ApproveMapResponse>(_ApproveMapResponse_QNAME, ApproveMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://nswi145/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMap }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadMap }{@code >}
     */
    @XmlElementDecl(namespace = "http://nswi145/", name = "UploadMap")
    public JAXBElement<UploadMap> createUploadMap(UploadMap value) {
        return new JAXBElement<UploadMap>(_UploadMap_QNAME, UploadMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMapResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadMapResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://nswi145/", name = "UploadMapResponse")
    public JAXBElement<UploadMapResponse> createUploadMapResponse(UploadMapResponse value) {
        return new JAXBElement<UploadMapResponse>(_UploadMapResponse_QNAME, UploadMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Map }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Map }{@code >}
     */
    @XmlElementDecl(namespace = "http://nswi145/", name = "map")
    public JAXBElement<Map> createMap(Map value) {
        return new JAXBElement<Map>(_Map_QNAME, Map.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapUploadResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MapUploadResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://nswi145/", name = "mapUploadResult")
    public JAXBElement<MapUploadResult> createMapUploadResult(MapUploadResult value) {
        return new JAXBElement<MapUploadResult>(_MapUploadResult_QNAME, MapUploadResult.class, null, value);
    }

}

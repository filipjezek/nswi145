package nswi145;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-03-20T19:02:53.894+01:00
 * Generated source version: 3.5.5
 *
 */
@WebService(targetNamespace = "http://nswi145/", name = "MapService")
@XmlSeeAlso({ObjectFactory.class})
public interface MapService {

    @WebMethod(operationName = "UploadMap")
    @Action(input = "http://nswi145/MapService/UploadMapRequest", output = "http://nswi145/MapService/UploadMapResponse")
    @RequestWrapper(localName = "UploadMap", targetNamespace = "http://nswi145/", className = "nswi145.UploadMap")
    @ResponseWrapper(localName = "UploadMapResponse", targetNamespace = "http://nswi145/", className = "nswi145.UploadMapResponse")
    @WebResult(name = "MapUploadResult", targetNamespace = "")
    public nswi145.MapUploadResult uploadMap(

        @WebParam(name = "map", targetNamespace = "")
        nswi145.Map map,
        @WebParam(name = "id", targetNamespace = "")
        int id
    );

    @WebMethod(operationName = "ApproveMap")
    @Action(input = "http://nswi145/MapService/ApproveMapRequest", output = "http://nswi145/MapService/ApproveMapResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://nswi145/MapService/ApproveMap/Fault/Exception")})
    @RequestWrapper(localName = "ApproveMap", targetNamespace = "http://nswi145/", className = "nswi145.ApproveMap")
    @ResponseWrapper(localName = "ApproveMapResponse", targetNamespace = "http://nswi145/", className = "nswi145.ApproveMapResponse")
    public void approveMap(

        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "userId", targetNamespace = "")
        int userId
    ) throws Exception_Exception;
}
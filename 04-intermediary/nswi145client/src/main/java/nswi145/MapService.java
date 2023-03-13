package nswi145;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService
public interface MapService {
	
	@WebMethod
	@WebResult(name="MapUploadResult")
	public MapUploadResult UploadMap(
			@WebParam(name="map") Map map, 
			@WebParam(name="id") int userId
		);
	
	@WebMethod
	public void ApproveMap(
			@WebParam(name="id") int id, 
			@WebParam(name="userId") int userId
		) throws Exception;
}

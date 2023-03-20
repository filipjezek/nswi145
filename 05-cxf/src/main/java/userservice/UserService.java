package userservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "UserService", targetNamespace = "http://userservice/")
public interface UserService {
	@WebMethod(operationName = "getPendingMaps", action = "urn:GetPendingMaps")
	public int getPendingMaps(int userId) throws Exception;
}

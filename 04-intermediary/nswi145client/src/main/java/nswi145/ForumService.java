package nswi145;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ForumService {
	
	@WebMethod
	public int CreateThread(
			@WebParam(name="name") String name, 
			@WebParam(name="userId") int userId
		);
	
	@WebMethod
	public int WritePost(
			@WebParam(name="post") String post,
			@WebParam(name="threadId") int threadId,
			@WebParam(name="userId") int userId
		) throws Exception;
}

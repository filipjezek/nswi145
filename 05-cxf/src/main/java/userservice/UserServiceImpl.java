package userservice;

import javax.jws.WebService;

@WebService(targetNamespace = "http://userservice/", endpointInterface = "userservice.UserService", portName = "UserServiceImplPort", serviceName = "UserServiceImplService")
public class UserServiceImpl implements UserService {
	private boolean userExists(int userId) {
		return true;
	}

	@Override
	public int getPendingMaps(int userId) throws Exception {
		if (!userExists(userId)) {
			throw new Exception("user does not exist");
		}
		return 4;
	}

}

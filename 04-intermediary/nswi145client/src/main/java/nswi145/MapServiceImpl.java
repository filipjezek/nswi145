package nswi145;

import jakarta.jws.WebService;

@WebService(endpointInterface = "nswi145.MapService")
public class MapServiceImpl implements MapService {
	private boolean MapExists(int id) {
		return true;
	}
	
	private boolean IsUserOverLimit(int userId) {
		return false;
	}

	public MapUploadResult UploadMap(Map map, int userId) {
		MapUploadResult res = new MapUploadResult();
		if (IsUserOverLimit(userId)) {
			res.OK = false;
		}
		else {
			res.OK = true;
			res.id = 23;
		}
		return res;
	}

	public void ApproveMap(int id, int userId) throws Exception {
		if (!MapExists(id)) {
			throw new Exception("map does not exist");
		}
	}

}

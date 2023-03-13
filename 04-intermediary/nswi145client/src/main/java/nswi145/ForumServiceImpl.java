package nswi145;

import jakarta.jws.WebService;

@WebService(endpointInterface = "nswi145.ForumService")
public class ForumServiceImpl implements ForumService {
	private boolean ThreadExists(int id) {
		return true;
	}

	public int CreateThread(String name, int userId) {
		int threadId = 42;
		return threadId;
	}

	public int WritePost(String post, int threadId, int userId) throws Exception {
		if (!ThreadExists(threadId)) {
			throw new Exception("thread does not exist");
		}
		int postId = 123;
		return postId;
	}

}

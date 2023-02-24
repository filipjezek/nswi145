package nswi145;

import jakarta.xml.ws.Endpoint;

public class Runner {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8000/Map", new MapServiceImpl());
        Endpoint.publish("http://127.0.0.1:8000/Forum", new ForumServiceImpl());
	}

}

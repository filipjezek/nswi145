package nswi145rest;

import org.glassfish.jersey.server.ResourceConfig;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class Application extends ResourceConfig {
	public Application() {
		packages("nswi145rest");
	}

}

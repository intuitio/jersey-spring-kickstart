package intuitio.kickstart.jersey.config;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("intuitio.kickstart.jersey");
        register(JacksonJsonProvider.class);
    }
}

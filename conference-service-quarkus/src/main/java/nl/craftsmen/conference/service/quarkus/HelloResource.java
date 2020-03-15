package nl.craftsmen.conference.service.quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloResource {

    @ConfigProperty(name = "app.hellomessage", defaultValue = "hello default!")
    String helloMessage;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return helloMessage;
    }

}
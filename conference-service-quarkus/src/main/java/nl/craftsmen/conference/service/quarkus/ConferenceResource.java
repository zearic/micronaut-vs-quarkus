package nl.craftsmen.conference.service.quarkus;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
public class ConferenceResource {

    @Inject
    ConferenceService conferenceService;

    @GET
    @Path("/conferences")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Conference> getAll() {
        return conferenceService.getAll();
    }

    @POST
    @Path("/conferences")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Conference conference) {
        conferenceService.create(conference);

    }

    @GET
    @Path("/conferenceswithcountry/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ExtendedConference> getAllWithCountry() {
        return conferenceService.getAllWithCountry();
    }

}
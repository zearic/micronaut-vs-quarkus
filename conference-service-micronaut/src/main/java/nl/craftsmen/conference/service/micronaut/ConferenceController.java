package nl.craftsmen.conference.service.micronaut;

import io.micronaut.context.annotation.Context;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;
import java.util.List;

@Controller("/")
@Context
public class ConferenceController {

    @Inject
    ConferenceService conferenceService;

    @Get("/conferences")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Conference> getAll() {
        return conferenceService.getAll();
    }

    @Post("/conferences")
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Conference conference) {
        conferenceService.create(conference);

    }

    @Get("/conferenceswithcountry")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ExtendedConference> getAllWithCountry() {
        return conferenceService.getAllWithCountry();
    }
}
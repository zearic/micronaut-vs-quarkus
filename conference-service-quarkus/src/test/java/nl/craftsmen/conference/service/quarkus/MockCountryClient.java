package nl.craftsmen.conference.service.quarkus;

import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
@RestClient
public class MockCountryClient implements CountryClient {

    @Override
    public Country getCountryOfConference(String name) {
        Country country = new Country();
        country.setName("Belgium");
        return country;
    }
}

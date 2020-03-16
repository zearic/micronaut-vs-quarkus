package nl.craftsmen.conference.service.micronaut;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;

import javax.inject.Singleton;

@Singleton
@TypeHint(typeNames = {"org.h2.Driver", "org.h2.mvstore.db.MVTableEngine"})
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
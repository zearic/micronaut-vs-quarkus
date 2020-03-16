package nl.craftsmen.conference.service.micronaut;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@JdbcRepository(dialect = Dialect.H2)
public interface ConferenceCrudRepository extends CrudRepository<Conference, Long> {

    List<Conference> findByName(String name);

    List<Conference> listOrderByName();

    List<Conference> listOrderByNameDesc();

    List<Conference> findTop3ByNameLike(String name);

}

package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.Country;


@Repository
public interface CountryRepo extends JpaRepository<Country,Long> {
}

package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.Status;


@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {
}

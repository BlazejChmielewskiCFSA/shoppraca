package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.Address;


@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}

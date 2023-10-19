package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.Role;


@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}

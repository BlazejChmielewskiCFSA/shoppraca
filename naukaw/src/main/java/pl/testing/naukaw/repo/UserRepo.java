package pl.testing.naukaw.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findAllByUsername(String username);
}

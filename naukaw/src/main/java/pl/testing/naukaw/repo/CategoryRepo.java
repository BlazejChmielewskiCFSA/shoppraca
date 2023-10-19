package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.Category;


@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}

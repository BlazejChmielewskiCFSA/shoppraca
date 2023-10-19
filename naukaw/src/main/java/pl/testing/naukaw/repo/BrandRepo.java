package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Long> {
}

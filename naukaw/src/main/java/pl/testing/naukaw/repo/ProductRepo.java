package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}

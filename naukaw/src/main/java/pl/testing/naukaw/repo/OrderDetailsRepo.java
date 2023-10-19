package pl.testing.naukaw.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.testing.naukaw.entity.OrderDetails;


@Repository
public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Long> {
}

package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ord_det_id;
    private int ord_det_quantity;
    private BigDecimal ord_det_unit_price;

    public OrderDetails() {
    }

    public OrderDetails(int ord_det_quantity) {
        this.ord_det_quantity = ord_det_quantity;
    }

    public Long getOrd_det_id() {
        return ord_det_id;
    }

    public void setOrd_det_id(Long ord_det_id) {
        this.ord_det_id = ord_det_id;
    }

    public int getOrd_det_quantity() {
        return ord_det_quantity;
    }

    public void setOrd_det_quantity(int ord_det_quantity) {
        this.ord_det_quantity = ord_det_quantity;
    }

    public BigDecimal getOrd_det_unit_price() {
        return ord_det_unit_price;
    }

    public void setOrd_det_unit_price(BigDecimal ord_det_unit_price) {
        this.ord_det_unit_price = ord_det_unit_price;
    }
}

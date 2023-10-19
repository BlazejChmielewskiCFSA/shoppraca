package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ord_id;

    private String ord_date;

    @OneToOne
    @JoinColumn(name = "ord_cart_id", referencedColumnName = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "ord_st_id", referencedColumnName = "st_id")
    private Status status;

    @OneToOne
    @JoinColumn(name = "ord_adr_id", referencedColumnName = "adr_id")
    private Address address;

    public Order() {
    }

    public Order(String ord_date) {
        this.ord_date = ord_date;
    }

    public Long getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(Long ord_id) {
        this.ord_id = ord_id;
    }

    public String getOrd_date() {
        return ord_date;
    }

    public void setOrd_date(String ord_date) {
        this.ord_date = ord_date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}

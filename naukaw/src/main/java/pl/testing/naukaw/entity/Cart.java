package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;

    private String cart_discount_code;

    @ManyToMany
    @JoinTable(
            name = "cart_product",
            joinColumns = @JoinColumn(name = "cprd_cart_id", referencedColumnName = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "cprd_prd_id", referencedColumnName = "prd_id")
    )
    private List<Product> products;

    @OneToOne
    @JoinColumn(name = "cart_us_id", referencedColumnName = "us_id")
    private User user;

    public Cart() {
    }

    public Cart(String cart_discount_code) {
        this.cart_discount_code = cart_discount_code;
    }

    public Long getCart_id() {
        return cart_id;
    }

    public void setCart_id(Long cart_id) {
        this.cart_id = cart_id;
    }

    public String getCart_discount_code() {
        return cart_discount_code;
    }

    public void setCart_discount_code(String cart_discount_code) {
        this.cart_discount_code = cart_discount_code;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

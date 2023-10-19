package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prd_id;

    private String prd_name;
    private String prd_description;
    private BigDecimal prd_price;
    private int prd_stock_quantity;
    private int prd_order_quantity;
    private LocalDateTime prd_created;
    private Boolean prd_available;
    private File prd_image;
    private double prd_weight;
    private String prd_dimensions;
    private String prd_product_code;
    private int prd_reviews;

    @ManyToOne
    @JoinColumn(name = "prd_brd_id", referencedColumnName = "brd_id")
    private Brand brand;

    @ManyToMany
    @JoinTable(
            name = "product_category",
            joinColumns = @JoinColumn(name = "prdc_prd_id", referencedColumnName = "prd_id"),
            inverseJoinColumns = @JoinColumn(name = "prdc_cat_id", referencedColumnName = "cat_id")
    )
    private List<Category> categories;

    ///////// KLUCZE OBCE W INNYCH TABELACH

    @OneToMany(mappedBy = "product")
    private List<Review> review;

    @ManyToMany(mappedBy = "products")
    private List<Cart> carts;

    public Product() {
    }

    public Product(String prd_name, String prd_description, BigDecimal prd_price, int prd_order_quantity) {
        this.prd_name = prd_name;
        this.prd_description = prd_description;
        this.prd_price = prd_price;
        this.prd_order_quantity = prd_order_quantity;
    }

    public Product(String prd_name) {
        this.prd_name = prd_name;
    }

    public Long getPrd_id() {
        return prd_id;
    }

    public void setPrd_id(Long prd_id) {
        this.prd_id = prd_id;
    }

    public String getPrd_name() {
        return prd_name;
    }

    public void setPrd_name(String prd_name) {
        this.prd_name = prd_name;
    }

    public String getPrd_description() {
        return prd_description;
    }

    public void setPrd_description(String prd_description) {
        this.prd_description = prd_description;
    }

    public BigDecimal getPrd_price() {
        return prd_price;
    }

    public void setPrd_price(BigDecimal prd_price) {
        this.prd_price = prd_price;
    }

    public int getPrd_stock_quantity() {
        return prd_stock_quantity;
    }

    public void setPrd_stock_quantity(int prd_stock_quantity) {
        this.prd_stock_quantity = prd_stock_quantity;
    }

    public int getPrd_order_quantity() {
        return prd_order_quantity;
    }

    public void setPrd_order_quantity(int prd_order_quantity) {
        this.prd_order_quantity = prd_order_quantity;
    }

    public LocalDateTime getPrd_created() {
        return prd_created;
    }

    public void setPrd_created(LocalDateTime prd_created) {
        this.prd_created = prd_created;
    }

    public Boolean getPrd_available() {
        return prd_available;
    }

    public void setPrd_available(Boolean prd_available) {
        this.prd_available = prd_available;
    }

    public File getPrd_image() {
        return prd_image;
    }

    public void setPrd_image(File prd_image) {
        this.prd_image = prd_image;
    }

    public double getPrd_weight() {
        return prd_weight;
    }

    public void setPrd_weight(double prd_weight) {
        this.prd_weight = prd_weight;
    }

    public String getPrd_dimensions() {
        return prd_dimensions;
    }

    public void setPrd_dimensions(String prd_dimensions) {
        this.prd_dimensions = prd_dimensions;
    }

    public String getPrd_product_code() {
        return prd_product_code;
    }

    public void setPrd_product_code(String prd_product_code) {
        this.prd_product_code = prd_product_code;
    }

    public int getPrd_reviews() {
        return prd_reviews;
    }

    public void setPrd_reviews(int prd_reviews) {
        this.prd_reviews = prd_reviews;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Review> getReview() {
        return review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
}

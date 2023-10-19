package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rev_id;

    private double rev_rating;
    private String rev_comment;
    private LocalDateTime rev_date;

    @ManyToOne
    @JoinColumn(name = "rev_us_id", referencedColumnName = "us_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "rev_prd_id", referencedColumnName = "prd_id")
    private Product product;


    public Review(double rev_rating, String rev_comment) {
        this.rev_rating = rev_rating;
        this.rev_comment = rev_comment;
    }

    public Review() {
    }

    public Long getRev_id() {
        return rev_id;
    }

    public void setRev_id(Long rev_id) {
        this.rev_id = rev_id;
    }

    public String getRev_comment() {
        return rev_comment;
    }

    public void setRev_comment(String rev_comment) {
        this.rev_comment = rev_comment;
    }

    public LocalDateTime getRev_date() {
        return rev_date;
    }

    public void setRev_date(LocalDateTime rev_date) {
        this.rev_date = rev_date;
    }

    public double getRev_rating() {
        return rev_rating;
    }

    public void setRev_rating(double rev_rating) {
        this.rev_rating = rev_rating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

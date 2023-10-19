package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brd_id;

    private String brd_name;
    private String brd_nip;
    private String brd_regon;
    private String brd_mail;
    private String brd_tel;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;

    @OneToOne
    @JoinColumn(name = "br_adr_id", referencedColumnName = "adr_id")
    private Address address;

    public Brand() {
    }

    public Brand(String brd_name, String brd_nip) {
        this.brd_name = brd_name;
        this.brd_nip = brd_nip;
    }

    public Long getBrd_id() {
        return brd_id;
    }

    public void setBrd_id(Long brd_id) {
        this.brd_id = brd_id;
    }

    public String getBrd_name() {
        return brd_name;
    }

    public void setBrd_name(String brd_name) {
        this.brd_name = brd_name;
    }

    public String getBrd_nip() {
        return brd_nip;
    }

    public void setBrd_nip(String brd_nip) {
        this.brd_nip = brd_nip;
    }

    public String getBrd_regon() {
        return brd_regon;
    }

    public void setBrd_regon(String brd_regon) {
        this.brd_regon = brd_regon;
    }

    public String getBrd_mail() {
        return brd_mail;
    }

    public void setBrd_mail(String brd_mail) {
        this.brd_mail = brd_mail;
    }

    public String getBrd_tel() {
        return brd_tel;
    }

    public void setBrd_tel(String brd_tel) {
        this.brd_tel = brd_tel;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

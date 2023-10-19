package pl.testing.naukaw.entity;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adr_id;

    private String adr_street;
    private int adr_house_number;
    private int adr_apartment_number;
    private String adr_zip_code;
    private String adr_town;

    @OneToOne(mappedBy = "address")
    private User user;

    @OneToOne(mappedBy = "address")
    private Brand brand;

    @OneToOne(mappedBy = "address")
    private Order order;

    public Address() {
    }

    public Address(String adr_street, int adr_house_number) {
        this.adr_street = adr_street;
        this.adr_house_number = adr_house_number;
    }

    public Long getAdr_id() {
        return adr_id;
    }

    public void setAdr_id(Long adr_id) {
        this.adr_id = adr_id;
    }

    public String getAdr_street() {
        return adr_street;
    }

    public void setAdr_street(String adr_street) {
        this.adr_street = adr_street;
    }

    public int getAdr_house_number() {
        return adr_house_number;
    }

    public void setAdr_house_number(int adr_house_number) {
        this.adr_house_number = adr_house_number;
    }

    public int getAdr_apartment_number() {
        return adr_apartment_number;
    }

    public void setAdr_apartment_number(int adr_apartment_number) {
        this.adr_apartment_number = adr_apartment_number;
    }

    public String getAdr_zip_code() {
        return adr_zip_code;
    }

    public void setAdr_zip_code(String adr_zip_code) {
        this.adr_zip_code = adr_zip_code;
    }

    public String getAdr_town() {
        return adr_town;
    }

    public void setAdr_town(String adr_town) {
        this.adr_town = adr_town;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

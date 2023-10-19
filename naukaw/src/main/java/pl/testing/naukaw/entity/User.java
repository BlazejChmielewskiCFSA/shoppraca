package pl.testing.naukaw.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long us_id;

    @Column(name = "us_username")
    private String username;
    @Column(name = "us_password")
    private String password;
    private String us_email;
    private String us_firstname;
    private String us_lastname;
    private LocalDate us_birthDay;
    private LocalDateTime us_created;
    private LocalDateTime us_updated;
    private boolean isEnable;

    @ManyToOne
    @JoinColumn(name = "us_rl_id", referencedColumnName = "rl_id")
    private Role role;

    @OneToOne
    @JoinColumn(name = "us_adr_id", referencedColumnName = "adr_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "us_ctr_id", referencedColumnName = "ctr_id")
    private Country country;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getUs_id() {
        return us_id;
    }

    public void setUs_id(Long us_id) {
        this.us_id = us_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUs_email() {
        return us_email;
    }

    public void setUs_email(String us_email) {
        this.us_email = us_email;
    }

    public String getUs_firstname() {
        return us_firstname;
    }

    public void setUs_firstname(String us_firstname) {
        this.us_firstname = us_firstname;
    }

    public String getUs_lastname() {
        return us_lastname;
    }

    public void setUs_lastname(String us_lastname) {
        this.us_lastname = us_lastname;
    }

    public LocalDate getUs_birthDay() {
        return us_birthDay;
    }

    public void setUs_birthDay(LocalDate us_birthDay) {
        this.us_birthDay = us_birthDay;
    }

    public LocalDateTime getUs_created() {
        return us_created;
    }

    public void setUs_created(LocalDateTime us_created) {
        this.us_created = us_created;
    }

    public LocalDateTime getUs_updated() {
        return us_updated;
    }

    public void setUs_updated(LocalDateTime us_updated) {
        this.us_updated = us_updated;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnable;
    }
}

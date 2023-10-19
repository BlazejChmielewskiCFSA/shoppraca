package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "countires")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ctr_id;

    private String ctr_name;
    private String ctr_dialing_code;

    @OneToMany(mappedBy = "country")
    private List<User> user;

    public Country() {
    }

    public Country(String ctr_name) {
        this.ctr_name = ctr_name;
    }

    public Long getCtr_id() {
        return ctr_id;
    }

    public void setCtr_id(Long ctr_id) {
        this.ctr_id = ctr_id;
    }

    public String getCtr_name() {
        return ctr_name;
    }

    public void setCtr_name(String ctr_name) {
        this.ctr_name = ctr_name;
    }

    public String getCtr_dialing_code() {
        return ctr_dialing_code;
    }

    public void setCtr_dialing_code(String ctr_dialing_code) {
        this.ctr_dialing_code = ctr_dialing_code;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }


}

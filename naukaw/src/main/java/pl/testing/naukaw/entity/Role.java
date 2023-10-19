package pl.testing.naukaw.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rl_id;

    private String rl_name;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role() {
    }

    public Role(String rl_name) {
        this.rl_name = rl_name;
    }

    public Long getRl_id() {
        return rl_id;
    }

    public void setRl_id(Long rl_id) {
        this.rl_id = rl_id;
    }

    public String getRl_name() {
        return rl_name;
    }

    public void setRl_name(String rl_name) {
        this.rl_name = rl_name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

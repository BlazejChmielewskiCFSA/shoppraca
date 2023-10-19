package pl.testing.naukaw.entity;

import javax.persistence.*;

@Entity
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ver_id;

    private String token;

    @OneToOne
    @JoinColumn(name = "ver_us_id", referencedColumnName = "us_id")
    private User user;

    public VerificationToken() {
    }

    public VerificationToken(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public Long getVer_id() {
        return ver_id;
    }

    public void setVer_id(Long ver_id) {
        this.ver_id = ver_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

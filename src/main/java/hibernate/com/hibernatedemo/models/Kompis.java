package hibernate.com.hibernatedemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kompis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String namn;
    private String adress;
    private String email;
    private String phone;

    public Kompis(){}

    public Kompis(String name, String adress, String email, String phone) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "Kompis[id=%d, name='%s', adress='%s', email='%s', phone='%s']",
               namn, adress, email, phone);
    }
}

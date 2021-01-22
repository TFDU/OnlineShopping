package onlineShop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "billingaddress")
public class BillingAddress implements Serializable {
    private static final long serialVersionUID = 1028098616457762743L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    @OneToOne(mappedBy = "billingAddress")
    private Customer custome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Customer getCustome() {
        return custome;
    }

    public void setCustome(Customer custome) {
        this.custome = custome;
    }
}

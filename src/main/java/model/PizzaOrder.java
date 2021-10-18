package model;
//JAVA BEAN
import java.io.Serializable;
import java.util.Date;

public class PizzaOrder  implements Serializable {

    private long id;
    private String crustDescription;
    private String sauceDescription;
    private String toppingsDescription;
    private String address;
    private Date createdAT;

    public PizzaOrder() {
    }


    public PizzaOrder(String crustDescription, String sauceDescription, String toppingsDescription, String address, Date createdAT) {
        this.crustDescription = crustDescription;
        this.sauceDescription = sauceDescription;
        this.toppingsDescription = toppingsDescription;
        this.address = address;
        this.createdAT = createdAT;
    }

    public PizzaOrder(long id, String crustDescription, String sauceDescription, String toppingsDescription, String address, Date createdAT) {
        this.id = id;
        this.crustDescription = crustDescription;
        this.sauceDescription = sauceDescription;
        this.toppingsDescription = toppingsDescription;
        this.address = address;
        this.createdAT = createdAT;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCrustDescription() {
        return crustDescription;
    }

    public void setCrustDescription(String crustDescription) {
        this.crustDescription = crustDescription;
    }

    public String getSauceDescription() {
        return sauceDescription;
    }

    public void setSauceDescription(String sauceDescription) {
        this.sauceDescription = sauceDescription;
    }

    public String getToppingsDescription() {
        return toppingsDescription;
    }

    public void setToppingsDescription(String toppingsDescription) {
        this.toppingsDescription = toppingsDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(Date createdAT) {
        this.createdAT = createdAT;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "id=" + id +
                ", crustDescription='" + crustDescription + '\'' +
                ", sauceDescription='" + sauceDescription + '\'' +
                ", toppingsDescription='" + toppingsDescription + '\'' +
                ", address='" + address + '\'' +
                ", createdAT=" + createdAT +
                '}';
    }
}

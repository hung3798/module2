package CaseStudy.Model;

import java.util.Date;

public class Customer {
    private String customerName = "pham thai hung";
    private Date birthday = new Date(1998, 05, 19);
    private String idCard = "187606512";
    private String numberPhone = "0968259939";
    private String email = "hungpham@gmail.com";
    private String typeCustomer = "diamond";
    private String address = "Nghe An";
    private Service service;

    public Customer() {
    }

    public Customer(String customerName, Date birthday, String idCard, String numberPhone, String email, String typeCustomer, String address, Service service) {
        this.customerName = customerName;
        this.birthday = birthday;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.service = service;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String showInformation() {
        return "this is customer" + this.customerName;
    }
}

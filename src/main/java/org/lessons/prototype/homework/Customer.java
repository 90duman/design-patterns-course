package org.lessons.prototype.homework;

public class Customer extends User{
    public String customerName;

    public Customer(String firstName, String lastname, String username, String password, String customerName) {
        super(firstName, lastname, username, password);
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}

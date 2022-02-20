package ir.maktab.hw10.question2.entity;

import java.sql.Date;

public class Order {
    private int id;
    private Date date;
    private int count;
    private int price;
    private Product product;
    private Customer customer;

    public Order(int id, Date date, int count, int price, Product product, Customer customer) {
        this.id = id;
        this.date = date;
        this.count = count;
        this.price = price;
        this.product = product;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", count=" + count +
                ", price=" + price +
                ", product=" + product +
                ", customer=" + customer +
                '}';
    }
}

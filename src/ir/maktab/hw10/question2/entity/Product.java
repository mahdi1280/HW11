package ir.maktab.hw10.question2.entity;

public class Product {

    private int id;
    private int price;
    private String name;
    private int count;
    private Category category;

    public Product(int id, int price,String name, int count, Category category) {
        this.id = id;
        this.price = price;
        this.name=name;
        this.count = count;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", category=" + category +
                '}';
    }
}

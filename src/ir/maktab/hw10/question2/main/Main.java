package ir.maktab.hw10.question2.main;

import ir.maktab.hw10.question2.entity.Category;
import ir.maktab.hw10.question2.entity.Customer;
import ir.maktab.hw10.question2.entity.Order;
import ir.maktab.hw10.question2.entity.Product;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, 1, "1", 1, new Category(1, "1"));
        Product product2 = new Product(2, 3, "2", 1, new Category(1, "2"));
        Product product3 = new Product(3, 2, "3", 3, new Category(1, "3"));
        List<Product> products = new ArrayList<>(Arrays.asList(
                product1, product2, product3
        ));
        List<Product> collect = products.stream().filter(product -> product.getCategory().getTitle().equals("1")).collect(Collectors.toList());
        collect.forEach(System.out::println);
        Customer customer = new Customer(1, "1");
        Customer customer1 = new Customer(2, "2");
        Customer customer2 = new Customer(3, "3");
        Customer customer3 = new Customer(4, "4");
        List<Order> orders = new ArrayList<>(Arrays.asList(
                new Order(1, Date.valueOf("2021-02-03"), 1, 11, product1, customer)
                , new Order(1, Date.valueOf("2021-04-01"), 2, 16, product1, customer1)
                , new Order(1, Date.valueOf("2022-02-12"), 3, 15, product1, customer2)
                , new Order(1, Date.valueOf("2022-02-13"), 4, 14, product1, customer3)
                , new Order(1, Date.valueOf("2022-12-20"), 5, 13, product1, customer2)
                , new Order(1, Date.valueOf("2021-02-20"), 1, 12, product1, customer1)
        ));
        orders.stream()
                .filter(order -> order.getDate().after(Date.valueOf("2021-02-01"))
                        && order.getDate().before(Date.valueOf("2021-04-01")))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Optional<Product> min = products.stream().min((o1, o2) -> o1.getPrice() < o2.getPrice() ? -1 : 1);
        System.out.println("min: "+min.get());
    }
}

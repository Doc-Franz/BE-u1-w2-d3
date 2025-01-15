import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // esercizio 1
        System.out.println("----------esercizio1----------");
        List<Product> products1 = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();
        Product p1 = new Product(1L,"Harry Potter", "Books", 120.0);
        Product p2 = new Product(2L,"The lord of the rings", "Books", 80.0);
        Product p3 = new Product(3L,"Matrix", "Books", 110.5);
        Product p4 = new Product(4L,"baby1", "Baby", 120.0);
        Product p5 = new Product(5L,"baby2", "Baby", 80.0);
        Product p6 = new Product(6L,"baby3", "Baby", 110.5);
        Product p7 = new Product(7L,"boys1", "Boys", 100.0);
        Product p8 = new Product(8L,"boys2", "Boys", 80.0);
        Product p9 = new Product(9L,"boys3", "Boys", 130.5);
        products1.add(p1);
        products1.add(p2);
        products1.add(p2);
        products2.add(p4);
        products2.add(p5);
        products2.add(p6);

        Stream<Product> prodottiPerPrezzo = products1.stream().filter(element -> element.category.equals("Books") && element.price > 100);
        prodottiPerPrezzo.forEach(product -> System.out.println(product.toString()));
        System.out.println("");

        //esercizio 2
        System.out.println("----------esercizio2----------");
        Customer c1 = new Customer(1L, "customer1", 3);
        Customer c2 = new Customer(2L, "customer2", 2);
        List<Order> orders = new ArrayList<>();
        Order o1 = new Order(1L, "on the way", LocalDate.of(2025,2,24),LocalDate.of(2025, 3, 27),products1, c1);
        Order o2 = new Order(2L, "not started", LocalDate.of(2025,2,24),LocalDate.of(2025, 3, 27),products2, c2);
        Order o3 = new Order(3L, "arrival", LocalDate.of(2025,2,24),LocalDate.of(2025, 3, 27),products2, c1);
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);

        Stream<Order> ordiniBaby = orders.stream().filter(order -> order.products.stream().allMatch(product -> product.category.equals("Baby")));
        ordiniBaby.forEach(order -> System.out.println(order.toString()));
        System.out.println("");

        //esercizio 3
        System.out.println("----------esercizio3----------");
        List<Product> allProducts = new ArrayList<>();
        allProducts.add(p1);
        allProducts.add(p2);
        allProducts.add(p3);
        allProducts.add(p4);
        allProducts.add(p5);
        allProducts.add(p6);
        allProducts.add(p7);
        allProducts.add(p8);
        allProducts.add(p9);

        Stream<Product> productForBoys = allProducts.stream().filter(product -> product.category.equals("Boys")).map(product -> new Product(product.id, product.name, product.category, product.price * 0.9));
        productForBoys.forEach(product -> System.out.println(product.toString()));



    }
}
package task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    static Customer customer;

    @BeforeAll
    static void init(){
        List<Product> products = List.of(new Product(1, "Product1", "Group1", "Subgroup1", 10),
                new Product(2, "Product2", "Group2", "Subgroup2", 20),
                new Product(3, "Product3", "Group3", "Subgroup3", 30));
        customer = new Customer("1", "Nihal", "Rekabi Bazar, Munshiganj", "01646767354", products);

    }


    @Test
    void getProducts() {
        assertEquals("Product1, Product2, Product3, ", customer.getProducts());
    }

    @Test
    void addToCart() {
        customer.buyProducts();
        customer.addToCart(1);
        assertEquals(1, customer.getCart().getNumberOfProducts());
    }

    @Test
    void deleteFromCart() {
        customer.buyProducts();
        customer.addToCart(1);
        customer.deleteFromCart(1);
        assertEquals(0, customer.getCart().getNumberOfProducts());
    }

    @Test
    void getCart() {
        customer.addToCart(1);
        assertEquals(1, customer.getCart().getNumberOfProducts());
    }

    @Test
    void buyProducts() {
        customer.addToCart(1);
        customer.buyProducts();
        assertEquals(0, customer.getCart().getNumberOfProducts());
    }

    @Test
    void makePayment() {
        customer.addToCart(1);
        Payment payment = new Payment("1", "Nihal", "Visa", "123456789");
        customer.makePayment(payment);
    }
}
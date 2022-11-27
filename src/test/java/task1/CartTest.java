package task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    static  Cart cart;
    static  Product product1;
    static  Product product2;


    @BeforeAll
    static void init(){

        product1 = new Product(1, "Alu", "Shobji", "NonSeasonal", 28);
        product2 = new Product(2, "Potol", "Shobji", "NonSeasonal", 28);

    }

    @Test
    void addProduct() {
        cart = new Cart();
        cart.addProduct(product1);
        assertEquals(1,cart.getNumberOfProducts());
        cart.addProduct(product2);
        assertEquals(2,cart.getNumberOfProducts());
    }

    @Test
    void removeProduct() {
        cart = new Cart();
        cart.addProduct(product1);
        assertEquals(1,cart.getNumberOfProducts());
        cart.removeProduct(1);
        assertEquals(0,cart.getNumberOfProducts());
    }

    @Test
    void getProducts() {
        cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        String retMsg = "";
        retMsg += product1.getId() + " " + product1.getName() + " " + product1.getGroup() + " " + product1.getSubgroup() + " " + product1.getPrice() + "\n";
        retMsg += product2.getId() + " " + product2.getName() + " " + product2.getGroup() + " " + product2.getSubgroup() + " " + product2.getPrice() + "\n";
        assertEquals(retMsg,cart.getProducts());
    }

    @Test
    void getTotalPrice() {
        cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(56,cart.getTotalPrice());
    }

    @Test
    void getNumberOfProducts() {
        cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(2,cart.getNumberOfProducts());
    }
}
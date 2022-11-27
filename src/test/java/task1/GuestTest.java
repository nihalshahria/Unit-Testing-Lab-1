package task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    static List<Product> tmp;
    static Product product1;
    static Product product2;
    static Product product3;
    static Product product4;
    static Guest guest;


    @BeforeAll
    static void init() {
        product1 = new Product(1, "Alu", "Shobji", "NonSeasonal", 28);
        product2 = new Product(2, "Potol", "Shobji", "NonSeasonal", 28);
        product3 = new Product(3, "Pepe", "Shobji", "NonSeasonal", 28);
        product4 = new Product(4, "Kumra", "Shobji", "NonSeasonal", 28);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        guest = new Guest(products);

        tmp = new ArrayList<Product>();
        tmp.add(product1);
        tmp.add(product2);
        tmp.add(product3);
    }

    @Test
    void viewProducts() {
        String retMsg = "";
        for (Product product : tmp) {
            retMsg += product.getId() + " " + product.getName() + " " + product.getGroup() + " " + product.getSubgroup() + " " + product.getPrice() + "\n";
        }
        assertEquals(retMsg, guest.viewProducts());
    }

    @Test
    void GetRegistered() {
        assertEquals("New Customer registerd with id: 1 name: Nihal address: Dhaka phoneNo: 123456", guest.GetRegistered("1", "Nihal", "Dhaka", 123456));
    }
}
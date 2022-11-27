package task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AdminTest {
    static Admin admin;
    static List<Product> tmp;
    static Product product1;
    static Product product2;
    static Product product3;
    static Product product4;


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
        admin = new Admin(1, "Nihal", products);

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
        assertEquals(retMsg, admin.viewProducts());
    }

    @Test
    void addProduct() {
        tmp.add(product4);
        admin.addProduct(product4);
        String retMsg = "";
        for (Product product : tmp) {
            retMsg += product.getId() + " " + product.getName() + " " + product.getGroup() + " " + product.getSubgroup() + " " + product.getPrice() + "\n";
        }
        assertEquals(retMsg, admin.viewProducts());
    }

    @Test
    void deleteProduct() {
        tmp.remove(product3);
        admin.deleteProduct(3);
        String retMsg = "";
        for (Product product : tmp) {
            retMsg += product.getId() + " " + product.getName() + " " + product.getGroup() + " " + product.getSubgroup() + " " + product.getPrice() + "\n";
        }
        assertEquals(retMsg, admin.viewProducts());
    }
//
    @Test
    void modifyProduct() {
        admin.modifyProduct(1, product4);
        tmp.set(0, product4);
        String retMsg = "";
        for (Product product : tmp) {
            retMsg += product.getId() + " " + product.getName() + " " + product.getGroup() + " " + product.getSubgroup() + " " + product.getPrice() + "\n";
        }
        assertEquals(retMsg, admin.viewProducts());

    }

    @Test
    void makeShipment() {
        assertEquals("Shipment of 10 Potol has been made.", admin.makeShipment(2, 10));
        assertEquals("Product not found.", admin.makeShipment(5, 10));
    }

    @Test
    void confirmDelivery() {
        assertEquals("Delivery of 10 Potol has been confirmed.", admin.confirmDelivery(2, 10));
        assertEquals("Product not found.", admin.confirmDelivery(5, 10));
    }
}
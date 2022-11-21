package task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AdminTest {
    static Admin admin;
    static Shop shop;
    static List<Product> tmp;
    static Product product;
    static Product product2;


    @BeforeAll
    static void init() {
        shop = new Shop();
        admin = new Admin(1, "Nihal", shop);
        tmp = new ArrayList<Product>();
        product = new Product(1, "Alu", "Shobji", "NonSeasonal", 28);
        product2 = new Product(2, "Alu", "Shobji", "NonSeasonal", 28);

    }

    @Test
    void viewProducts() {
        List<Product> tmp = new ArrayList<Product>();

        assertEquals(tmp, admin.viewProducts());
    }

    @Test
    void addProduct() {
        admin.addProduct(product);
        admin.addProduct(product);
        tmp.add(product);
        assertEquals(tmp, admin.viewProducts());
    }

    @Test
    void deleteProduct() {
        var product = new Product(1, "Alu", "Shobji", "NonSeasonal", 28);
        admin.addProduct(product);
        admin.deleteProduct(product);
        admin.deleteProduct(product);
        assertEquals(tmp, admin.viewProducts());
    }

    @Test
    void modifyProduct() {
        admin.addProduct(product);
        tmp.add(product2);
        admin.modifyProduct(product, product2);
        assertEquals(tmp, admin.viewProducts());

        admin.modifyProduct(product, product2);
//        assertNotEquals(tmp, admin.viewProducts());
    }

    @Test
    void makeShipment() {
        Guest guest = new Guest(shop);
        guest.viewProducts();
        var customer = guest.GetRegistered("2", "Shahria", "Akhalia Shurma", 1646767354);
        assertThrows(IllegalArgumentException.class, () -> {
            guest.GetRegistered("2", "Shahria", "Akhalia Shurma", 1646767354);
        });

        assertEquals(shop.products, customer.viewProducts());
        admin.addProduct(product);
        admin.addProduct(product2);
        customer.addToCart(product);
        customer.addToCart(product2);
        customer.deleteFromCart(product2);
        customer.deleteFromCart(product2);
        assertThrows(IllegalArgumentException.class, ()->{
            customer.buyProducts(new Payment(customer.id, "Shahria", "Vsdfisa", "654684351"));
        });
        customer.buyProducts(new Payment(customer.id, "Shahria", "Visa", "654684351"));
        List<Cart> tmpOrders = new ArrayList<>();
        admin.makeShipment();
        assertEquals(tmpOrders, admin.viewOrders());
    }

    @Test
    void confirmDelivery() {
    }
}
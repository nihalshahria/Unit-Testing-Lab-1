package task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    static Product product;


    @Test
    void getId() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        assertEquals(1, product.getId());
    }

    @Test
    void setId() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        product.setId(2);
        assertEquals(2, product.getId());
    }

    @Test
    void getName() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        assertEquals("name", product.getName());
    }

    @Test
    void setName() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        product.setName("new name");
        assertEquals("new name", product.getName());
    }

    @Test
    void getGroup() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        assertEquals("group", product.getGroup());
    }

    @Test
    void setGroup() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        product.setGroup("new group");
        assertEquals("new group", product.getGroup());
    }

    @Test
    void getSubgroup() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        assertEquals("subgroup", product.getSubgroup());
    }

    @Test
    void setSubgroup() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        product.setSubgroup("new subgroup");
        assertEquals("new subgroup", product.getSubgroup());
    }

    @Test
    void getPrice() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        assertEquals(1.0f, product.getPrice());
    }

    @Test
    void setPrice() {
        product = new Product(1, "name", "group", "subgroup", 1.0f);
        product.setPrice(2.0f);
        assertEquals(2.0f, product.getPrice());
    }
}
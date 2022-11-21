package task1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public int id;

    public int numberOfProducts() {
        return products.size();
    }

    public List<Product> products;

    public float total() {
        float total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }

    public Cart() {
        products = new ArrayList<Product>();
        id = (int) Math.random();
    }

}

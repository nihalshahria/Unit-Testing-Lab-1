package task1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;

    protected int numberOfProducts;

    public Cart() {
        id = Math.abs((int) (Math.random() * 100000));
        numberOfProducts = 0;
    }

    protected List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        numberOfProducts++;
    }

    public void removeProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                numberOfProducts--;
                break;
            }
        }
    }

    public String getProducts() {
        String retMsg = "";
        for (Product product : products) {
            retMsg += product.getId() + " " + product.getName() + " " + product.getGroup() + " " + product.getSubgroup() + " " + product.getPrice() + "\n";
        }
        return retMsg;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }
}

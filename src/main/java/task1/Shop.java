package task1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Product> products;
    List<Cart> paidOrders;
    List<Customer> customers;


    public Shop() {
        paidOrders = new ArrayList<>();
        products = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public String addProduct(Product product) {
        if (products.contains(product)) {
            return ("Product already exists");
        } else {
            products.add(product);
            return ("Product of id: " + product.id + " added");
        }
    }

    public String deleteProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
            return ("Product of id: " + product.id + " deleted");
        } else {
            return ("Product doesn't exist");
        }
    }

    public String modifyProduct(Product product, Product newProduct) {
        if (products.contains(product)) {
            products.remove(product);
            products.add(newProduct);
            return ("Product of id: " + product.id + "  modified");
        } else {
            return ("Product doesn't exist");
        }
    }

    public List<Product> viewProducts() {
        return products;
    }

    public String makeShipment() {
        var retMsg = "";
        var orders = new ArrayList<Cart>();
        for (var cart : paidOrders) {
            boolean flag = true;
            for (var product : cart.products) {
                if (!products.contains(product)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (var product : cart.products) {
                    products.remove(product);
                }
                retMsg += ("Products have been shipped for cart id: " + cart.id);
                orders.add(cart);
            }
        }
        for(var order: orders){
            paidOrders.remove(order);
        }
        return retMsg;
    }
}

package task1;

import java.util.List;

public class Admin {
    private int id;
    private String name;
    private List<Product> products;

    public Admin(int id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public String viewProducts() {
        String retMsg = "";
        for (Product product : products) {
            retMsg += product.getId() + " " + product.getName() + " " + product.getGroup() + " " + product.getSubgroup() + " " + product.getPrice() + "\n";
        }
        return retMsg;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }

    public void modifyProduct(int id, Product newProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, newProduct);
                break;
            }
        }
    }

    public String makeShipment(int id, int quantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                return "Shipment of " + quantity + " " + product.getName() + " has been made.";
            }
        }
        return "Product not found.";
    }

    public String confirmDelivery(int id, int quantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                return "Delivery of " + quantity + " " + product.getName() + " has been confirmed.";
            }
        }
        return "Product not found.";
    }
}

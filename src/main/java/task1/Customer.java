package task1;

import java.util.List;

public class Customer {
    private String id;
    protected String name;
    protected String address;
    protected String phoneNo;
    private List<Product> products;
    private Cart cart;

    public Customer(String id, String name, String address, String phoneNo, List<Product> products) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.products = products;
        cart = new Cart();
    }

    public String getProducts() {
        String productString = "";
        for (Product product : products) {
            productString += product.getName() + ", ";
        }
        return productString;
    }

    public void addToCart(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                cart.addProduct(product);
            }
        }
    }

    public void deleteFromCart(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                cart.removeProduct(id);
            }
        }
    }

    public Cart getCart() {
        return cart;
    }

    public void buyProducts() {
        cart = new Cart();
    }

    public void makePayment(Payment payment) {
        payment.pay(cart.getTotalPrice());
    }
}

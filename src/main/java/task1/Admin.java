package task1;

import java.util.List;

public class Admin {
    public int id;
    public String name;
    private Shop shop;

    public Admin(int id, String name, Shop shop) {
        this.id = id;
        this.name = name;
        this.shop = shop;
    }

    public List<Product> viewProducts() {
        return shop.viewProducts();
    }

    public String addProduct(Product product){
        return shop.addProduct(product);
    }

    public String deleteProduct(Product product){
        return shop.deleteProduct(product);
    }

    public String modifyProduct(Product product, Product newProduct){
        return shop.modifyProduct(product, newProduct);
    }
    public List<Cart> viewOrders(){
        return shop.paidOrders;
    }

    public String makeShipment(){
        return shop.makeShipment();
    }

    public String confirmDelivery(){
        return "Delivery Confirmed";
    }
}

package task1;

import java.util.List;

public class Guest {
    private Shop shop;
    public Guest(Shop shop) {
        this.shop = shop;
    }

    public List<Product> viewProducts(){
        return  shop.products;
    }

    public  Customer GetRegistered(String id, String name, String address, int phoneNo){
        for (var customer: shop.customers) {
            if(customer.id == id){
                throw new IllegalArgumentException("id: "+id + " already exists");
            }
        }
        var newCustomer = new Customer(id, name, address, phoneNo, shop);
        return newCustomer;
    }

}

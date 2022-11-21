package task1;

import java.util.List;

public class Customer {
    public String id;
    public String name;
    public String address;
    public int phoneNo;
    private Cart cart;
    private Shop shop;

    public Customer(String id, String name, String address, int phoneNo, Shop shop) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.shop = shop;
        shop.customers.add(this);
    }

    public List<Product> viewProducts(){
        return shop.products;
    }
    public String addToCart(Product product){
        if(cart == null)cart = new Cart();
        cart.products.add(product);
        return product.name+" is added to cart";
    }

    public String deleteFromCart(Product product){
        if (cart.products.contains(product)){
            cart.products.remove(product);
            return product.name+" removed from cart";
        }
        return product.name+" doesn't exist in the cart";
    }

    public String makePayment(float amount, Payment payment){
//        var paymentReciept = new Payment(this.id, this.name, "Visa", this.id);
        payment.pay(amount);
        return amount+" paid with "+payment.cardType + " card";
    }

    public String buyProducts(Payment payment){
        var amount = cart.total();
        System.out.println(makePayment(amount, payment));
        shop.paidOrders.add(cart);
        return "Order placed";
    }


}

package task1;

import java.util.List;

public class Guest {
    private List<Product> products;

    public Guest(List<Product> products) {
        this.products = products;
    }

    public String viewProducts() {
        String retMsg = "";
        for (Product product : products) {
            retMsg += product.getId() + " " + product.getName() + " " + product.getGroup() + " " + product.getSubgroup() + " " + product.getPrice() + "\n";
        }
        return retMsg;
    }

    public String GetRegistered(String id, String name, String address, int phoneNo) {
        return "New Customer registerd with id: " + id + " name: " + name + " address: " + address + " phoneNo: " + phoneNo;
    }

}

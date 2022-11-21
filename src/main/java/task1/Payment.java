package task1;

public class Payment {
    public String customerId;
    public String name;
    public String cardType;
    public String cardNo;
    public void pay(float total) {
        System.out.println("Payment is made");
    }

    public Payment(String customerId, String name, String cardType, String cardNo) {
        if(!cardType.equals("Visa") && !cardType.equals("MasterCard") && !cardType.equals("American Express"))
            throw new IllegalArgumentException();
        this.customerId = customerId;
        this.name = name;
        this.cardType = cardType;
        this.cardNo = cardNo;
    }
}

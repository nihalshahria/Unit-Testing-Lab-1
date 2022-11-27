package task1;

public class Payment {
    protected String customerId;
    public String name;
    private String cardType;
    private String cardNo;
    public String pay(double total) {
        return "Payment of " + total + " is successful";
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

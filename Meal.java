public class Meal {
    protected String orderID;
    protected String customerName;
    protected int quantity;

    public Meal(){
        this.orderID="000";
        this.customerName="Guest";
        this.quantity=0;
    }

    public Meal(String orderID, String customerName, int quantity){
        this.orderID=orderID;
        this.customerName=customerName;
        this.quantity=quantity;
    }

    public void displayOrderDetails(){
        System.out.println("Order ID: "+orderID);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Quantity: "+quantity);
    }
    public double calculateBill(){
        return 12.00*quantity;
    }
    public double calculateBill(int couponAmount){
        double billWithDiscount=calculateBill()-couponAmount;
        return Math.max(0,billWithDiscount);
    }
}

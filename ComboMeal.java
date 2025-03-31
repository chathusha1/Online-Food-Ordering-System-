public class ComboMeal extends Meal{
    private boolean includesDrinkAndDessert;

    public ComboMeal(){
        super();
        this.includesDrinkAndDessert=false;
    }
    public ComboMeal(String orderID, String customerName, int quantity, boolean includesDrinkAndDessert){
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert=includesDrinkAndDessert;
    }

    @Override
    public double calculateBill() {
        return (15.00*quantity)+(includesDrinkAndDessert ? 5.00 : 0.00);

    }

    @Override
    public void displayOrderDetails() {
        System.out.println("--------Combo Meal--------");
        super.displayOrderDetails();
        System.out.println("Includes Drink & Dessert: "+(includesDrinkAndDessert ? "Yes": "No"));
        System.out.println("Total Bill: $"+calculateBill());
    }
}

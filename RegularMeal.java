public class RegularMeal extends Meal{
    private boolean isVegetarian;

    public RegularMeal(){
        super();
        this.isVegetarian=true;
    }
    public RegularMeal(String orederID, String customerName, int quantity, boolean isVegetarian ){
        super(orederID, customerName, quantity);
        this.isVegetarian=isVegetarian;
    }

    @Override
    public double calculateBill() {
        return 10.00*quantity;
    }

    @Override
    public void displayOrderDetails() {
        System.out.println("-------Regular Meal-------");
        super.displayOrderDetails();
        System.out.println("Meal Type: "+(isVegetarian ? "Vegetarian" : "Non-Vegetarian"));
        System.out.println("Total Bill: $ "+calculateBill());
    }
}

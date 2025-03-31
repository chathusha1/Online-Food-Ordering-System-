public class ResturantApp {
    public static void main(String[] args) {
        RegularMeal regularMeal = new RegularMeal();
        ComboMeal comboMeal=new ComboMeal("C102","Alice Green",2,true);

        regularMeal.displayOrderDetails();
        System.out.println("Bill with $2 Coupon:$"+regularMeal.calculateBill(2));

        System.out.println();

        comboMeal.displayOrderDetails();
        System.out.println("Bill with $3 Coupon:$ "+comboMeal.calculateBill(3));
    }
}

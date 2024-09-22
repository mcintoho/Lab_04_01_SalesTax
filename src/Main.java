public class Main {
    public static void main(String[] args) {
        // Given price of the purchase
        double price = 324.99;

        // Sales tax rate (5%)
        double taxRate = 0.05;

        // Calculate the sales tax
        double salesTax = price * taxRate;

        // Output the original price and the computed sales tax
        System.out.println("Original Price: $" + price);
        System.out.println("Sales Tax (5%): $" + salesTax);

        // Output total amount after tax
        double totalPrice = price + salesTax;
        System.out.println("Total Price (with Tax): $" + totalPrice);
    }
}
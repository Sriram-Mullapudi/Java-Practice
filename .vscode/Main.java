import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String item;
        Double price;
        Integer quantity;
        char currency;
        double totalPrice;

        System.out.println("Welcome to the Shopping Cart Program!");


        
        System.out.println("Please enter the item name:");
        item = scanner.nextLine();
        System.out.println("Please enter the price of the item:");
        price = scanner.nextDouble();
        System.out.println("Please enter the quantity of the item:");
        quantity = scanner.nextInt();
        System.out.println("Please enter the currency (e.g., $, €, £):");
        currency = scanner.next().charAt(0);
        totalPrice = price * quantity;  
        System.out.println("The total price for " + quantity + " " + item + "(s) is: " + currency + totalPrice);
        System.out.println("Thank you for using the Shopping Cart Program!");
        // Additional functionality can be added here



        scanner.close();


    }
}
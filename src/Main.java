import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int itemPrice = 0;
        double shipCost = 0;
        double totalPrice = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the price of your item?");
        itemPrice = in.nextInt();
        shipCost = itemPrice*.02;
        totalPrice = itemPrice+shipCost;

        if (itemPrice>=100){
            System.out.println("You qualify for free shipping so your total is $"+itemPrice);
        }
        else if (itemPrice>0 && itemPrice<100){
            System.out.println("Your total shipping cost is $"+shipCost+" and yor total price is $"+totalPrice);
        }
        else {
            System.out.println("You did not enter a valid input");
        }

    }
}
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price, total;
        int no_of_items;

        System.out.print("Enter the Item you want to buy : ");
        item = scanner.nextLine();

        System.out.print("Enter the Price of the item : ");
        price = scanner.nextDouble();

        System.out.print("Enter how many you have purchased : ");
        no_of_items = scanner.nextInt();

        if(no_of_items > 1){
            System.out.println("You have bought " + no_of_items + " " + item + "s");
        }else{
            System.out.println("You have bought a " +item );
        }

        total = price * no_of_items;

        System.out.println("Your total is $" + total);




        scanner.close();
    }
}

import java.util.Scanner;
public class Shopcart {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    char currency = '$';
    double total;

    System.out.print("What item would you like to buy ? (seperated by ',') : ");
    item = scanner.nextLine();
    String[] items = item.split(",");

    System.out.print("What is teh price for each? : ");
    price = scanner.nextDouble();

    System.out.print("How many would you like? : ");
    quantity = scanner.nextInt();
    
    total = price * quantity;

    System.out.println("You have bought " + quantity + " of "+ String.join(", ", items) + "/s" + " priced " + price + " each. " + "So your Total payable is: "  + currency + total);


    scanner.close();
    }
}
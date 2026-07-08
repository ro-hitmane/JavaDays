
public class Var {

    public static void main(String[] args) {
        //Primitive data types in java
        int age = 22;
        int year = 2026;
        int quantity = 15;
        System.out.println("My age at year " + year + " is " + age + " and I have " + quantity + " gifts");

        double price = 19.99;
        double gpa = 8.95;
        double temperature = -12.9;
        System.out.println("$" + price + " is the price of the product and my gpa is " + gpa + " and the temperature is " + temperature);

        char grade = 'A';
        char symbol = '#';
        char currancy = '$';
        System.out.println(currancy + " is the currancy symbol and " + grade + " is my grade and " + symbol + " is a symbol");

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;
        System.out.println("Is student: " + isStudent + " Is for sale: " + forSale + " Is online: " + isOnline);

        if (isStudent) {
            System.out.println("I am a student");
        } else {
            System.out.println("I am not a student");
        }

//Non-primitive (Reference) data types in java
        String name = "Rohit";
        String food = "PuranPoli";
        String email = "rohit@example.com";
        System.out.println("My name is " + name + " and I like to eat " + food + " and my email is " + email);

        System.out.println("My name is " + name.toUpperCase() + " and I like to eat " + food.toLowerCase() + " and my email is " + email.replace("example", "gmail") + " Price of puranpoli is $" + price + "it needs to be cooked at temperature " + temperature + " and my age at year " + year + " is " + age + " and I have " + quantity + " gifts" + " Is student: " + isStudent + " Is for sale: " + forSale + " Is online: " + isOnline);
    }
}

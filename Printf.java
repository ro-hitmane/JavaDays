public class Printf {
    public static void main(String[] args) {
        //printf = method used to fromat output in Java
        //%[flags][width][.precision][specifier-character]
/*        String name = "Goku";    //%s
        char firstL = 'G';       //%c
        int age = 50;           //%d
        double height = 6.8;    //%f
        boolean isGoat = true;  //%b

        System.out.printf("Hello %s\n", name);
        System.out.printf("\nYour first letter is %c", firstL);
        System.out.printf("\nYour height is %.1f", height);
        System.out.printf("\nYour age is %d", age);
        System.out.printf("\nAre you a goat? %b", isGoat);

        System.out.printf("\n Hello %s. You are %d years old and %c is first letter of your name", name, age, firstL);

*/

//flags
//+ = output a plus or minus sign for a number
//, = comma grouping separator if number > 1000
//( = enclose negative numbers with parentheses()
// space = add a space before positive numbers
/*
double num1 = 9000000.99;
double num2 = 100.1500;
double num3  = -54.01;

System.out.printf("%+,.1f is num1\n", num1); 
System.out.printf("% .2f is num2\n", num2);
System.out.printf("%(.1f is num3\n", num3);
*/

//width

//0= zero padding for numbers
// number = right justify text (default)
// negative number = left justify text
   
    int id1 = 1;
    int id2 = 23;    
    int id3 = 456;
    int id4 = 7890;

    System.out.printf("%04d\n", id1);
    System.out.printf("%4d\n", id2);
    System.out.printf("%-4d\n", id3);
    System.out.printf("%d\n", id4);
   }
}
/* Java program
* to test
* whether a number is a an even or an odd number*/
import java.util.Scanner; //importing the scanner class

public class Testevenorodd {
    public static void main(String[] args) {
         Scanner num = new Scanner(System.in); //calling out the scanner class
        System.out.println("Enter a number: "); //outputs enter a number

        long number = num.nextLong(); //creates a new data type of int type

        //test the condition to see if it is true using the if statement
        if (number % 2 == 0) {
            System.out.println(number + " Is an Even number"); //will out put number is even if condition is true
        }
        else {
            System.out.println(number + " Is an Odd number"); //will output number is odd if condition is false
        }
    }
}

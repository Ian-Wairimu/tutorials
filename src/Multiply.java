import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int num1 = num.nextInt();

        System.out.println("Enter Number: ");

        int num2 = num.nextInt();

        int number = num1 * num2;

        System.out.println("Your Total is: " + number);
    }
}

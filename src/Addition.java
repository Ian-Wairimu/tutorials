import java.util.Scanner; //importing scanner class

public class Addition {
    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
        System.out.println("Enter No 1: ");

        int num1 = num.nextInt();

        System.out.println("Enter No 2: ");

        int num2 = num.nextInt();

        int addition = num1 + num2;
        System.out.println("The addition is: " + addition);
    }
}

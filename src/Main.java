import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstName = new Scanner(System.in);
        System.out.println("what is you first Name: ");

        String fName = firstName.nextLine();

        Scanner Age = new Scanner(System.in);
        System.out.println("your age: ");

        int age = Age.nextInt();

        System.out.println("welcome " + "" + fName + " " + "age " + age);
    }
}

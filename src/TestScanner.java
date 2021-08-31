import java.util.Scanner;

public class TestScanner {
    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int num = Scan.nextInt();
        Scan.close();

        System.out.println("The Number you entered is: " + num);
    }
}

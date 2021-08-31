 import java.util.Scanner; //importing the scanner class

public class CompoundInterest {
    public static void main(String args[])
    {
        //calling out the scanner class
        Scanner ci = new Scanner(System.in);
        //Declare variables
        float p, r, t, n;
        System.out.println("Enter the Principal : ");
        p = ci.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = ci.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = ci.nextFloat();     //Initialize the variables
        System.out.println("Enter the number of times that interest is compounded per unit t");
        n= ci.nextFloat();      //Initialize the variables
        ci.close();

        //Calculate the compound interest
        double amount = p * Math.pow(1 + (r / n), n * t);
        double compoundInterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+ compoundInterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
}








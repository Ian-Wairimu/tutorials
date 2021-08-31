import java.util.Scanner; //importing a scanner class

/*
* This java program will be
* on how to create a gravity
* calculator
* */

public class GravityCalculator {
    public static void main(String[] args) {
        String textVar = " ";
        Scanner in = new Scanner(System.in); //calling out the scanner class
        double gravity = -9.81; //earth gravity's
        double initialVelocity = 0.0; //we have been given the initial velocity to 0
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        //we will use a do loop
        do {
            System.out.println("Earth's gravity = -9.81 ");
            System.out.println("Initial position of object = " + initialPosition + "(input\"pos\" to change it)");
            System.out.println("Initial velocity of object = " + initialVelocity + "(input\"vel\" to change it)");
            System.out.println("Falling time of object = " + fallingTime + "(input\"time\" to change it)");

            finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;

            System.out.println("The object's position after " + fallingTime + " second is " + finalPosition + "m.");
            System.out.println("input \" quit \" to exit the application");
            String textvar = in.nextLine();

            if("pos".equals(textvar)) {
                System.out.println("Enter new initial position of objects: ");
                while (!in.hasNextDouble())
                    in.next();
                    initialPosition = in.nextDouble();
            }
            else if ("vel".equals(textVar)) {
                System.out.println("Enter new initial velocity: ");
                while (!in.hasNextDouble())
                    initialVelocity = in.nextDouble();
            }
            else if ("time".equals(textVar)){
                System.out.println("Enter new falling time of object: ");
                while (!in.hasNextDouble())
                    in.next();
                    fallingTime = in.nextDouble();

           }
                 else if ("quit".equals(textVar))
                 {
                     System.out.println("\b");
                 }
            }
        while (!"quit".equals(textVar));
        }
    }


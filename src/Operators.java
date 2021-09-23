//operators in java
public class Operators {
/*
*Basic Arithmetic Operators
*Assignment Operators
*Auto-increment and Auto-decrement Operators
*Logical Operators
*Comparison (relational) operators
*Bitwise Operators
* Ternary Operator
*/
    public static void main(String[] args) {
        /*
         * basic arithmetic operators
         * addition
         * subtraction
         * multiplication
         * division
         * modulo
         * */
        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2) );
        System.out.println("num1 - num2: " + (num1 - num2) );
        System.out.println("num1 * num2: " + (num1 * num2) );
        System.out.println("num1 / num2: " + (num1 / num2) );
        System.out.println("num1 % num2: " + (num1 % num2) );

        //logical operators
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 || b2: " + (b1||b2));
        System.out.println("!(b1 && b2): " + (!b1&&b2));

    }
}

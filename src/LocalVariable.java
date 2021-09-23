//this is a local variable its
// scope is limited to the method
// and which means you cannot
// change there values

public class LocalVariable {
    public String myVar = "instance variable";

    public void myMethod() {
        //this is the local variable
        String myVar = "inside method";
        System.out.println(myVar);
    }

    public static void main(String[] args) {
        LocalVariable localVariable = new LocalVariable();

        System.out.println("calling method");
        //we call it using the myMethod()
        localVariable.myMethod();
        System.out.println(localVariable.myVar);
    }
}

//static variable or (class) is associated with the class

public class StaticVariable {
    public static String example = "static variable example";

    public static void main(String[] args) {
        StaticVariable staticVariable = new StaticVariable();
        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();

        System.out.println(staticVariable.example);
        System.out.println(staticVariable1.example);
        System.out.println(staticVariable2.example);
        //output: static variable example

        staticVariable1.example = "changed";

        System.out.println(staticVariable.example);
        System.out.println(staticVariable1.example);
        System.out.println(staticVariable2.example);
    }
}

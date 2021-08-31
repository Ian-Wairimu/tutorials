public class StaticVarExample {
    public static String myVar = "what you doing";

    public static void main(String[] args) {
        StaticVarExample obj = new StaticVarExample();
        StaticVarExample obj2 = new StaticVarExample();
        StaticVarExample obj3 = new StaticVarExample();

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);

        obj3.myVar = "can i join you";

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);
    }
}
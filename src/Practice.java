public class Practice {
    public static String myVar = "hello there";

    public static void main(String[] args) {
        Practice obj = new Practice();
        Practice obj2 = new Practice();
        Practice obj3 = new Practice();

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);

        obj3.myVar = "Welcome all";

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);
    }
}

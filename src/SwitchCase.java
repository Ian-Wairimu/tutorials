//switch case
//used when we have a number of options and we want to perform different task
public class SwitchCase {
    public static void main(String[] args) {
        int num = 2;
        switch(num+2)
        {
            case 1:
                System.out.println("Case1: Value is: "+num);
            case 2:
                System.out.println("Case2: Value is: "+num);
            case 3:
                System.out.println("Case3: Value is: "+num);
            default:
                System.out.println("Default: Value is: "+num);
        }
    }
}

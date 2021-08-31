import java.lang.Throwable;

public class TryException {
    public static void main(String[] args) {
        int x = 15;
        int y = 0;

        try {
            int z = x / y;
        }
        catch (Exception e) {
            System.out.println(x / (y + 2));
        }
        System.out.println("code run successfully");
        }
    }


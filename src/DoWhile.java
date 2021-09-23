public class DoWhile {
    public static void main(String[] args) {
       int i = 10;
        do {
            System.out.println(i);
            i--;
        }while(i > 1);

        int arr[] = {1, 3, 4, 4 , 5};
        int j = 0;
        do {
            System.out.println(arr[j]);
            j++;
        }while (j < arr.length);
    }
}

package array;

public class PrintArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        for(int i = 0; i < 4; i++)
            System.out.println(arr[i]);

        System.out.println("**********************************");

        for (int i = 0; i < 10; i = i++) {
            i += 1;
            System.out.println(i);
        }
    }
}

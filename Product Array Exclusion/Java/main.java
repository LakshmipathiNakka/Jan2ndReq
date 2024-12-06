import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Input the size of the array
        int[] arr = new int[n];
        int[] rarr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Input the array elements
        }

        Solution.computeProductArray(n, arr, rarr);  // Call the function to calculate the product array

        for (int i = 0; i < n; i++) {
            System.out.print(rarr[i] + " ");  // Output the result array
        }
        System.out.println();
    }

}

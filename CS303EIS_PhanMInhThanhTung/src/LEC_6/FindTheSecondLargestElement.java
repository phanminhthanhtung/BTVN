package LEC_6;
import java.util.*;

public class FindTheSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        
        int largest  = arr[0];
        int secondLargest = arr[1];
        
        for (int n : arr) {
            if (n > largest) {
                largest = n;
            } else if (n > secondLargest && n < largest) {
                secondLargest = n;
            }
        }
        System.out.println(" The second-largest element is: " + secondLargest);
    }
}

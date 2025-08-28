package LEC_6;
import java.util.*;

public class SwapTwoElementsInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("");
        
        int idx1 = sc.nextInt();
        
        int idx2 = sc.nextInt();
        
        swap(arr, idx1, idx2);
        
        System.out.print(Arrays.toString(arr));
    }
    
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}

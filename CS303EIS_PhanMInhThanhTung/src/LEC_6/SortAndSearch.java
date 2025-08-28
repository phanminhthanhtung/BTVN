package LEC_6;
import java.util.*;

public class SortAndSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("");
        int find = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == find){
                System.out.println("The number " + find + " was found at index " + i);
            }
        }
    }
}

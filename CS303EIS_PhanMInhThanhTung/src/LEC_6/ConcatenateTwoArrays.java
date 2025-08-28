package LEC_6;
import java.util.*;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        
        System.out.println("Array #1");
        for (int i = 0; i < num; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Array #2");
        for (int i = 0; i < num; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }    
        
        System.out.print(Arrays.toString(result));
    }
}

package LEC_6;
import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        for (int i = 0; i < num; i++){
            System.out.print("Index " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        for (int n: arr){
            System.out.print(n + " ");
        }
    }
}

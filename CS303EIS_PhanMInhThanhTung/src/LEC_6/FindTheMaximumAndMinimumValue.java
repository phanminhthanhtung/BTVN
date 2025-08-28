package LEC_6;
import java.util.*;

public class FindTheMaximumAndMinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int max = arr[0], min = arr[0];
        
        for (int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int i = 1; i < num; i++){
            if (arr[i] > max){
                max = arr[i]; 
            } else {
                min = arr[i];
            }
        }
        
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}

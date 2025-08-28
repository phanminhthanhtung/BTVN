package LEC_6;
import java.util.*;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        for (int i = 0; i < num; i++){
            System.out.print("Index " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
                
        System.out.print("Enter number to find: ");
        int findNum = sc.nextInt();
        int count = 0;
        for (int n: arr){
            if (n == findNum){
                count++;
            }
        }
        System.out.println("The number " + findNum +  " appears " + count + " times.");
    }
}

package LEC_6;
import java.util.*;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int amount = sc.nextInt();
        
        for (int i = 0; i < amount; i++){
            arr.add(sc.nextInt());
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        
        System.out.print(result.toString());
    }
}

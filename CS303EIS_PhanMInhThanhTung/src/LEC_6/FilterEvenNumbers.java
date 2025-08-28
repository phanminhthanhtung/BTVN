package LEC_6;
import java.util.*;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        for (int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int n: arr){
            if (n % 2 == 0){
                newArr.add(n);
            }
        }
        
        for (int i = 0; i < newArr.size(); i++) {
            if (i == newArr.size() - 1)
                System.out.print(newArr.get(i));
            else
                System.out.print(newArr.get(i) + ", ");
}
    }
}

package LEC_6;
import java.util.*;

public class UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0, sum = 0, num = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        do{
            num = sc.nextInt();
            if (num != -1){
                arr.add(num);
                index++;
                
                sum += num;
            }
        } while(num != -1);
        
        System.out.println("Numbers entered: " + arr.toString());
        System.out.println("The sum is: " + sum);

    }
}

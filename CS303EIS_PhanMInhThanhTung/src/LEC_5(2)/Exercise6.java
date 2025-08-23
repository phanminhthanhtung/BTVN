package LEC_5;
import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int temp = 1, sum = 0;
        while (temp > 0){
            temp = num % 10;
            num /= 10;
            sum += temp;
        }
        
        System.out.println("The sum of the digits is: " + sum);
    }
}

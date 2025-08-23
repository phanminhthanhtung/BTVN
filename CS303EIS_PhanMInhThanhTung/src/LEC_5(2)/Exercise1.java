package LEC_5;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}

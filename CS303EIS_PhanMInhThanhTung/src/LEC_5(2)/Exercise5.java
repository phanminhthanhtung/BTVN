package LEC_5;
import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        System.out.println("The factorial of " + n + " is: " + sum);
    }
    
}

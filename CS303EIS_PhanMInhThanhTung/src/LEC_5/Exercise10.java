package LEC_5;
import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == num || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

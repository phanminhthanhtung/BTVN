package LEC_5;
import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

package LEC_5;
import java.util.*;

public class CalculateAverageUntil0IsEntered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 1, index = -1, sum = 0;
        while (num != 0){
            System.out.print("o Enter a number (enter 0 to stop): ");
            num = sc.nextInt();
            sum += num;
            ++index;
        }
        System.out.println("The average is: " + sum / index);
    }
}

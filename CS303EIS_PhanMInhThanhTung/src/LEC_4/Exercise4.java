package LEC_3;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st double: ");
        double db1 = sc.nextDouble();
        
        System.out.print("Input 2st double: ");
        double db2 = sc.nextDouble();
        
        System.out.println("The average of 2 double is: " + Math.round(((db1 + db2) / 2) * 100.0) / 100.0);
    }
}

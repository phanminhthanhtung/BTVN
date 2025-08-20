package LEC_4;
import java.util.Scanner;

public class QuadrantExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = Double.parseDouble(sc.nextLine());
        System.out.print("Enter y: ");
        double y = Double.parseDouble(sc.nextLine());
        System.out.println("- Result: " + quadrant(x, y));
    }
    
    public static int quadrant(double x, double y){
        if (x > 0 && y > 0){
            return 1;
        } else if (x < 0 && y > 0){
            return 2;
        } else if (x < 0 && y < 0){
            return 3;
        } else if (x > 0 && y < 0){
            return 4;
        } else {
            return 0;
        }        
    }
}

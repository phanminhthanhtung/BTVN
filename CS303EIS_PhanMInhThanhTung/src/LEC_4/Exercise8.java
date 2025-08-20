package LEC_4;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = Double.parseDouble(sc.nextLine());
        System.out.print("Enter y: ");
        double y = Double.parseDouble(sc.nextLine());
        System.out.println("The point is in the " + quadrant(x, y) + " quadrant");
    }
    
    public static String quadrant(double x, double y){
        if (x > 0 && y > 0){
            return "1st";
        } else if (x < 0 && y > 0){
            return "2nd";
        } else if (x < 0 && y < 0){
            return "3rd";
        } else if (x > 0 && y < 0){
            return "4th";
        } else {
            return "axis";
        }        
    }
}

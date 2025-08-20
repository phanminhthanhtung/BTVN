package LEC_4;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        if (a > 0){
            QuadraticEquation(a, b, c);
        } else if (a == 0){
            System.out.println("This is a linear equation. The equation has one root: x = " + -(c / b));
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
    
    public static void QuadraticEquation(double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta == 0){
            System.out.println("The equation has a double root: x1 = x2 = " + (-b / (2 * a)));
        } else if (delta > 0){
            System.out.print("The equation has two distinct roots: x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println(" and x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}

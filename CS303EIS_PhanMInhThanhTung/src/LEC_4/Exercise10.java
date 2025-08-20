package LEC_4;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        x = Integer.parseInt(sc.nextLine());
        y = Integer.parseInt(sc.nextLine());
        z = Integer.parseInt(sc.nextLine());
        if (CheckTriangle(x, y, z)){
            if (CheckEquilateral(x, y, z)){
                System.out.println("This is an equilateral triangle.");
            } else if (CheckIsosceles(x, y, z)){
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle");
            }
        } else {
            System.out.println("These sides cannot form a triangle");
        }
    }
    
    public static boolean CheckTriangle(int x, int y, int z){
        if (x + y > z && x + z > y && y + z > x){
            return true;
        }
        
        return false;
    }
    
    public static boolean CheckEquilateral(int x, int y, int z){
        if (x == y && x == z && y == z){
            return true;
        }
        
        return false;
    }
    
    public static boolean CheckIsosceles(int x, int y, int z){
        if ((x == y || y == z || x == z) && !CheckEquilateral(x, y, z)){
            return true;
        }
        
        return false;
    }
}

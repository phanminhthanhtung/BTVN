package LEC_4;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = 42, y = 17, z = 25;
        
        if (y < x && y <= z){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        if (x % 2 == y % 2 || x % 2 == z % 2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        if (x <= y + z && x >= y + z){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        if (!(x < y && x < z)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        if ((x + y) % 2 == 0 || !((z - y) % 2 == 0)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        /*System.out.println();
        
        System.out.println(y < x && y <= z);
        System.out.println(x % 2 == y % 2 || x % 2 == z % 2);
        System.out.println(x <= y + z && x >= y + z);
        System.out.println(!(x < y && x < z));
        System.out.println((x + y) % 2 == 0 || !((z - y) % 2 == 0));*/
        
    }
}

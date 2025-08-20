package LEC_4;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, max;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        
        if (a > b && a > c){
            max = a;
        } else if (b > a && b > c){
            max = b;
        } else {
            max = c;
        }
        System.out.println(": The largest number is " + max);
    }
}

package LEC_4;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int result = (num >= 0)? num : num * (-1);
        System.out.println("The absolute value is " + result);
    }
}

package LEC_4;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}

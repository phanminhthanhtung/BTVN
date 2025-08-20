package LEC_4;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an interger: ");
        int num = sc.nextInt();
        System.out.println("Number: " + num);
        
        sc.nextLine(); //Clear any buffer from the previous line
        
        System.out.print("Enter an string: ");
        String str = sc.nextLine();
        System.out.println("String: " + str);
    }
}

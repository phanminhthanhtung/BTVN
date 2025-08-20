//Example of input an interger
package LEC_3;
import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input an interger
        System.out.print("Input an interger: ");
        int number = sc.nextInt();
        System.out.println("Number: " + number);
        
        sc.close();
    }
}

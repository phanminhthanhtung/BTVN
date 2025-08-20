//Example of input an boolean statement(only true/false)
package LEC_3;
import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input boolean statment(only true and \
        //false anything else will result in error)
        System.out.print("Input an boolean statement(true/false): ");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean: " + bool);
        
        sc.close();
    }
}

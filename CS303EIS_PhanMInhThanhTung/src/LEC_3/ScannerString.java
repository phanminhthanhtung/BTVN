//Example of input string(one or multiple words)
package LEC_3;
import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                        
        //Input an one word string(not char)
        System.out.print("Input an one word string: ");
        String sen = sc.next();
        System.out.println("One word string: " + sen);
        
        sc.nextLine(); //Clear buffer that the previous line has
        
         //Input an multiple words string(basically whole string)
        System.out.print("Input an multiple words string: ");
        String sentence = sc.nextLine();
        System.out.println("Multiple word: " + sentence);
        sc.close();
    }
}

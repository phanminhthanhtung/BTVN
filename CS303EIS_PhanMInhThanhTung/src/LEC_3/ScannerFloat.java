//Example of input an float or double
package Lec_3;
import java.util.Scanner;

public class ScannerFloat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Input an float
        System.out.print("Input an float: ");
        float num1 = sc.nextFloat();
        System.out.println("Float: " + num1);
        
        System.out.println();
        
        //Input an double
        System.out.print("Input an double: ");
        double num2 = sc.nextDouble();
        System.out.println("Double: " + num2);
        
        sc.close();
    }
}
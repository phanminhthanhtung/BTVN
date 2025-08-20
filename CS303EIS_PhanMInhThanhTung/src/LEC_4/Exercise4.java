package LEC_4;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Second number: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Operator: ");
        String operator = sc.nextLine();
        switch(operator){
            case "*": System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2)); break;
            case "+": System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2)); break;
            case "-": System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2)); break;
            case "/": if (num2 == 0){
                System.out.println("Equation cannot divided by 0!!!"); break;
            } else {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + ((num1 * 1.0) / (num2 * 1.0))); break;
            }
        }
    }
}

package LEC_5;
import java.util.*;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter a number from 1 to 10: ");
        int guess = sc.nextInt();
        while(guess < 1 || guess > 10){
            System.out.print("Invalid number, please try again: ");
            guess = sc.nextInt();
        }
        
        System.out.println("You entered the number: " + guess);
        
    }
}

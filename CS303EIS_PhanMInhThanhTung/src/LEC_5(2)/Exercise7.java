package LEC_5;
import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Your guess: ");
        int guess = sc.nextInt();
        int comp = rand.nextInt(101) + 1;
        System.out.println("*SECRET NUMBER IS: *" + comp);
        do {
            System.out.print("Your guess: ");
            guess = sc.nextInt();
            if (guess > comp){
                System.out.println("Your number is higher than the secret number");
            } else if (guess < comp){
                System.out.println("Your number is lower than the secret number.");
            }
        }while (guess != comp);
        
        System.out.println("Congratulations! You guessed correctly!");
    }
}

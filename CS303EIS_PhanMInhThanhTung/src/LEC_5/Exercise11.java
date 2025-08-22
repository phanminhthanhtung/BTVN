package LEC_5;
import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        do{    
            int num1 = rand.nextInt(6) + 1;
            int num2 = rand.nextInt(6) + 1;
            int index = 1, tries = 0;
            System.out.println("Roll " + (index++) + ": " + num1 + " and " + num2);
            tries++;
            if (num1 == num2){
                System.out.println("You rolled doubles after " + tries + " tries!   ");
                break; 
            }
        } while(true);
    }
}

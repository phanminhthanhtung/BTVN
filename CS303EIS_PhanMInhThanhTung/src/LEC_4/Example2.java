package LEC_4;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your score percentage: ");
            int percent = Integer.parseInt(sc.nextLine());

            if (percent >= 90){
                System.out.println("You got a A!");
            } else if (percent >= 80){
                System.out.println("You got a B!");
            } else if (percent >= 70){
                System.out.println("You got a C");
            } else if (percent >= 60){
                System.out.println("You got a D!");
            } else {
                System.out.println("You got a F!");
            }
        } catch (NumberFormatException ex){
            System.out.println("Input error");
        }
    }
}

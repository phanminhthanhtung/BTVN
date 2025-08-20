package LEC_4;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = Double.parseDouble(sc.nextLine());

        if (score >= 9.0){
            System.out.println("Excellent");
        } else if (score >= 8.0){
            System.out.println("Good");
        } else if (score >= 7.0){
            System.out.println("Fair");
        } else if (score >= 6.5){
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
    }
}

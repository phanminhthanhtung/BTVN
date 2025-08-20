package LEC_4;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        if (age >= 60){
            System.out.println("Senior");
        }else if (age >= 20){
            System.out.println("Adult");
        } else if (age >= 13){
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}

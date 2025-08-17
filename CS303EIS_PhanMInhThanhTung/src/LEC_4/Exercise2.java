package LEC_3;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = sc.nextLine();
        
        System.out.print("Input your age: ");
        int age = sc.nextInt();
        
        System.out.println("Hello " + name + ", you are " + age + " year old.");
    }
}

package LEC_4;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        for (String word : sen.split("\\s")){
            System.out.println(word);
        }

        sc.close();
    }
}

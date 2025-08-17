package LEC_4;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",|\n");
        System.out.print("Enter words seperated by ',': ");
        String sen = sc.nextLine();
        for(String str : sen.split(",")){
            System.out.println(str);
        }
        
        sc.close();
    }
}

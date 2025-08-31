package LEC_7;
import java.util.*;

public class CreateAnAcronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (String word : words){
            sb.append(word.charAt(0));
        }
        
        System.out.println(sb.toString());
    }
}

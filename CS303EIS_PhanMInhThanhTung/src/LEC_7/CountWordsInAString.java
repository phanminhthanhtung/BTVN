package LEC_7;
import java.util.*;

public class CountWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.trim().split("\\s+");
        int count = 0;
        for (String word : words){
            count++;
        }
        
        System.out.println("The number of words in the string is: " + count);
    }
}

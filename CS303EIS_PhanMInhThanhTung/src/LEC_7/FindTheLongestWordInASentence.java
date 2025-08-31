package LEC_7;
import java.util.*;

public class FindTheLongestWordInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");
        String longest = "";
        for (String word : words){
            if (word.length() > longest.length()){
                longest = word;
            }
        }
        
        System.out.println(longest);
    }
}

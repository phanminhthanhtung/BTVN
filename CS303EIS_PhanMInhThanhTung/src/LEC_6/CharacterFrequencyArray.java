package LEC_6;
import java.util.*;

public class CharacterFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string (lowercase letters only): ");
        String text = sc.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                freq[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char c = (char) (i + 'a');
                System.out.println(c + ": " + freq[i]);
            }
        }
    }
}

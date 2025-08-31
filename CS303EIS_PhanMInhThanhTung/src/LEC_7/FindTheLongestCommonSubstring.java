package LEC_7;
import java.util.*;

public class FindTheLongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        String shorter = (s1.length() < s2.length()) ? s1 : s2;
        String longer  = (s1.length() < s2.length()) ? s2 : s1;

        String longest = "";

        for (int i = 0; i < shorter.length(); i++) {
            for (int j = i + 1; j <= shorter.length(); j++) {
                String sub = shorter.substring(i, j);
                if (longer.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        
        System.out.println(longest);
    }
}

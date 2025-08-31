package LEC_7;
import java.util.*;

public class CheckForAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] t1 = sc.nextLine().toLowerCase().toCharArray();
        char[] t2 = sc.nextLine().toLowerCase().toCharArray();
        
        Arrays.sort(t1);
        Arrays.sort(t2);
        
        if (t1.length != t2.length){
            System.out.println("The two strings are not Anagrams.");
        }
        else{
            for (int i = 0; i < t1.length; i++){
                if (t1[i] == t2[i]){
                    System.out.println("The two strings are Anagrams.");
                    break;
                } else {
                    System.out.println("The two strings are not Anagrams.");
                    break;
                }
            }
        }
    }
}

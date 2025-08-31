package LEC_7;
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String rDupe;
        int count = 1;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= text.length(); i++){
            if (i < text.length() && text.charAt(i) == text.charAt(i - 1)){
                count++;
            } else {
                sb.append(text.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        System.out.println(sb.toString());
    }
}

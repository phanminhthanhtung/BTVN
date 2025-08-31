package LEC_7;
import java.util.*;

public class FormatANumberString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(text);
        for (int i = sb.length() - 3; i > 0; i-= 3){
            sb.insert(i, ",");
        }
        
        System.out.println(sb.toString());
    }
}

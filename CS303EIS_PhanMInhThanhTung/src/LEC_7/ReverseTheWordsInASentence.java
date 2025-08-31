package LEC_7;
import java.util.*;

public class ReverseTheWordsInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] temp = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--){
            sb.append(temp[i]);
            if (i != 0) sb.append(" ");
        }
        
        System.out.println(sb.toString());
    }
}

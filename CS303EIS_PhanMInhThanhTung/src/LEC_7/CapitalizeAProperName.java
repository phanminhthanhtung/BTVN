package LEC_7;
import java.util.*;

public class CapitalizeAProperName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String[] temp = name.trim().split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        for (String s : temp){
            sb.append(s.substring(0, 0x1).toUpperCase()); 
            sb.append(s.substring(0x1).toLowerCase());
            sb.append(" ");
        }
        
        System.out.println(sb.toString());
    }
}

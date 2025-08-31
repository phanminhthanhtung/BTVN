package LEC_7;
import java.util.*;

public class ParseDataFromAURL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        System.out.println("Protocol: " + url.substring(0, url.indexOf("://")));
        System.out.println("Domain: " + url.substring(url.indexOf("://") + 3, url.indexOf("/", 3 + url.indexOf("://"))));
        System.out.println("Path: " + url.substring( url.indexOf("/", 3 + url.indexOf("://"))));
    }
}

package LEC_4;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number(2-8): ");
        try {
            int dayN = Integer.parseInt(sc.nextLine());
            switch (dayN){
                case 2: System.out.println("Monday"); break;
                case 3: System.out.println("Tuesday"); break;
                case 4: System.out.println("Wednesday"); break;
                case 5: System.out.println("Thursday"); break;
                case 6: System.out.println("Friday"); break;
                case 7: System.out.println("Saturday"); break;
                case 8: System.out.println("Sunday"); break;
                default: System.out.println("Wrong input!!");
            }
        } catch (NumberFormatException ex){
            System.out.println("Error input!!");
        }
    }
}

package LEC_6;
import java.util.*;

public class ToDoListManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int choice;
        do{ 
            System.out.print("Enter a choice(0 to exit): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: AddTask(arr, sc); break;
                case 2: ShowTask(arr); break;
                case 3: RemoveTask(arr, sc); break;
            }
        } while(choice != 0);
    }
    
    public static boolean AddTask(ArrayList<String> arr, Scanner sc){
        System.out.print("Enter chores: ");
        return arr.add(sc.nextLine());
    }
    
    public static void ShowTask(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1)
                System.out.print(arr.get(i));
            else
                System.out.print(arr.get(i) + ", ");
}
    }
    
    public static String RemoveTask(ArrayList<String> arr, Scanner sc){
        System.out.print("Enter an index to remove (0 - " + (arr.size()) + ") : ");
        return arr.remove(sc.nextInt());
    }
}

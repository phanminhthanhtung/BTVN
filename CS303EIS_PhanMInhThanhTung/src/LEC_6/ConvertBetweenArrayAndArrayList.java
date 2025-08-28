package LEC_6;
import java.util.*;

public class ConvertBetweenArrayAndArrayList {
    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }

    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names = {"Ann", "Bob"};
        ArrayList<String> list = arrayToArrayList(names);
        System.out.println("Array to ArrayList: " + list);

        ArrayList<String> moreNames = new ArrayList<>(Arrays.asList("Charles", "David"));
        String[] array = arrayListToArray(moreNames);
        System.out.println("ArrayList to Array: " + Arrays.toString(array));
    }
}

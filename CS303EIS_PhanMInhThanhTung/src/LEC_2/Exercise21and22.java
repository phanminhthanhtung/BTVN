package LEC_2;

public class Exercise21and22 {
    
    public static void main(String[] args) {
        //Exercise 21
        int x1 = 1;
        int y1 = x1 + ++x1 - x1-- - x1++ + x1 - x1--;
        System.out.println("x = " + x1);
        System.out.println("y = " + y1);
        
        System.out.println("");
        
        //Exercise 22
        int x2 = 1;
        int y2 = x2 - x2-- - x2++ + x2-- - x2 + x2-- + x2;
        System.out.println("x = " + x2);
        System.out.println("y = " + y2);
    }
}

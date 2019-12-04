package Generics;

public class Generic {
    
    public static void main(String[] args) {
        Point<Integer> p1 = new Point(44,12);
        Point<Float> p2 = new Point(1.4,0.49);

        System.out.println(p1);
        System.out.println(p2);
    }
}
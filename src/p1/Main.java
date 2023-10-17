package p1;

public class Main {
    public static void main(String[] args) {
        boolean a1 = (5<6) || (4>6);
        System.out.println(a1);
        boolean a2 =  (5<6) || (4<6);
        System.out.println(a2);
        boolean a3 = (5<6) && (4>6);
        System.out.println(a3);
        boolean a4 = (5<6) && (4<6);
        System.out.println(a4);
        boolean a5 = (5<6) ^ (4>6);
        System.out.println(a5);
        boolean a6 = (5<6) ^ (4<6);
        System.out.println(a6);
        boolean a7 = (5<6) ^ (4>6);
        System.out.println(a7);
    }
}

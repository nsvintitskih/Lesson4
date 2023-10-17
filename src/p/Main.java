package p;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        boolean c = a == b; //false
        boolean d = a == 10; //true
        boolean e = a != b; //true
        boolean h = a != 10; // false
        //строгое неравенство
        boolean f = a < 10; //false
        boolean g = a < b; //false
        boolean n = a > b; //true
        //не строгое неравенство
        boolean m = a <= 10; //true
        boolean k = a >= b; //true
        //логические опрации
        boolean t = (a >= 10) & (a > b);//true
        boolean t1 = (a >= 10) & (a < b);//false
        boolean t2 = (a < 10) && (a > b);//false

        boolean p = (a >= 10) | (a > b);
        boolean p1 = (a >= 10) || (a > b);

        boolean q = !(a >= 10);//false
        boolean w = (a >= 10) ^ (a > b);
    }
}
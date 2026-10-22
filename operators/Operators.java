package operators;

public class Operators {
    public static void main(String args[]){
        //Explicit Type casting
        float a = 1;
        int x = (int)a;
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(((Object)x).getClass().getSimpleName());
        System.out.println(a);
        System.out.println(x);
        int y1 = 1921222;
        short y2 = (short)y1;
        System.out.println(y2);
        byte a1 = 127;
        short a2 = 128;
        System.out.println(a1);
        System.out.println(a2);
        short z1 = 10;
        short z2 = 30;
        short z3 = (short)(z1 * z2);
        System.out.println(z3);
        

    }
}
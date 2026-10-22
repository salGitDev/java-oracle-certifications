package primitives;
public class Primitives {

    public static void main(String args[]){
        int num = 10;
        System.out.println(Integer.MAX_VALUE + Integer.MIN_VALUE);
        //long max1 = 312123423423; will not compile
        long max2 = 312_123_423_424L;
        System.out.println(max2);
        int binary1 = 0b00101111;
        int octal1 = 057;
        int dec1 = 47;
        int hex1 = 0x2F;
        System.out.println(binary1);
        System.out.println(octal1);
        System.out.println(dec1);
        System.out.println(hex1);
        
    }
} 
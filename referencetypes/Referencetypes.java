package referencetypes;
import java.util.Date;


public class Referencetypes {
        
    public static void main(String args[]){
        String s1 = new String("Salieu");
        String s2 = new String("Salieu");
        Date date;
        String name;
        date = new Date();
        name = "Salieu";
        System.out.println(date.getDate());
        System.out.println(name.toLowerCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); //point to the same obj
    }
}
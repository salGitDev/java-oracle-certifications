package loops;

public class FirChar {
    public static void main (String args[]){
        FIRST_CHAR_LOOP : for (int a = 1; a <= 4; a++){
            for (char c = 'a'; c <= 'c'; c++){
                if (a == 2 || c == 'b')
                    continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + c);
                
            }
        }
    }
}
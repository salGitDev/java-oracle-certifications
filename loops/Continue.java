package loops;
public class Continue {
    public static void main (String args[]){

        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                continue;
                
                
            } else {
                System.out.println(i);
            }
        }

    }
    /**The BREAK:
                 * The break transfers the control statement to the elclosing statement and exit out of the loop
                 * 
                 * The Continue:
                 * The continue transfers the control statement to the boolean expression that determines if the loop should continue
      */
}
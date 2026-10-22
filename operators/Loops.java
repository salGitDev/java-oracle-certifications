package operators;
public class Loops{
    public static void main(String args[]){
        /**
         int x = 2;
         int y = 5;
         while (x < 10) 
         y++
         the code will lead inot an infinite loop

         do {
         Do this first
         } while();
         */
        int x = 5;
        while (x > 0){
            System.out.println("I have counted " + x);
            x--;
        }
        int x1 = 0;
        do {
            x1++;
        } while(false);
        System.out.println(x1);
        for (int i = 0; i < 10; i++){
            System.out.println(i + " ");
        }
    
    }
}
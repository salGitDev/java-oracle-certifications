package extwoqa;
public class Extwoqa {
    public static void main (String args[]){
        /**
         * Expected Questions
         * Q1. Which of the followning Java operators can be used with boolean variables? (Choose all tha apply)
         * A. ==  B. + C. -- D. !  E. % F. <=
         * 
         * Ans: AD
         * 
         * 
         * Q2. What data type (or types) will allow the following snippet to compile? (Choose all that apply)
         byte x = 5;
         byte y = 10;

        ___ z = x + y;
        A. int B. long C. boolean D. double E. short F. byte 

        Ans: ABD the data type is promoted to int during compilation byte -> int -> long -> double



        Q3.What is the output of the following application?
        A. Greater than, 10
        B. false, 10
        C. Greater than, 11
        D. false, 11
        E. The code will not compile because of line 34.
        F. The code will not compile because of line 35.

        Ans: F   actually trying to store a boolean type to a String
         */
        //Q3.
/* 
        int x = 0;
        while (x++ < 10){}  //code at line 34
        String message = x > 10 ? "Greater than" : false; //code at line 35
        System.out.println(message + ", " + x);

*/
        //Q4.
       // Ans: BCDF
        /*
        What change would allow the following code snippet to compile? (Choose all that apply)
        long x = 10; L3
        int y = 2 * x; L4

        A. No change; it complies as is
        B. Cast x on line 4 to in
        C. Change the data type of x on line 3 to short
        D. Cast 2 * x on line 4 to int
        E. Change the data type of y on line 4 to short
        F. Change the data type of y on line 4 to long
        Q5 skipped

        Q6. Which is the output of the following code snippet?
        A. Too Low B. Just Right C. Too High  
        D. Compiles but throws a NullPointerException
        E. The code will not compile because of line 6
        F. The code will not compile because of line 7
        */
      /* int x = 4; //L3
       long y = x * 4 - x++; // L4
       if(y < 10) System.out.println("Too Low"); //L5
       else System.out.println("Just Right"); //L6
       else System.out.println("Too High"); //L7
      */
//Q. 7
/* Ans: D
What is the output of the following code?
A. 5 B. 4 C. 10 D. 8 E. 7 F. The code will not compile because of line 4

*/
/*int x = 5; //L3
System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); //L4
//System.out.println((x > 2) ?( x < 4 ? 10 : 8) : 7); //L4*/

//Q. 8 What is the output of the following code snippet?
/*


*/
//Q8.
boolean x = true, z = true; //L3
int y = 20; //L4
x = ( y != 10) ^ (z = false);
System.out.println(x + ", " + y + ", " + z);
    }
}
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
//Q8. Ans: B
/*boolean x = true, z = true; //L3
int y = 20; //L4
x = ( y != 10) ^ (z = false); 
System.out.println(x + ", " + y + ", " + z); */
//Q12. What is the output of the following code snippet?
//Ans: D
/*
A. Success B. Failure C. The code will not compile because of line 4 D. The code will not compile because of line 5*/
/*int x = 0;
String s = null; //L4
if (x == s) System.out.println("Success"); //L5
else System.out.println("Failure"); */

//Q13. What is the output of the following code snippet?
/*
Ans: A
A. Success B. Failure Cd. The Code will not compile because of line 4. D. The code will not compile because of line 5.
*/
/* 
int x1 = 50, x2 = 75;
boolean b = x1 >= x2; //L4
if (b = true) System.out.println("Success");
else System.out.println("Failure");
*/
//Q14. What is the output of the following code snippet?
/*int c = 7; 
int result = 4;
result += ++c; //L5
System.out.println(result);*/
//Q15. What is the output of the following code snippet? Ans E no parenthesis
/*int x = 1, y = 15; //L3
while x < 10 //L4
y--;
x++;
System.out.println(x + ", " + y);*/


//Q16. What is the output of the following code snippet? Ans D. y is out of the scope at line 6
/* 
A. 1 2 3 4 5 6 7 8 9 B. 1 2 3 4 5 6 7 8 9 10 C. 1 2 3 4 5 6 7 8 9 10 11 D. The code will not compile because of line 6
E. The code contains an infinite loop and does not terminate.

do {
int y = 1;
System.out.print(y++ + " ");

} while (y <= 10); 
*/
//Q17. What is the output of the following code snippet?
//Ans: A. 7 B. 9 C. 10 D. 11 E. 15 F. The code will not compile because of line 8 Ans. D
{ //b1
boolean keepGoing = true;
int result = 15, i = 10;
do {
    i--; // i = 9
    if (i == 8) keepGoing = false;
    result -= 2; //Line 8 result = 13
 } while (keepGoing);
    System.out.println(result);
} //b2
{
//Q18. What is the output of the following code snippet?
//A. 1 B. 2. C. 3 D. 4 E. 6 F. The code will not compile because of line 6 Ans A.
int count = 0;
ROW_LOOP: for (int row = 1; row <= 3; row++)
    for (int col = 1; col <= 2; col++){
        if (row * col % 2 == 0) continue ROW_LOOP; //L6
        count++;
    }
    System.out.println(count);
}
//Q19. What is the result of the following code snippet? Ans:
int m = 9, n = 1, x =0;
while (m > n){
    m--;
    n += 2;
    x += m + n; //L7
}
System.out.println(x);
/*
A. 11 B. 13 C. 23 D. 36 E. 50 F. The conde will not compile because of line 7 Ans D
*/
//Q20. What is the result of the following code snippet?
final char a = 'A', d = 'D'; //L3
char grade = 'B';
switch ((grade)) {
    case a: //L6

       case 'B': System.out.print("great");
       case 'C': System.out.print("Good"); break;
       case d: //L9
       case 'F': System.out.print("not good");
}
/*
A. great B. greatgood C. The code will not compile because of line 3 D. The code will not compile because of line 6 
E. The code will not compile because of line 6 and 9
*/

    }
}
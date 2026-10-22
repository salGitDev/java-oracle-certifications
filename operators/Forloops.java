package operators;

public class Forloops {
    public static void main (String args[]){
        int x = 0;
        for (long y = 0, z = y; x < 5 && y < 10; x++, y++){
            System.out.println(y + " ");
        }
    }
}

/*
  3. the code will not compile
  int x = 0;
  for (long y = 0; x = y; x < 5 && y < 10; x++, y++){
  soph(x);
  }
  x because x is reinitialized from int to long
 
  
 
 4. This code will not compile
 for (long y = 0; int x = y; x < 5; && y < 10; x++, y++){
 soph(x + " ");
 }
 Changing the data type is not accepted here


 5.using the local loop variable outside the loop

 for (long y = 0, x = y; x < 5 && y < 10; x++, y++){
 soph( y + " ");
 }
 */
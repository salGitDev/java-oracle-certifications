package strings;
/*
AGENDA
1. Creating Strings
2. Concatenation
3. Immutability
4. The String Pool
5. Important of String Methods
6. Method Chaining
 */
public class Strs {
    public static void main (String args[]){
        //1. Creating Strings
        String str1 = "Fluffy";
        String str2 = new String("Fluffy");
        System.out.println(str1);
        System.out.println(str2);
        //2. Concatenation
        {
            String x = 10 + "24";
            System.out.println(x);
            
        }
        System.out.println(1 + 2); //Both operands are integers, the result is an integer 3
        System.out.println("a" + "b"); //Both operands are strings, the result is a string ab
        System.out.println("a" + "b" + 3); //Any operand is a string, the result is a string ab3
        System.out.println(1 + 2 + "c"); // The code execute from left to right 3c
    {
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // ans 64 execute from left to right addition of int first before cocatenation 
    }
    {
        //3. Immutability
        String s = "a";
        s += "b";
        System.out.println(s);
    }

    {
        //4. The String Pool
        String a = "abc";
        String b = "abc";
        String c = new String("abc"); //a new object gets created
        String s = "Animals";
        //5. String charAt

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
       // System.out.println(s.charAt(9));
       
       //6. indexOf()

       System.out.println(s.indexOf('a'));
       System.out.println(s.indexOf("al"));
       System.out.println(s.indexOf('a', 4));
       System.out.println(s.indexOf("al", 5));
       System.out.println(s.indexOf('m'));

       // 7. subsring()

       System.out.println(s.substring(3));
       System.out.println(s.substring(2, 4)); //from index 2 to index (4 - 1)
       System.out.println(s.length());

       // 8. length()
       int strStore = s.length();
       System.out.println(strStore);
       System.out.println("KaDija".substring(2, 6));
       System.out.println("KaDija".substring(2));
       System.out.println("KaDija".toUpperCase());
       System.out.println("PEBBLES".toLowerCase());
       System.out.println("KaDija".substring(2, 2));
       System.out.println("KaDija".substring(2, 2) +'i');
       //System.out.println("KaDija".substring(2, 1)); Exception erroe. Will compile but will encountered execution erroe
       //System.out.println("KaDija".substring(2, 1)); Exception erroe. Will compile but will encountered execution erroe
    }

    //10 equals() check for the same characters and equalsIgnoreCase() ignore case sensitivity
    {
        String s1 = "Ibrahim";
        String s2 = "IBRAHIM";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

         //11 startsWith()

        System.out.println("Start with");
        System.out.println(s1.startsWith("I"));
        System.out.println(s1.startsWith("Ib"));

        //12 endsWith()
        System.out.println("Ends with");
        System.out.println(s1.endsWith("im"));
        System.out.println(s1.endsWith("m"));
        System.out.println(s1.endsWith("I"));

        //13 contains

        System.out.println(s2.contains("k"));
    }
    {
        //14. replace()
        String s1 = "Doe";
        String s2 = s1.replace("D", "J");
        System.out.println(s2);
        System.out.println("Is s1 mutated?");
        System.out.println(s1);

        //15. trim()
        System.out.println("See trim below");
        String s3 = "\t       abc   \n";
        System.out.println(s3);
        System.out.println("removing white space at s3");
        System.out.println(s3.trim());

        //16. finally method chaining()
        System.out.println("Chaining starts here");
        String mtdChain = s3.trim().replace("c", "cdef").toUpperCase();
        System.out.println(mtdChain);
        
    }


        
    }
}
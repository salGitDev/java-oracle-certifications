package operators;
public class LogicalOp {
    
    public static void main(String args[]){
        //Numeric data type promotion
        
        System.out.println(5 == 5.000);
        System.out.println(((Object)(5 == 5.000)).getClass().getSimpleName());
        boolean y = false;
        boolean x = (y = true);
        System.out.println(y);
        System.out.println(x);

    }
}
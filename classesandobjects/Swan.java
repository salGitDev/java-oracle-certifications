package classesandobjects;
public class Swan {
    int numberofEggs; //instance variable
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberofEggs  = 1; //set variable
        System.out.println(mother.numberofEggs);
    }
}
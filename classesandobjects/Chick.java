package classesandobjects;

public class Chick {
private String name = "Fluffy"; //N/A

{
    System.out.println("Setting the field"); //1st
}

public Chick(){
    name = "Duke"; //3rd
    System.out.println("I am constructor!! and we are setting the name field"); //2nd
}

    public static void main(String args[]){
     Chick chick = new Chick();
     System.out.println(chick.name);

    }
}
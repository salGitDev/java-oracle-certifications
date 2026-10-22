package sampleinitializers;
public  class SampleInitializer { //Code block 1
    public static void main(String args[]) {  //code block 2
        System.out.println("Feathers!!");
        
    }
    { //code block 3 this code block will never run bcoz it's and INSTANCE INITIALIZER
        System.out.println("Snowy!");
    }
    static {
        System.out.println("Static initializer and will run");
    }
}
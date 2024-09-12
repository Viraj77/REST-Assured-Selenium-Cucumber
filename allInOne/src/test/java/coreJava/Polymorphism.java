package coreJava;

public class Polymorphism {
    void run(){System.out.println("Running");}
}

class Splendor extends Polymorphism{

    void run(){System.out.println("running safely with 60KM");}

    public static void main(String args[]) {

        //This is also called as dynamic binding
        Polymorphism p = new Splendor();
        p.run();


        //This is static binding
        Polymorphism p1 = new Polymorphism();
        p1.run();
    }
}

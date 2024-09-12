package coreJava;

public class OverloadingAndOverriding {

    //Overloading
    static int add(int a, int b){return a+b;}
    static int add(int a, int b, int c){return a+b+c;}
    static double add(double a, double b){return a+b;}


    //Overriding
    void run(){System.out.println("This is Parent class method");}

}


class Test extends  OverloadingAndOverriding{

    void run(){System.out.println("This is child class method");}
    public static void main(String args[]){
        //Overloading
        System.out.println(OverloadingAndOverriding.add(1,1));
        System.out.println(OverloadingAndOverriding.add(1,1,2));
        System.out.println(OverloadingAndOverriding.add(1.1,1.2));


        //Overriding
        Test obj = new Test();
        obj.run();

        OverloadingAndOverriding obj1 = new OverloadingAndOverriding();
        obj1.run();
    }
}

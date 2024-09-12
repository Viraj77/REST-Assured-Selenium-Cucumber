package coreJava;

public class JavaMathClass {

    public static void main(String ars[]){
        double x = 28;
        double y = 4 ;

        //Max and min number
        System.out.println("Maximum Number of x and y is : "+Math.max(x,y));
        System.out.println("Minmum Number of x and y is : "+Math.max(x,y));

        //Square root of y
        System.out.println("Maximum Number of x and y is : "+Math.sqrt(y));

        //returns 28 power of 4
        System.out.println("Maximum Number of x and y is : "+Math.pow(x,y));

        //returns logarithm
        System.out.println("Maximum Number of x and y is : "+Math.log(x));
        System.out.println("Maximum Number of x and y is : "+Math.log(y));

        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));

        // return the log of x + 1
        System.out.println("log1p of x is: " +Math.log1p(x));

        // return a power of 2
        System.out.println("exp of a is: " +Math.exp(x));

        // return (a power of 2)-1
        System.out.println("expm1 of a is: " +Math.expm1(x));
    }
}

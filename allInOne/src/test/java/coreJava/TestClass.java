package coreJava;

import org.testng.annotations.Test;

//Test class to test all the OOPS concepts
public class TestClass {

    //Test method for data encapsulation
    @Test
    public void encapsulationTest () {
        //create the object of the class
        Encapsulation e = new Encapsulation();

        //Set the values
        e.setAcc_no(7560504000L);
        e.setName("Viraj Maheta");
        e.setEmail("test@test.com");
        e.setAmount(50000f);

        //Get the values
        System.out.println("Account No : "+e.getAcc_no());
        System.out.println("Name : "+e.getName());
        System.out.println("Email : "+e.getEmail());
        System.out.println("Amount : "+e.getAmount());

    }
}

package coreJava;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    //public String s = "Viraj Maheta \n +91-9638454477 \n 7 Anant Society part -1 \n Gomtipur \n Ahmedabad";
    public String s = "Viraj Maheta  919638454477  7 Anant Society part 1  Gomtipur  Ahmedabad";
    Pattern pt;
    Matcher mt;
    public void matchRegEx(String s){
        String re = "([A-Za-z0-9]+( +[A-Za-z0-9]+)+)";
        pt = Pattern.compile(re, Pattern.CASE_INSENSITIVE);
        mt = pt.matcher(s);

        boolean result = mt.matches();
        System.out.println(result);

        //String s2 [] = s.split("\\n");

      /*  for(String s3 : s2){
            if(s3.contains("4544")){
                System.out.println("Found");
            }else{
                System.out.println("Not found");
            }
        }*/

    }

    @Test
    public void testRegEx(){
        matchRegEx(s);
    }
}

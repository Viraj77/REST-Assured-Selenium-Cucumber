package coreJava;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringOperations {

    public String s = "Viraj Maheta Automation Lead";
    public String x = "VirajMahetaQAAutomationLead";

    public void identify_smallest_word(String s) {
        List<String> words = Arrays.asList(s.split(" "));

        String shortestWord = words.stream().min(
                        Comparator.comparing(word -> word.length())).get();
        System.out.println(shortestWord);
    }

    public void identify_biggest_word(String s) {
        List<String> words = Arrays.asList(s.split(" "));

        String shortestWord = words.stream().max(Comparator.comparing(word -> word.length())).get();
        System.out.println(shortestWord);
    }

    public void reverse_String(String s){
        String reverseString="";

        for(int i = s.length() -1; i >= 0 ;i--){
            reverseString += s.charAt(i);
        }
        System.out.println("Reversed String : "+reverseString);
    }

    public void find_duplicate_char(String s){
        s.toLowerCase();
        char[]  character = s.toCharArray();

        boolean isNotDuplicate = false;

        for (int i = 0; i < s.length(); i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < s.length(); j++) {
                if (character[i] == character[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.println(character[i]);
                isNotDuplicate = true;
            }
        }

        if(!isNotDuplicate){
            System.out.println("No Duplicates found");
        }

    }

    @Test
    public void test_scenarios(){
        identify_smallest_word(s);
        identify_biggest_word(s);
        find_duplicate_char(x);
        reverse_String(s);
    }
}

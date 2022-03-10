package day22_MultiDAArray;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseSentence {


    /*
    
    intellij loops shortcuts
        iter    Iterate (for each..in) 
        itin    Iterate (for..in) 
        itli    Iterate over a List
        itar    Iterate elements of array 
        ritar   Iterate elements of array in reverse order 
    
     */
    public static void main(String[] args) {

        // a program that reverse a sentences

        String sentence = "today is a good day to learn java";
        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        
        String revSentence = "";
        

        for (int i = words.length - 1; i >= 0; i--) {
            revSentence += words[i] + " ";
        }
        System.out.println("revSentence = " + revSentence ) ;
    }
}


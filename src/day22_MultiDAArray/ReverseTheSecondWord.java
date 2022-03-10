package day22_MultiDAArray;

import java.util.Arrays;

public class ReverseTheSecondWord {

    public static void main(String[] args) {
        
        // program that reverse the second word in a sentence 
         String sentence = "I love Java";
         
         String [] words = sentence.split( " ");
         String reverse ="";

         for (int i = words[1].length() - 1; i >= 0; i--) {
            reverse += words[1].charAt(i);

         }
        System.out.println("reverse = " + reverse);

        String newSentences = sentence.replaceFirst(words[1], reverse );

        System.out.println("newSentences = " + newSentences);

        System.out.println("---------------------------");



        String sentence2 = "I am doing great";

        String [] word2 = sentence2.split(" ");

        System.out.println(Arrays.toString(word2)); // reverse the third word.

        String reverse2 = "";

        for (int i = word2[2].length()-1; i >= 0 ; i--) {
            reverse2 += word2[2].charAt(i);

        }
        System.out.println("reverse2 = " + reverse2);
        String newSentence2 = sentence2.replaceFirst(word2[2], reverse2);

        System.out.println(newSentence2);

    }
}

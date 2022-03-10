package day16_ForLoopAndString;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.Scanner;

public class ReverseAString {

    /*
            Following are some interesting facts about String and StringBuilder classes :
        1. Objects of String are immutable.
        2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method.
        3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.


     */

        // java program to reverse a word

    public static void main (String[] args) {

        String str= "Geeks", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);

        /*

        1. The idea is to traverse the length of the string
        2. Extract each character while traversing
        3. Add each character in front of the existing string

         */
    }
}

        // Java program to ReverseString using StringBuilder


        // Class of ReverseString
class ReverseStringStringBuilder {
    public static void main(String[] args)
    {
        String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);

        /*
        Using built in reverse() method of the StringBuilder class:
        String class does not have reverse() method, we need to convert the input string to StringBuilder, which is achieved by using the append method of StringBuilder.
        After that, print out the characters of the reversed string by scanning from the first till the last index.


         */

    }
}

        // Java program to Reverse a String  by
        // converting string to characters  one
        // by one
        // Class of ReverseString
class ReverseStringArray {
    public static void main(String[] args)
    {
        String input = "GeeksForGeeks";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);

        /*
        Converting String to character array: The user input the string to be reversed.
            Method:
            1. First, convert String to character array
               by using the built in Java String class
               method toCharArray().
            2. Then, scan the string from end  to start,
               and print the character one by one.


         */


    }
}
class EU8Reverse{
    public static void main(String[] args) {

        /*
        String str = "Wooden Spoon";
        String result = "";
//        char a ;

        for (int i = str.length()-1  ; i >= 0 ; i--) {
//             a = str.charAt(i);
//             result += a +"";

             result +=str.charAt(i);
        }
        System.out.println(result); // output noopS nedooW

         */

        /*
        String str2 = "Ahmet Coskun Acik";
        String resultA = "";
        for (int i = str2.length()-1; i >= 0; i--) {
            resultA += str2.charAt(i);

        }
        System.out.print(resultA);

         */

        /*
        String str3 = "Mehmet Alperen Acik";

        String result3="";

        for ( int i = str3.length()-1; i >=0; i--){

            result3 += str3.charAt(i);

        }
        System.out.println(result3);


         */

        String word = "Level";
         String reversed = "";

         for (int i = word.length()-1; i >=0; i--) {

             reversed += word.charAt(i);


         }
         boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);

    }

}

class EU8RemoveDuplicates{
    public static void main(String[] args) {

        /*
        String str = "aabbaacc";
        String result = "";


        for (int i = 0; i <= str.length()-1; i++) {

            String ch= "" + str.charAt(i);
            if (!result.contains(ch))
            result += ch;

        }
        System.out.println("result = " + result);


         */

        String str2 = "abcabcabcddeffgg";
        String result2 = "";

        for (int i =0; i <str2.length(); i++) {
             String ch ="" + str2.charAt(i);

            if (! result2.contains(ch)) {
                result2 += ch;

            }
        }
        System.out.print(result2);




    }
}

class EU8ReturnUniqueCharacters {
    public static void main(String[] args) {

        /*
        String str = "aaabccc";
        String result = "";
        

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
       
        }
        System.out.println("result = " + result);


         */

        String str1 = "aabbccddeeffghjjj";
        String result1 = "";

        for (int i =0; i <str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str1.indexOf(ch) == str1.lastIndexOf(ch)){
                result1+= ch;

            }
        }
        System.out.println("result1 = " + result1);



    }


}


class EU8DigitLettersSpecialChars{

    public static void main(String[] args) {

        String str = "Cydeo 12345School !@#$% WoodenSpoon";

        String digits = "";
        String letters="";
        String specialChars = "";

        for (int i =0; i < str.length(); i++ ) {

            char ch = str.charAt(i);
            if ( ch >='0' && ch <='9'){
                digits += ch;

            }
            else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ) {

                letters +=ch;
            }
            else {
                if (ch != ' ') {
                    specialChars += ch;
                }

            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }

}



        // Java program to demonstrate conversion from
        // String to StringBuffer and reverse of string

class Test {
    public static void main(String[] args)
    {
        String str = "Geeks";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);

        /*
        Using StringBuffer: String class does not have reverse() method, we need to convert the input string to StringBuffer,
        which is achieved by using the reverse method of StringBuffer.


         */
    }
}

class Main {
    public static void main(String[] args) {

        // create a string
        String name = "Programiz";

        System.out.println("Characters in " + name + " are:");

        // loop through each element
        for(int i = 0; i<name.length(); i++) {

            // access each character
            char a = name.charAt(i);
          System.out.print(a + ", ");
//          System.out.print( name.substring(i,i+1) + "," );
           /*
            In the above example, we have used the for-loop to access each element of the string. Here, we have used the charAt() method to access each character of the string.



             */



        }
    }
}
class ForLoopWithString101_Backwards {
    public static void main(String[] args) {

        String word = "repaid";

        for (int i = word.length()-1; i> 0; i--) {
            System.out.println(word.charAt(i));
        }



    }
}
class ForLoopWithString102_Reverse {
    public static void main(String[] args) {

        String word = "repaid";

       int len = word.length() - 1;

        for(int i =0; i<word.length();i++)

        {
            System.out.print(" " + word.charAt(len - i));
        }
}
}

class ForLoopWithString103_Counters {
    public static void main(String[] args) {

        String word = "corroborator";

        int rCount = 0;

        for(int i =0; i<word.length();i++) {
            if (word.charAt(i) == 'r') {
                rCount++;
            }
        }

        System.out.print("your word has " + rCount + " r`s in it!");

    }

}
 class ForLoop104Sum {
public static void main(String[]args){

    Scanner scan = new Scanner(System.in);
    System.out.println("how many grades you would like to enter --> ");
    int times = scan.nextInt();
    int sumOfGrades = 0;

    for (int i = 1; i <= times ; i++) {
        System.out.println("Enter grade " +i +" --> " );
        int grade = scan.nextInt();
        sumOfGrades += grade; }
        System.out.println("The sum of the grades is " + sumOfGrades);



    }

}

package day5_Concatenation;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {

    /*String Concatenation in Java,
        In Java, String concatenation forms a new String that is the combination of multiple strings. There are two ways to concatenate strings in Java:

        1 By + (String concatenation) operator
        2 By concat() method

        1) String Concatenation by + (String concatenation) operator

        Java String concatenation operator (+) is used to add strings. For Example:
            */
    public static void main(String args[]) {
        String s = "Ahmet " + " Ak";
        System.out.println(s);//Ahmet  Ak
    }

    /*2) String Concatenation by concat() method
    The String concat() method concatenates the specified string to the end of current string. Syntax:



    public String concat(String another)
    Let's see the example of String concat() method.

    TestStringConcatenation3.java
        */
    public class TestStringConcatenation3 {
        public static void main(String args[]) {
            String s1 = "Ahmet";
            String s2 = "Ak";
            String s3 = s1.concat(s2);
            System.out.println(s3);//Ahmet  Ak
        }

    }

    //String concatenation using StringBuilder class
    //StringBuilder is class provides append() method to perform concatenation operation.
    // The append() method accepts arguments of different types like Objects, StringBuilder, int, char, CharSequence, boolean, float, double.
    // StringBuilder is the most popular and fastet way to concatenate strings in Java.
    // It is mutable class which means values stored in StringBuilder objects can be updated or changed.

    public class StrBuilder {
        /* Driver Code */
        public static void main(String args[]) {
            StringBuilder s1 = new StringBuilder("Hello");    //String 1
            StringBuilder s2 = new StringBuilder(" World");    //String 2
            StringBuilder s = s1.append(s2);   //String 3 to store the result
            System.out.println(s.toString());  //Displays result
        }
    }

    //String concatenation using format() method
    //String.format() method allows to concatenate multiple strings using format specifier like %s followed by the string values or objects.

    public class StrFormat {
        /* Driver Code */
        public static void main(String args[]) {
            String s1 = new String("Hello");    //String 1
            String s2 = new String(" World");    //String 2
            String s = String.format("%s%s",s1,s2);   //String 3 to store the result
            System.out.println(s.toString());  //Displays result
        }
    }

    //String concatenation using String.join() method (Java Version 8+)
    //The String.join() method is available in Java version 8 and all the above versions.
    // String.join() method accepts arguments first a separator and an array of String objects.

    public class StrJoin {
        /* Driver Code */
        public static void main(String args[]) {
            String s1 = new String("Hello");    //String 1
            String s2 = new String(" World");    //String 2
            String s = String.join("",s1,s2);   //String 3 to store the result
            System.out.println(s.toString());  //Displays result
        }
    }


    //String concatenation using StringJoiner class (Java Version 8+)
    //StringJoiner class has all the functionalities of String.join() method. In advance its constructor can also accept optional arguments, prefix and suffix.
    public class StrJoiner {
        /* Driver Code */
        public static void main(String args[]) {
            StringJoiner s = new StringJoiner(", ");   //StringeJoiner object
            s.add("Hello");    //String 1
            s.add("World");    //String 2
            System.out.println(s.toString());  //Displays result
        }
    }


    //String concatenation using Collectors.joining() method (Java (Java Version 8+)
    //The Collectors class in Java 8 offers joining() method that concatenates the input elements in a similar order as they occur.

    public class ColJoining {
        /* Driver Code */
        public static void main(String args[]) {
            List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array
            String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
            System.out.println(str.toString());  //Displays result
        }
    }
}

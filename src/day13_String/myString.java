package day13_String;

import java.util.Scanner;
import java.lang.String;
import java.lang.*;

public class myString {

        //    Here is the syntax for a ternary operator in Java:
        //
        //    variable = (expression) ? expressionIsTrue : expressionIsFalse;

    public static void main(String[] args) {
        String x = "Hello world";
        String y = new String("Flash point");

        System.out.println(x.charAt(6));

        String textCase = "uppercase";
        String firstName = textCase.equals("uppercase") ? "JOHN" : "john";
        System.out.println(firstName);

        
        int val1 = 10;
        int val2 = 20;
        int max = val1 >= val2 ? val1 :val2;
        System.out.println("max : " + max);

        int min = val1 <= val2 ? val1 :val2;
        System.out.println("min : " + min);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an input!");


        String input = scan.nextLine();
        int value = input == null ? -1 : input.equals("") ? 0 : Integer.parseInt(input);
        System.out.println(value);



        int num = 8;   // Here we have assigned a value to msg based on the conditional evaluation of num.
        String msg = "";
        if(num > 10) {
            msg = "Number is greater than 10";
        }
        else {
            msg = "Number is less than or equal to 10";
        }
        System.out.println("msg is ; " + msg);

        // We can make this code more readable and safe by easily replacing the if-else statement with a ternary construct:
        final String msg1 = num > 10   ? "Number is greater than 10" : "Number is less than or equal to 10";

        System.out.println("msg1 is ; " + msg1);

        // Nesting Ternary Operator
        //It's possible for us to nest our ternary operator to any number of levels of our choice.
        //
        //So, this construct is valid in Java:

        String msg2 = num > 10 ? "Number is greater than 10" : num > 5 ? "Number is greater than 5" : "Number is less than equal to 5";
        System.out.println("msg2 is ; " + msg2);


        String msg3 = num > 10 ? "Number is greater than 10" : (num > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
        System.out.println("msg3 is ; " + msg3);

    }
}

 /* 1) Length
        The length is the number of characters that a given string contains. Java has a length() method that gives the number of characters in a String.

        Given below is the programming Example.

  */


class Length_StringMethods {

    public static void main(String[] args) {
        String str = "Saket Saurav";
        System.out.println(str.length());


        String s1="hello";
        String s2="whatsup";
        System.out.println("string length is: "+s1.length());
        System.out.println("string length is: "+s2.length());
    }
}


 /* #2) Concatenation
        Although Java uses a ‘+’ operator for concatenating two or more strings.
        A concat() is an inbuilt method for String concatenation in Java.

        Example of how we can use the concat() method in our programs is given below.


  */

 class Concatenation_StringMethods {

    public static void main(String[] args) {

        String str1 = "Software";
        String str2 = "Testing";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

        String s1="hello";
        s1=s1.concat(" how are you");
        System.out.println(s1); //The above code returns “hello how are you”.


    }
}




/* #3) String to CharArray()
        This method is used to convert all the characters of a string into a Character Array. This is widely used in the String manipulation programs.


 */


 class StringToCharArray_StringMethods {

    public static void main(String[] args) {

        String str = "Saket";
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (int i= 0; i< chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

}

/* #4) String charAt()
        This method is used to retrieve a single character from a given String.

        The syntax is given as:

        char charAt(int i);
        The value of ‘i’ should not be negative and it should specify the location of a given String i.e. if a String length is 5, then the value of ‘i’ should be less than 5.

        Given below is the program that will demonstrate how the charAt() method retrieves a particular character from the given String.

        In this program, we have taken a String called “java string API” and we will try to retrieve the characters present at different indexes.


 */


 class StringMethods {

    public static void main(String[] args) {

        String str = "java string API";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(6));

        // Now in the same program, if we try
        //
        //System.out.println(str.charAt(50));
        //
        //Or
        //
        //System.out.println(str.charAt(-1));
        //
        //Then it will throw “java.lang.StringIndexOutOfBoundsException:”.
    }

}
/* #5) Java String compareTo()
        This method is used to compare two Strings. The comparison is based on alphabetical order.
        In general terms, a String is less than the other if it comes before the other in the dictionary.


 */


 class CompareTo_StringMethods {

    public static void main(String[] args) {

        String str1 = "Zeus";
        String str2 = "Chinese";
        String str3 = "American";
        String str4 = "Indian";

        System.out.println(str1.compareTo(str2));
        //C comes 23 positions before Z, so it will give you 23
        System.out.println(str3.compareTo(str4));
        // I comes 8 positions after A, so it will give you -8

        String s1="hello";
        String s2="hello";
        String s3="hemlo";
        String s4="flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

        //This program shows the comparison between the various string. It is noticed that
        //if s1 > s2, it returns a positive number
        //if s1 < s2, it returns a negative number
        //if s1 == s2, it returns 0
    }
}

/* #6) String contains()
        This method is used to determine whether a substring is a part of the main String or not. The return type is Boolean.

        For E.g. In the below program, we will check whether “testing” is a part of “Softwaretestinghelp” or not and we will also check whether “blog” is a part of “Softwaretestinghelp”.


 */

 class Contains_StringMethods {

    public static void main(String[] args) {

        String str = "Softwaretestinghelp";
        String str1 = "testing";
        String str2 = "blog";
        System.out.println("testing is a part of Softwaretestinghelp: " + str.contains(str1));
        System.out.println("blog is a part of Softwaretestinghelp: " + str.contains(str2));
    }

}

/* #7) Java String split()
        As the name suggests, a split() method is used to split or separate the given String into multiple substrings separated by the delimiters (“”, “ ”, \\, etc).
        In the below example, we will split the String (Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp) using a chunk of String(xyz) already present in the main String.


 */


 class Split_StringMethods {

    public static void main(String[] args) {

        String str = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
        String[] split = str.split("xyz");

        for (String obj: split) {
            System.out.println(obj);
        }


    }

}

/* #8) Java String indexOf()
        This method is used to perform a search operation for a specific character or a substring on the main String.
        There is one more method known as lastIndexOf() which is also commonly used.

        indexOf() is used to search for the first occurrence of the character.
        lastIndexOf() is used to search for the last occurrence of the character.

        Given below is a programming example of how to use both indexOf() and lastIndexOf() methods.


 */


 class IndexOf_StringMethods {

    public static void main(String[] args) {

        String str = "Saket Saurav " + "performing a search";
        System.out.println(str);
        System.out.println("index of 'p' is " + str.indexOf('p'));
        System.out.println("index of 'u' is " + str.indexOf('u'));
        System.out.println("last index of 'S' is " + str.lastIndexOf('S'));
        System.out.println("last index of 's' is " + str.lastIndexOf('s'));
    }

}

/*#9) Java String toString()
        This method returns the String equivalent of the object that invokes it.
        This method does not have any parameters.
        Given below is the program where we will try to get the String representation of the object.


 */


 class ToString_StringMethods {

    public static void main(String[] args) {

        Integer obj = 10;
        String str = obj.toString();
        String str2 = obj.toString(80);
        String str3 = obj.toString(9823, 2);
//The above line will represent the String in base 2
        System.out.println("The String representation is " + str);
        System.out.println("The String representation is " + str2);
        System.out.println("The String representation is " + str3);
    }
}

/* #10) String reverse()
        The StringBuffer reverse() method is used to reverse the input characters of the String.


 */

 class Reverse_StringMethods {

    public static void main(String[] args) {

        String str = "plehgnitseterawtfos";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}

/*#11) String replace()
        The replace() method is used to replace the character with the new characters in a String.


 */


 class Replace_StringMethods {

    public static void main(String[] args) {

        String str = "Shot";
        String replace = str.replace('o', 'u');
        System.out.println(str);
        System.out.println(replace);
    }

}

/*#12) Substring Method()
        The Substring() method is used to return the substring of the main String by specifying the starting index and the last index of the substring.

        For Example, in the given String “Softwaretestinghelp”, we will try to fetch the substring by specifying the starting index and the last index.


 */




class Substring_StringMethods {

    public static void main(String[] args) {

        String str = "Softwaretestinghelp";
        System.out.println(str.substring(8,12));
//It will start from 8th character and extract the substring till 12th character
        System.out.println(str.substring(15,19));
    }
}


/*#13)  String IsEmpty() : This method checks whether the String contains anything or not.
     If the java String is Empty, it returns true else false. For example:
      */

 class IsEmptyExample{
    public static void main(String args[]){
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      // false
    }
 }


/* 14 String Trim() : The java string trim() method removes the leading and trailing spaces.
It checks the unicode value of space character (‘u0020’) before and after the string. If it exists, then removes the spaces and return the omitted string.
For example:


 */
class StringTrimExample{
    public static void main(String args[]){
        String s1="  hello   ";
        System.out.println(s1+"how are you");        // without trim()
        System.out.println(s1.trim()+"how are you"); // with trim()

        //In the above code, the first print statement will print “hello how are you” while the second statement will print “hellohow are you” using the trim() function.
    }
}


    /*#15)  String toLowerCase() : The java string toLowerCase() method converts all the characters of the String to lower case. For example:

            */
 class StringLowerExample{
    public static void main(String args[]){
        String s1;
        s1 = "HELLO HOW Are You?" ;
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);
        //The above code will return “hello how are you”.
        }

}




        /* 16) String toUpper() : The Java String toUpperCase() method converts all the characters of the String to upper case. For example:


         */

 class StringUpperExample{
    public static void main(String args[]){
        String s1="hello how are you";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);

        // The above code will return “HELLO HOW ARE YOU”.
    }
}


/* 17) repeat() method Java program to demonstrate the usage of repeat() method

        The string can be repeated N number of times, and we can generate a new string that has repetitions.
        repeat() method is used to return String whose value is the concatenation of given String repeated count times.
        If the string is empty or the count is zero then the empty string is returned.

            Syntax:

            string.repeat(count);
            Parameter: Accepts an integer count which is the number of times we want to repeat the string.

            Returns: String whose value is the concatenation of given String repeated count times

            Example:
            Input:

            string = abc
            count = 3

            Output: abcabcabc

            Input:

            string = xyz
            count = 0

            Output: null

            Algorithm:

            Firstly, we take the input of String.
            Then we use the repeat() method with the number of counts we want to repeat the string.
             */


class repeat_StringMethods {
    public static void main (String[] args) {

        String string="abc";

        int count=3;

        System.out.println("String :"+string.repeat(count));

        String string1="xyz";
        int count1=0;

        System.out.println("string :"+string1.repeat(count1)); // Output string :


    }
}



class Ternary {
    public static void main(String[] args)
    {
        // Java program to find largest among two
        // numbers using ternary operator

        // variable declaration
        int n1 = 5, n2 = 10, max;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;

        // Print the largest number
        System.out.println("Maximum is = " + max);




    }
}

class Ternary2 {
    public static void main(String[] args)
    {
        // Java code to illustrate ternary operator

        // variable declaration
        int n1 = 5, n2 = 10, res;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Performing ternary operation
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        // Print the largest number
        System.out.println("Result = " + res);

        //Suppose that we are building a shopping website.
        // We only want people to be allowed to buy products if they are aged 16 or over.

        int age = 22;

        String result = (age >= 16) ? "This user is over 16." : "This user is under 16.";
        System.out.println(result);

        //Let's see another example that evaluates the largest of three numbers using the ternary operator.
        //
        //LargestNumberExample.java

        int x=69;
        int y=89;
        int z=79;
        int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The largest numbers is:  "+largestNumber);

        //Nested ternary operator in Java
        //Just like nesting in if-else statement, you can do that using Ternary Operator in Java by chaining more than one Java ternary operator together.
        // It is done by implementing another ternary operator in place of one or both of the values.
        // See this example of a chained ternary operator in Java:
        int num1 = 44, num2 = 12, num3 = 2;
        int Largest = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);
        System.out.println("The largest Number is: " + Largest);

        //Here we are also trying to find the maximum number, but now we have three values to compare.
        //
        //The first ternary operator condition compares the num1 and num2 numbers just like before but the values to be returned are different here.
        // In both conditions, a second ternary operator comparing the largest value with the third number stored in num3.
        // The second ternary operator will then return the largest number among all three.
        //
        //You can chain or nest the Java ternary operator multiple times as much as you want,
        // as long as each ternary operator returns a single value, and each ternary operator is used in place of a single value.
    }
}

class EmailValidation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an email address ");
        String email = scan.next();


        int indexOfAt = email.indexOf('@');
        int secondIndexOfAt = email.indexOf(indexOfAt + 1);
// first check :
        if (indexOfAt < 0 || indexOfAt < 2 || secondIndexOfAt > indexOfAt ) {
            System.out.println("error"); // error
        }
//// second check :
//        if (indexOfAt < 2) {
//            System.out.println("error");// error
//        }

// third check :
        int indexOfLastDot = email.lastIndexOf('.');
        if (indexOfLastDot < indexOfAt || indexOfLastDot != (email.length() - 4)) {
            System.out.println("error");// error
        }
        System.out.println(email);
    }
}
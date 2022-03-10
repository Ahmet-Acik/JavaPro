package day3_EscapeSequences;

public class Main {

    //Escape Sequences in Java
    // A character with a backslash (\) just before it is an escape sequence or escape character.

    /* \\ is a control sequence used for displaying a backslash as output.

    so let’s use this concept in the previous java code to avoid the compile-time error:

            Escape Sequence	Description
            \t	            Inserts a tab in the text at this point.
            \b	            Inserts a backspace in the text at this point.
            \n	            Inserts a newline in the text at this point.
            \r	            Inserts a carriage return in the text at this point.
            \f	            Inserts a form feed in the text at this point.
            \'	            Inserts a single quote character in the text at this point.
            \"	            Inserts a double quote character in the text at this point.
            \\	            Inserts a backslash character in the text at this point.

     */
    public static void main(String[] args)
    {
        System.out.println("Hi geek, welcome to \"GeeksforGeeks\".");

        // 1 Java code for the escape sequence \t:

            // \t -> It gives a tab between two words.


        System.out.println("Good Morning\t Geeks! ");


        // 2 Java code for the escape sequence \b :
            // The escape sequence \b is a backspace character
            // It moves the cursor one character back with
            // or without deleting the character(depending upon compiler)

        System.out.println("Good Morning\bg Geeks! ");


        // 3 Java code for the escape sequence \n :

        // This \n escape sequence is for a new line.


         System.out.println("Good Morning Geeks! \n How are you all?  ");

         // 4 Java code for the escape sequence \r:

        // This \r escape sequence is a carriage return character
        //It moves the output point back to the beginning of the line without moving down a line (usually).

        System.out.println("Good Morning Geeks! \r How are you all?  ");

    // 5 Java code for the escape sequence \f:

        // This \f escape sequence is a form feed character
        // It is an old technique and used to indicate a page break.

     System.out.println("Good Morning Geeks! \f How are you all?  ");


     // 6 Java code for the escape sequence \’
        // This \' escape sequence is for printing a single quotation mark on the text string

      System.out.println("Good Morning \'Geeks!\' How are you all?  ");

      // 7 Java code for the escape sequence \”

        // This \" escape sequence is for printing a double quotation mark on the text string

      System.out.println("Good Morning \"Geeks!\" How are you all?  ");


      // 8 Java code for the escape sequence \\

       // This \\ escape sequence is for printing a backslash on the text string

        System.out.println("\\- this is a backslash. ");

        // Explanation:It contains two backslashes, this means after reading the first \ the compiler read the next \ as a new character.
        }
    }





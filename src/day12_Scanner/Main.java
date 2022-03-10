package day12_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {


            /* Java Scanner Class
           The Scanner class of the java.util package is used to read input data from different sources
           like input streams, users, files, etc. Let's take an example.

            Example 1: Read a Line of Text Using Scanner

             */

    public static void main(String[] args) {

            // creates an object of Scanner
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name: ");

            // takes input from the keyboard
            String name = input.nextLine();

            // prints the name
            System.out.println("My name is " + name);

            // closes the scanner
            input.close();


        /* Output

        Enter your name: Kelvin
        My name is Kelvin
        In the above example, notice the line

            Scanner input = new Scanner(System.in);
            Here, we have created an object of Scanner named input.

            The System.in parameter is used to take input from the standard input.


            We have then used the nextLine() method of the Scanner class to read a line of text from the user.

            Now that you have some idea about Scanner, let's explore more about it.

            Import Scanner Class
            As we can see from the above example, we need to import the java.util.Scanner package before we can use the Scanner class.
            import java.util.Scanner;

             Create a Scanner Object in Java
            Once we import the package, here is how we can create Scanner objects.

            // read input from the input stream
            Scanner sc1 = new Scanner(InputStream input);

            // read input from files
            Scanner sc2 = new Scanner(File file);



            // read input from a string
            Scanner sc3 = new Scanner(String str);
            Here, we have created objects of the Scanner class that will read input from InputStream, File, and String respectively.


            Java Scanner Methods to Take Input

            The Scanner class provides various methods that allow us to read inputs of different types.

              Method	    Description
            nextInt()	    reads an int value from the user
            nextFloat()	    reads a float value form the user
            nextBoolean()	reads a boolean value from the user
            nextLine()	    reads a line of text from the user
            next()	        reads a word from the user
            nextByte()	    reads a byte value from the user
            nextDouble()	reads a double value from the user
            nextShort()	    reads a short value from the user
            nextLong()	    reads a long value from the user

     */
        }
}


    /* Example 2: Java Scanner nextInt()

     */


    class nextInt {
        public static void main(String[] args) {

            // creates a Scanner object
            Scanner input = new Scanner(System.in);

            System.out.println("Enter an integer: ");

            // reads an int value
            int data1 = input.nextInt();

            System.out.println("Using nextInt(): " + data1);

            input.close();
            /*Output

            Enter an integer:
            22
            Using nextInt(): 22
            In the above example, we have used the nextInt() method to read an integer value.

             */
        }
    }


    /* Example 3: Java Scanner nextDouble()

     */

    class nextDouble {
        public static void main(String[] args) {

            // creates an object of Scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Double value: ");

            // reads the double value
            double value = input.nextDouble();
            System.out.println("Using nextDouble(): " + value);

           /* input.close();
            Output

            Enter Double value: 33.33
            Using nextDouble(): 33.33
            In the above example, we have used the nextDouble() method to read a floating-point value.

            */

        }
    }


    class Next {
        public static void main(String[] args) {

            // creates an object of Scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");

            // reads the entire word
            String value = input.next();
            System.out.println("Using next(): " + value);

            input.close();

            /*


            Output

            Enter your name: Jonny Walker
            Using next(): Jonny
            In the above example, we have used the next() method to read a string from the user.

            Here, we have provided the full name. However, the next() method only reads the first name.

            This is because the next() method reads input up to the whitespace character.
            Once the whitespace is encountered, it returns the string (excluding the whitespace).
                    */
        }
    }


    /*Example 5: Java Scanner nextLine()

     */

    class NextLine {
        public static void main(String[] args) {

            // creates an object of Scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");

            // reads the entire line
            String value = input.nextLine();
            System.out.println("Using nextLine(): " + value);

            input.close();

                /*
                Output

                Enter your name: Jonny Walker
                Using nextLine(): Jonny Walker
                In the first example, we have used the nextLine() method to read a string from the user.

                Unlike next(), the nextLine() method reads the entire line of input including spaces.
                The method is terminated when it encounters a next line character, \n.

                Recommended Reading: Java Scanner skipping the nextLine().

                Java Scanner with BigInteger and BigDecimal
                Java scanner can also be used to read the big integer and big decimal numbers.

                        nextBigInteger() - reads the big integer value from the user
                nextBigDecimal() - reads the big decimal value from the user
                Example 4: Read BigInteger and BigDecimal

                 */
        }
    }



    class BigIntegerBigDecimal {
        public static void main(String[] args) {

            // creates an object of Scanner
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a big integer: ");

            // reads the big integer
            BigInteger value1 = input.nextBigInteger();
            System.out.println("Using nextBigInteger(): " + value1);

            System.out.print("Enter a big decimal: ");

            // reads the big decimal
            BigDecimal value2 = input.nextBigDecimal();
            System.out.println("Using nextBigDecimal(): " + value2);

            input.close();

            /*
            Output


            Enter a big integer: 987654321
            Using nextBigInteger(): 987654321
            Enter a big decimal: 9.55555
            Using nextBigDecimal(): 9.55555
            In the above example, we have used the java.math.BigInteger and java.math.BigDecimal package to read BigInteger and BigDecimal respectively.

            Working of Java Scanner
            The Scanner class reads an entire line and divides the line into tokens.
            Tokens are small elements that have some meaning to the Java compiler. For example,

            Suppose there is an input string:

            He is 22
            In this case, the scanner object will read the entire line and divides the string into tokens: "He", "is" and "22".
            The object then iterates over each token and reads each token using its different methods.

            Note: By default, whitespace is used to divide tokens.
         */
        }
    }

    class ScannerDemo1
    {
        /*
        To create an object of Scanner class, we usually pass the predefined object System.in,
        which represents the standard input stream. We may pass an object of class File if we want to read input from a file.
            To read numerical values of a certain data type XYZ, the function to use is nextXYZ().
            For example, to read a value of type short, we can use nextShort()
            To read strings, we use nextLine().
            To read a single character, we use next().charAt(0). next() function returns the next token/word in the input as a string
            and charAt(0) function returns the first character in that string.
            Let us look at the code snippet to read data of various data types.


         */


        public static void main(String[] args)
        {
            // Declare the object and initialize with
            // predefined standard input object
            Scanner sc = new Scanner(System.in);

            // String input
            String name = sc.nextLine();

            // Character input
            char gender = sc.next().charAt(0);

            // Numerical data input
            // byte, short and float can be read
            // using similar-named functions.
            int age = sc.nextInt();
            long mobileNo = sc.nextLong();
            double cgpa = sc.nextDouble();

            // Print the values to check if the input was correctly obtained.
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Age: "+age);
            System.out.println("Mobile Number: "+mobileNo);
            System.out.println("CGPA: "+cgpa);



            /*
            Input :

            Geek
            F
            40
            9876543210
            9.9
            Output :

            Name: Geek
            Gender: F
            Age: 40
            Mobile Number: 9876543210
            CGPA: 9.9


             */
        }
    }

    class ScannerDemo2
    {
        /*
        Sometimes, we have to check if the next value we read is of a certain type or if the input has ended (EOF marker encountered).

        Then, we check if the scanner’s input is of the type we want with the help of hasNextXYZ() functions where XYZ is the type we are interested in.
        The function returns true if the scanner has a token of that type, otherwise false. For example, in the below code, we have used hasNextInt().
        To check for a string, we use hasNextLine(). Similarly, to check for a single character, we use hasNext().charAt(0).

        Let us look at the code snippet to read some numbers from console and print their mean.

         */


        public static void main(String[] args)
        {
            // Declare an object and initialize with
            // predefined standard input object
            Scanner sc = new Scanner(System.in);

            // Initialize sum and count of input elements
            int sum = 0, count = 0;

            // Check if an int value is available
            while (sc.hasNextInt())
            {
                // Read an int value
                int num = sc.nextInt();
                sum += num;
                count++;
            }
            int mean = sum / count;
            System.out.println("Mean: " + mean);
        }
    }

            /*Scanner class in Java supports nextInt(), nextLong(), nextDouble() etc.
            But there is no nextChar() (See this for examples)

            To read a char, we use next().charAt(0).
            next() function returns the next token/word in the input as a string
            and charAt(0) function returns the first character in that string.


    // Java program to read character using Scanner

     */
 class NoNextChar
{
    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // Character input
        char c = sc.next().charAt(0);

        // Print the read value
        System.out.println("c = "+c);

            /*Input :

                g
                Output :

                c = g

         */
    }
}


class ScannerDemoAll{

    public static void main(String[] args) throws FileNotFoundException {

        /*
                Conversion Characters
        The conversion-character is required and determines how the argument is formatted.

        Conversion characters are only valid for certain data types.
        Here are some common ones:

        s formats strings.
        d formats decimal integers.
        f formats floating-point numbers.
        t formats date/time values.

        Line Separator
        To break the string into separate lines, we have a %n specifier:

        Boolean Formatting
        To format Boolean values, we use the %b format.


        String Formatting
        To format a simple string, we'll use the %s combination.
        Additionally, we can make the string uppercase: %S
        printf("'%s' %n", "baeldung");    'baeldung'
        printf("'%S' %n", "baeldung");    'BAELDUNG'



        Char Formatting
        The result of %c is a Unicode character:

        System.out.printf("%c%n", 's');
        System.out.printf("%C%n", 's');
        The capital letter C will uppercase the result:


        Integer Formatting
        The printf() method accepts all the integers available in the language — byte, short, int, long, and BigInteger if we use %d:

        System.out.printf("simple integer: %d%n", 10000L);
        With the help of the d character, we'll have this result:

        simple integer: 10000
        In case we need to format our number with the thousands separator, we can use the , flag.



        Float and Double Formatting
        To format a float number, we'll need the f format:

        System.out.printf("%f%n", 5.1473);
        which will output:

        5.147300
        Of course, the first thing that comes to mind is to control the precision:

        System.out.printf("'%5.2f'%n", 5.1473);
        Here we define the width of our number as 5, and the length of the decimal part is 2:

        ' 5.15'
        Here we have one-space padding from the beginning of the number to support the predefined width.

        To have our output in scientific notation, we just use the e conversion-character:

        System.out.printf("'%5.2e'%n", 5.1473);
        And this is our result:

        '5.15e+00'


        Date and Time Formatting
        For date and time formatting, the conversion string is a sequence of two characters: the t or T character and the conversion suffix.


         */

        try {
            Scanner scan = new Scanner(System.in);

            while (true) {

                System.out.print("Please enter some data, and enter -1 to quite: ");


                if (scan.hasNextInt()) {
                    int data = scan.nextInt();
                    System.out.printf("\t%,d is an integer\n\n ", data);
                    if (data == -1) break;

                } else if (scan.hasNextLong()) {
                    long data = scan.nextLong();
                    System.out.printf("\t%,d is a long\n\n ", data);

                } else if (scan.hasNextDouble()) {
                    double data = scan.nextDouble();
                    System.out.printf("\t%,f is a double\n\n ", data);

                } else if (scan.hasNextBoolean()) {
                    boolean data = scan.nextBoolean();
                    System.out.printf("\t%s is a boolean\n\n ", data);

                } else {
                    String data = scan.next();
                    System.out.printf("\t%s is a String\n\n ", data);
                }
            }
            scan.close();

            Scanner fScan = new Scanner(new File ("Input.txt"));

            // read each word in form file into an array list
            ArrayList<String> fileWords = new ArrayList<String>();



        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }



    }
}
package day14_String2;

public class StringFormatting {

           public static void main(String[] args) {

            // printf() = 	an optional method to control, format, and display text to the console window
            //				two arguments = format string + (object/variable/value)
            //				% [flags] [precision] [width] [conversion-character]

            boolean myBoolean = true;
            char myChar = '@';
            String myString = "Bro";
            int myInt = 50;
            double myDouble = 1000;

            // [conversion-character]
            //System.out.printf("%b",myBoolean);
            //System.out.printf("%c",myChar);
            //System.out.printf("%s",myString);
            //System.out.printf("%d",myInt);
            //System.out.printf("%f",myDouble);

            //[width]
            // minimum number of characters to be written as output
            //System.out.printf("Hello %10s",myString);

            //[precision]
            // sets number of digits of precision when outputting floating-point values
            //System.out.printf("You have this much money %.1f",myDouble);

            // [flags]
            // adds an effect to output based on the flag added to format specifier
            // - : left-justify
            // + : output a plus ( + ) or minus ( - ) sign for a numeric value
            // 0 : numeric values are zero-padded
            // , : comma grouping separator if numbers > 1000

            //System.out.printf("You have this much money %,f",myDouble);


               /*

               When you output a double by using print or println, it displays up to 16 decimal places:

                System.out.print(4.0 / 3.0);
                The result is as follows:

                1.3333333333333333

                That might be more than you want. System.out provides another method, called printf, that gives you more control of the format.
                The “f” in printf stands for “formatted”. Here’s an example:

                System.out.printf("Four thirds = %.3f", 4.0 / 3.0);

                The first value in the parentheses is a format string that specifies how the output should be displayed.
                This format string contains ordinary text followed by a format specifier, which is a special sequence that starts with a percent sign.
                The format specifier %.3f indicates that the following value should be displayed as floating-point, rounded to three decimal places:

                Four thirds = 1.333
                The format string can contain any number of format specifiers; here’s an example with two of them:

                int inch = 100;
                double cm = inch * CM_PER_INCH;
                System.out.printf("%d in = %f cm\n", inch, cm);
                The result is as follows:

                100 in = 254.000000 cm
                Like print, printf does not append a newline. So format strings often end with a newline character.

                The format specifier %d displays integer values (“d” stands for “decimal”, meaning base 10 integer). The values are matched up with the format specifiers in order, so inch is displayed using %d, and cm is displayed using %f.

                Learning about format strings is like learning a sublanguage within Java. There are many options, and the details can be overwhelming. Table 3.1 lists a few common uses, to give you an idea of how things work.


                %d	    Integer in base 10 (“decimal”)	12345
                %,d	    Integer with comma separators	12,345
                %08d	Padded with zeros, at least 8 digits wide	00012345
                %f	    Floating-point number	6.789000
                %.2f	Rounded to 2 decimal places	6.79
                %s	    String of characters	"Hello"
                %x	    Integer in base 16 (“hexadecimal”)	bc614e

                Table 3.1: Example format specifiers





                */


    }


}

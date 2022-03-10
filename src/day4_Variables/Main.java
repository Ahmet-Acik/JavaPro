package day4_Variables;

import java.util.Scanner;

public class Main {

    /*A variable can be thought of as a container in which information of a given type can be stored.
    Examples of these different types include text (String),
    whole numbers (int),
    floating-point numbers (double),
    and whether something is true or false (boolean).
    A value is assigned to a variable using the equals sign (=).


    Although Java is object-oriented, not all types are objects. It is built on top of basic variable types called primitives.

        Here is a list of all primitives in Java:

        byte (number, 1 byte)
        short (number, 2 bytes)
        int (number, 4 bytes)
        long (number, 8 bytes)
        float (float number, 4 bytes)
        double (float number, 8 bytes)
        char (a character, 2 bytes)
        boolean (true or false, 1 byte)
        Java is a strong-typed language, which means variables need to be defined before we use them.


     */

    /*
            Declaring a variable in Java.
        In Java it is mandatory to declare a variable before use. Syntax for variable declaration in Java is as follows-

        type variable_name = value
        int age = 65;

          //declaration
        int age;
        ..
        ..
        // initialization
        age = 65;

        To declare and assign a number use the following syntax:
        int myNumber;
        myNumber = 5;
        Or you can combine them:
        int myNumber = 5;

        //declaration and initialization of a char variable
        char ch = 'a';

        //declaration variable of type double.
        double d;



     */



    public static void main(String[] args) {
        String text = "contains text";
        int wholeNumber = 123;
        double floatingPoint = 3.141592653;
        boolean trueOrFalse = true;

        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumber);
        System.out.println("Floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);

        /*
        Changing a Value Assigned to a Variable,
        A variable exists from the moment of its declaration,
        and its initial value is preserved until another value is assigned to it.
        You can change a variable's value using a statement that comprises the variable name, an equals sign, and the new value to be assigned.
        Remember to keep in mind that the variable type is only stated during the initial variable declaration.
         */
    }
}
class Program0 {

    public static void main(String[] args) {
        int number = 123;
        System.out.println("The value of the variable is " + number);

        number = 42;
        System.out.println("The value of the variable is " + number);


        /* The variable type is stated when the variable is first declared.
        When a new value is assigned to the variable, the type is no longer declared.

        */
        int value = 10;
        System.out.println(value);
        value = 4;
        System.out.println(value);



        /*
        Variable's Type Persists
        Once a variable's type has been declared, it can no longer be changed.
        For example, a boolean value cannot be assigned to a variable of the integer type,
        nor can an integer be assigned to a variable of the boolean tpe.

                boolean integerAssignmentWillWork = false;
                integerAssignmentWillWork = 42; // Does not work

                int value = 10;
                integerAssignmentWillWork = value; // Neither does this
        However, exceptions do exist: an integer can be assigned to a variable of the double type,
        since Java knows how to convert an integer to a double during assignment.
         */

        double floatingPoint1 = 0.42;
        floatingPoint1 = 1; // Works

        int value1 = 10;
        floatingPoint1 = value1; // Also works

    }
}

        // A floating-point value cannot, however, be assigned to an integer variable.
        // The reason for this is that those who develop the language aim to prevent developers
        // from making errors that lead to a loss of information.

            /*
            Type	                                Example	                        Accepted values
            Whole number, i.e., int	                int     value = 4;	            An integer can contain whole numbers whose values lie between -2147483648 and 2147483647.
            Floating-point number, i.e.,            double	double value = 4.2;	    Floating-point numbers contain decimal numbers, with the greatest possible value being approximately 21023.
            String	                                String  text = "Hi!";	        A string can contain text. Strings are enclosed in quotation marks.
            True or false value, i.e., boolean	    boolean right = true;	        A boolean contains either the value true or false.

             */


        // Reading strings from the user has become familiar by this point - we do it using the nextLine-command of the Scanner helper method.



class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write text and press enter ");
        String text = scanner.nextLine();
        System.out.println("You wrote " + text);
    }
}

            // Other input types, such as integers, doubles, and booleans are also read as text.
            // However, they need to be converted to the target variable's type with the help of some tools provided by Java.

            //Reading Integers
            ///The Integer.valueOf command converts a string to an integer.
            // It takes the string containing the value to be converted as a parameter.

class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valueAsString = "42";
        int value12 = Integer.valueOf(valueAsString);

        System.out.println(value12);

        // When using a Scanner object, the reading of the value is usually inserted directly into the type conversion.
        // This happens like so:


        System.out.println("Write a value ");
        int value22 = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value22);

        // Reading Doubles
        // The Double.valueOf command converts a string to a double.
        // It takes the string containing the value to be converted as a parameter.

        String valueAsString1 = "42.42";
        double value21 = Double.valueOf(valueAsString);
        System.out.println(value21);
    }
}

class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //As with integers, the reading is nested within the conversion. This is done as follows:
        System.out.println("Write a value ");
        double value31 = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value31);
    }
}

        // Reading Booleans
        //The Integer.valueOf command converts a string to an integer and the Double.valueOf converts it to a floating-point.
        // The valueOf command also appears when converting a string to a boolean — this is done with the command Boolean.valueOf.
        //
        //Boolean variables can either have the value true or false.
        // When converting a string to a boolean, the string must be "true" if we want the boolean value to be true.
        // The case is insensitive here: both "true" and "TRue" turn into the boolean value of true.
        // All other strings turn into the boolean false.

class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a boolean ");
        boolean value41 = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value41);
    }
}

    /*
             Types of variables in Java
            The Java programming language defines the following kinds of variables:

        Instance Variables (Non-Static Fields)
        Class Variables (Static Fields)
        Local Variables
        Parameters

     */
    /*
            Local variables in Java
        A variable defined between the start and closing curly braces of a method is known as a local variable.
        Scope of a local variable is with in the method where it is declared.
        In fact every block of code creates a new scope and any variable declared with in the opening and closing braces of that block has the scope with in that block.

            public void sum(int x, int y){
              //local variable
              int sum = x + y;
              if(sum > 10){
                // scope with in if condition block
                int temp = sum;
              }
              // Not visible here
              //temp = 40;
            }
            In the code sum is a local variable having its scope with in the method where it is declared.
            Another variable temp is declared with in the if statement so its scope is with in the opening and closing braces of the if condition block.

     */


    /*

    Instance Variable: It is basically a class variable without a static modifier and is usually shared by all class instances. Across different objects, these variables can have different values.
    They are tied to a particular object instance of the class, therefore, the contents of an instance variable are totally independent of one object instance to others.
  Example:

// class Taxes
// {
//    int count;
//    /*...*/
// }
     /*

      Class Variable: It is basically a static variable that can be declared anywhere at class level with static. Across different objects, these variables can have only one value. These variables are not tied to any particular object of the class, therefore, can share across all objects of the class.
      */

                  //  Example:

            // class Taxes
            // {
            //     static int count;
            //     /*...*/
            // }




/*
        Tabular difference between Instance and Class variable:
        Instance Variable                                                                                       Class Variable

    It is a variable whose value is instance-specific and now shared among instances.  	                    It is a variable that defines a specific attribute or property for a class.
    These variables cannot be shared between classes. Instead, they only belong to one specific class.  	These variables can be shared between class and its subclasses.
    It usually reserves memory for data that the class needs.  	                                            It usually maintains a single shared value for all instances of class even if no instance object of the class exists.
    It is generally created when an instance of the class is created.  	                                    It is generally created when the program begins to execute.
    It normally retains values as long as the object exists.  	                                            It normally retains values until the program terminates.
    It has many copies so every object has its own personal copy of the instance variable. 	                It has only one copy of the class variable so it is shared among different objects of the class.
    It can be accessed directly by calling variable names inside the class.  	                            It can be accessed by calling with the class name.
    These variables are declared without using the static keyword.  	                                    These variables are declared using the keyword static.
    Changes that are made to these variables through one object will not reflect in another object.  	    Changes that are made to these variables through one object will reflect in another object.


     */
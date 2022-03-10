package day1_JavaIntro;

public class JavaSyntax {

    /*

        Java Syntax – A Complete Guide to Master Java

    In this Java Tutorial, we will learn about Java Syntax. So let’s start!!!

    What does Syntax mean?
    Well, simply put, syntax is a particular format for writing commands in a programming language.
    Every language has its individual syntax.

    Without proper knowledge of syntax, it would be difficult to generate desired output from a programming language.
    Syntax are also referred to as the language of the computer.

    */
    /*
        Java Syntax

        Java Syntax.
    Java syntax is similar to C and C++ because it comes from them. So, let’s dive into the depths of syntax in Java!

    As soon as a Java program starts, it has package.
    A package consists of many classes, each consisting of functions, variables and methods.
    We start with knowing the syntax for identifiers in Java.
     */

    /*
            1. Identifiers.
        Identifiers are the names given to entities such as classes,variables,functions to uniquely identify them throughout the program.

        They contain:

        Underscore( _ ) and dollar($) (only special characters allowed in naming identifiers.)
        Unicode characters such as numbers,alphabets.

     */
    /*
            2. Keywords.
        Keywords are the identifiers which have special meaning to the compiler.
        These cannot be used to name variables, classes, functions etc. These are reserved words.

        Some of the keywords are:

        a. abstract – This keyword specifies that the class is an abstract class.
        b. boolean– This is a data type specifier which mentions that a particular variable is boolean.
        c. byte– this is a data type specifier which specifies a particular variable to be of byte type.
        d. Case– a switch case keyword which specifies program to be performed if a particular case is satisfied
        e. catch – during a throw case of error handling catch encloses actions to be performed if exception occurs
        f. break– The break keyword breaks the control out of a loop
        g. Void – this keyword renders a method non-returnable
        h. char– This is a data type specifier which specifies that the variable is of character type
        i. Class– This keyword specifies the creation of a new class followed by a class name.
        j. Extends– This is used to indicate that the class mentioned after it is the derivation of a superclass.


     */
     /*

            3. Literals
        These are the identifiers which have a particular value in itself. These can be assigned to variables.
        Literals can also be thought of as constants.
        These are of different types such as numeric, characters, strings etc.

        a. Numeric Literals
        For numeric literals there are 4 kinds of variations:

        i. Decimal(Any number of base 10), Example- 87,53
        ii. Binary(Any number with a base 2), Example- 1011,110
        iii. Octal Point(Any number with base 8), Example= 1177
        iv. Hexadecimal Point(Any number with base 16), Example- A54C

        b. Floating point Literals
        We can specify the numeric values only with the use of a decimal point(.).
        These numbers represent fractional numbers which cannot be expressed as whole integers.


        For Example: 10.876

        c. Character Literals
        These are the literals which deal with characters i.e inputs which are not numeric in type.

        i. Single quoted character– This encloses all the uni-length characters enclosed within single quotes. Example- ‘a’,’j’.

        ii. Escape Sequences– These are the characters preceded by a backslash which perform a specific function when printed on screen such as a tab, creating a new line, etc. Example-’\n’

        iii. Unicode Representation– It can be represented by specifying the concerned unicode value of the character after ‘\ u’. Example- “\ u0054’


      */
    /*
            4. Comments in Java
        Comments are needed whenever the developer needs to add documentation about a function which is defined within the program.
        This is to enhance the code-readability and understandability.
        Comments are not executed by the compiler and simply ignored during execution.

        The comments are of the following types:

        a. Single Line Comments in Java
        These comments, as the name suggests, consist of a single line of comment generally written after a code line to explain its meaning.
        They are marked with two backslashes(//) and are automatically terminated when there
        Is a new line inserted in the editor.

        For Example:

        int i = 6;
        String s = “DataFlair”; // The value of i is set to 6 initially.The string has value “DataFlair”
        b. Multi Line Comments in Java
        These comments span for multiple lines throughout the codebase.
        They are generally written at the begiinning of the program to elaborate about the algorithm.
        These are also used by developers to comment out blocks of code during debugging.
         */

            /*

            Basic structure of Java program
        There are two basic parts of a Java program namely, Packages and Main Method.

                1. Package
        This is the same thing as a folder in your computer.
        It contains classes,interfaces and many more.
        It organizes the classes into namespaces.
        The classes which are of the same package can access each other’s protected and private members.

        They are generally imported by using the import keyword i.e, import java.util.* where we are importing java’s util package

                2. Main Method
        The main method marks the entry point of the compiler in the program. The main method must always be static.

        For Example:

        public class DataFlair {
            void teachJava() {
                System.out.println(“Teaching Java by DataFlair”);
            }
            public static void main(String[] args) throws IOException {
                System.out.println(“In main”);
                DataFlair ob = new DatFlair();
                ob.teachJava();
            }
        }

        Output:
        In main
        Teaching Java by DataFlair
        The compiler first executes the main method and then the object method.


                5. Control statements
        The syntax of control statements in Java are pretty straightfoward. Let’s take a deeper look into the control statements in Java.

            a. Conditional Statements
        These statements are purely based on condition flow of the program. Its divided into the following 3 parts

            i. if statement
        The statement suggests that if a particular statement yields to true then the block enclosed within the if statement gets executed.

        if (condition) {
            action to be performed
        }

            ii. if else statement

        This statement is of the format that if a condition enclosed is true then the if block gets executed.
        If not the else block gets executed

        Example:

                if (condition) {
                    action1;
                }
                    else {
                    action2
                }

            iii. Else if statement
        This statement encloses a if statement in an else block.

                Example:

                if (condition) {
                    action 1
                }
                else if (condition2) {
                    action 2
                }

            iv. Switch case
        The switch case is used for multiple condition checking.
        It’s based on the value of the variable.
        The value of the variable mentioned marks the flow of the control to either of the case blocks mentioned.

        Example:

                switch (var_name)
                case value1:
                action1;
                break;
                case value2:
                action2;
                break;
                default:
                action3;
                break;

            b. Iteration Statements
        These are the statements which are primarily known as loops in programming which run a particular set of programs a fixed number of times,

        Some of the types of iterative statements are:
            i. For loop
        The for loop is responsible for running the snippet of code inside it for a predetermined number of times.

                Example:

                for (i = 0; i < 5; i++) {
                    System.out.println(“Hi”);
                }
        This prints “Hi” 5 times on the output screen

            ii. While loop
        This type of loop runs indefinitely until the condition is false

        Example:

                while (i < 6) {
                   System.out.println(“Hi”);
                     i++;
                   }
        This prints Hi on the screen five times until the value of i becomes 6


            iii. Do-while loop
        This is the same as the while loop. The only difference lies in the fact that the execution occurs once even if the condition is false.

        Example:

                do {
                    System.out.println(“Hi”);
                }
                while ( i > 6 );


        c. Control Flow Statements/Jump Statements
        Sometimes we need to discontinue a loop during execution.

                i. Break statement
        This breaks the nearest loop inside which is mentioned.
        The execution continues from the next line just when the current scope ends.

                ii. Continue Statement
        This continues the execution from the next iteration of the loop and skips the current execution.

        Example:

            while (i < 10) {
                if (i == 3) continue;
                i++;
            }
        This prints all the values from 0 to 9 except 3


        iii. Return statement
        The return statements are generally useful in methods when returning a value when the function is done executing.
        After the return statement executes, the remaining function does not execute.

                6. Exception Handling in Java
        Exception handling is important to custom output the errors during the unfortunate case of an error occurrence.
        Syntax of the exception handling is fairly simple and structured.

        It goes as below:

                try {
            // Code block within which error can occur
        }
        catch(Exception e) {
            //Code block to perform when error thrown
        }
        Finally {
            //Code to be executed after the end of try block. This block is executed even if there is no error
        }
        There is a special keyword called throws, it is useful to throw custom exceptions.

        For Example- throw new ArithmeticException();

        Try: This block houses the code which is responsible for an error thrown.
        Generally programmers enclose the code which they think may throw an error in the try block.

                Catch: This block houses the code to be performed when a particular exception is found.
                There can be custom messages defining what kind of error has occurred for better documentation and flow of the program.

                Finally: The finally block executes whether or not there is any error faced by the compiler.
                This part is generally used to enclose the code that has to be executed irrespective of the errors occurred during compilation/execution of the program.

        Example program to evaluate exception handling in Java

        import java.io. * ;
        class ExcptionHandle {
            public static void main(String[] args) throws IOException {
                int a = 10,
                        b = 0;
                int c;
                try {
                    c = a / b;
                } catch(Exception e) {
                    System.out.println(e);
                    //TODO: handle exception
                }
            }
            Output:


            java.lang.ArithmeticException: / by zero


                    7. Operators in Java
            As the name suggests, operators are the ones for performing operations on two or more entities.

            They are of multiple types as below:

                a. Arithmetic
            These are the operators which are solely for performing arithmetic operations .
            These include addition (+), subtraction(-), multiplication (*), division (/), modulo(%) and many more.

                b. Relational
            These are the operators which obtain the relation between two different entities in a program.
            These include less than(<), greater than(>), less than or equals to(<=), greater than or equals to(>=) ,equals to(==), not equals to(!=)

            Example:

                    if (a < b) {
                System.out.println(“A greater”);
            }

                c. Bitwise
            These operators are useful for performing bitwise operations on an entity.
            These include AND(&), bitwise OR(|), bitwise XOR(^), bitwise complement (~), bitwise left shift(<<) and so on.

            Example: (A&B) will give 12 if a = 0000 and b= 1100

                d. Logical
            These operators are useful to check the logic of a particular operation of two operands.
            These include Logical AND(&&), Logical OR(||), logical NOT(!) and so on.

            For Example:

                    if (a == 6 && b == 5)

                e. Assignment
            These operators are responsible for assigning variables to variables.
            These include equal(=),add AND(+=), subtract AND operator(-=) and so on.
            Example:

            int x = 65;
            int y += 6
            int y+=6(equivalent to int y=y+6;)


                    8. Object in Java

            Objects are created from classes in Java. Once we define a class, we can create the object of a class by the following simple syntax. These are the instances of the class:

            < class - name > <object - name > =new < class - name of instance creation > ()
            Example:

            DataFlair java = new DataFlair();


                9. Class in Java
            Classes generally start with the class name which has its first letter capital.
            Generally the case is CamelCase for class names. It has a very simple syntax as below:

            class < Class - name > {
                instance variables;
                class method1() {}
                class method2() {}
            } //end class
            Example:

            class DataFlair {
                int a;
                void teach() {
                    System.out.println(“Learning java from DataFlair”);
                }
            }


                10. Methods in Java
            Methods or functions are specific entities which return a value only when they are called.
            They have a syntax similar to classes.

                < return type > <  function - name > {
                            action1;
                            action2;
                        }
                        For Example:

                        void print() {
                            System.out.println(“hey I am learning Java at DataFlair”);
                        }

                 11. Interfaces
            Interfaces are a collection of abstract methods in Java.
            We will learn more about Java in the following articles. We define interfaces as below;


            interface < interface - name > {
                static functions;
                abstract methods;
            }
            Example:

            interface DataFlair {
                void teach();
                static void evaluate();
            }

                12. Access modifiers
            Access modifiers as the name suggests, limits the access of the entities they are defined with.
            The access modifiers used by Java are:

            a. Public – Accessible to every other class or interface. There is no restriction of access.
            b. Private– This keyword renders all entities to be accessible only inside the class they are declared.
            c. Protected– The protected members of the class are accessible to classes within the same package or subclasses of different packages.
            d. Default– If no access modifier is mentioned then the default access modifier is invoked. This limits the access of the particular entity within the same package.

            For Example:
            public int a=8;

                13. Arrays
            Arrays are consecutive data items of the same datatype.
            They have a fairly simple syntax of declaration.

            If the array has to be declared explicitly it has the syntax of:

            < data type > <array - name > [ < array - size > ] = {
                        data1,
                        data2,
                        data3...
                };
            For Example:

            int arr[3] = {
                        1,
                        2,
                        3
                };
            else if the array has to be declared during runtime.

            < data type > <array - name > [] = new < array - name > [ < sizeofArray > ]
                    Example:

            int arr[] = new int[10];

                14. Variables
            The variables concept has been explained in the following articles,however the syntax of variables is simple and easy to learn.

            Java Syntax for variables:

            < data type > <variable - name >
                Example:

                String s = ”DataFlair”;


                15. Datatype
            The datatypes come before variables to define the type of data they would be storing.
            These include int,short,byte,float,double;

            Syntax

                    < datatype > <
                    var - name >
            Example:

            int b = 12;

                16. Compiling and Executing a Java Program
            Once we have written a Java program and saved it, we need to compile and execute it by the following methods.

            Open up a CMD window on the saved location by <Shift+right-click> and then select your configured CLI, i,e CMD or powershell.
            If you are using any other OS like ubuntu or Linux, open up a terminal and navigate to the directory in which you have saved java program.
            Next type in javac <filename.java>
            follow that by typing java <filename>
            Example:

            javac DataFlair.java (This compiles the file and lets us know if there are errors. )
            java DataFlair (if no errors are found run this command in CLI)


         */


    }

package day2_HelloWorld;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, World!");


        /*
        Identifiers in Java
        Any name that you see in a Java program, be it the class name, the function name or the variable name, each of them are identifiers.

        They identify or point to a certain thing in memory, be it a variable or a class.
        Let us take a very basic example of a Java program and find all the identifiers in it.
        Rules for Using Identifiers
        As you might have expected there are some rules to using identifiers in Java. Some of them are:

        You should only use alphabets and numbers while naming anything in Java. The only special characters that are allowed are the dollar sign(‘$’) and the underscore(‘_’).
        Even if you can use numbers you cannot use them to start the name of the identifier. You cannot name your variable as 666devil. But you can use devil666 as a valid variable name.
        Since Java is case sensitive, the identifiers a and A are completely different. This means that you can have two different variables with the same name but different case.
        Java does not implement a restriction on the length of the identifier. However, it is advisable to keep the name of the identifier between 2 to 18.
        There are certain words that have a special meaning to the compiler such as int, class. You cannot use these as identifiers.





        Print Line
        System.out.println() can print to the console:

        System. is a class from the core library provided by Java
        out. is an object that controls the output
        println() is a method associated with that object that receives a single argument
        */

        /*
        Comments.
        Comments are bits of text that are ignored by the compiler. They are used to increase the readability of a program.

            Single line comments are created by using //.
        Multi-line comments are created by starting with /* and ending with
        */


        /*
           main() Method
        In Java, every application must contain a main() method, which is the entry point for the application.
        All other methods are invoked from the main() method.

        The signature of the method is public static void main(String[] args) { }.
        It accepts a single argument: an array of elements of type String.

         */


        /*
            Classes
        A class represents a single concept.

        A Java program must have one class whose name is the same as the program filename.

        In the example, the Person class must be declared in a program file named Person.java.

         public class Person {

          public static void main(String[] args) {

            System.out.println("I am a person, not a computer.");

            }

           }

         */


         /*
            Compiling Java
        In Java, when we compile a program, each individual class is converted into a .class file, which is known as byte code.
        The JVM (Java virtual machine) is used to run the byte code.

            # Compile the class file:
           javac hello.java

            # Execute the compiled file:
            java hello

         */


        /*

                Statements
        In Java, a statement is a line of code that executes a task and is terminated with a ;.
        System.out.println("Java Programming ☕️");

         */


    }
}

    /*

        Summary
        main() Method
        In Java, every application must contain a main() method, which is the entry point for the application.
        All other methods are invoked from the main() method.

        The signature of the main method is public static void main(String[] args) { }.
        It accepts a single argument: an array of elements of type String.
     */

    //class HelloWorld {


    /*For now, just remember that every Java application has a class definition, and the name of the class should match the filename in Java.

    public static void main(String[] args) { ... }

    This is the main method. Every application in Java must contain the main method.
    The Java compiler starts executing the code from the main method.

    the main function is the entry point of your Java application, and it's mandatory in a Java program.
    The signature of the main method in Java is:

    public static void main(String[] args) {
    ... .. ...  }
    System.out.println("Hello, World!");

    The code above is a print statement. It prints the text Hello, World! to standard output (your screen).
    The text inside the quotation marks is called String in Java.

    //    Things to take away
    //    Every valid Java Application must have a class definition that matches the filename (class name and file name should be same).
    //    The main method must be inside the class definition.
    //    The compiler executes the codes starting from the main function.

     */


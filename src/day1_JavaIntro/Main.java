package day1_JavaIntro;
import java.util.Scanner;

public class Main {
            //The main Method
        //The main() method is required and, you will see it in every Java program:
        //Note: The curly braces {} marks the beginning and the end of a block of code.
            //
            //Note: Each code statement must end with a semicolon.

    public static void main(String[] args) {

        //System.out.println()
        /* Inside the main() method, we can use the println() method to print a line of text to the screen:
        //
        */
        System.out.println("Hello World!");

        System.out.println("5 + 2 = " + 3 + 4);

        System.out.println((int)(10/3));


        /*
             Java Single-line Comments
        Single-line comments start with two forward slashes (//).

        Any text between // and the end of the line is ignored by Java (will not be executed).

                Java Multi-line Comments
        Multi-line comments start with /* and ends with */

        // Any text between /* and */ will be ignored by Java.


        /*
                    What is Java?
            Java is a popular programming language, created in 1995.
            It is owned by Oracle, and more than 3 billion devices run Java.

            It is used for:

            Mobile applications (specially Android apps)
            Desktop applications,
            Web applications,
            Web servers and application servers
            Games
            Database connection
            And much, much more!

            Why Use Java?
            Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
            It is one of the most popular programming language in the world
            It is easy to learn and simple to use
            It is open-source and free
            It is secure, fast and powerful
            It has a huge community support (tens of millions of developers)
            Java is an object-oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
            As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa

         */

    }
}
 /*
            Package in Java

        A package in Java is used to group a set of related classes and interfaces.
        In a big Java application containing hundreds or thousands of individual classes, grouping related classes and interfaces into packages helps to keep things organized.

        Package structure in Java
        Packages follow the same structure as directories in OS where you have a root directory which may contain zero or more sub-directories and then there are files.
        Same way with in a package structure there is a top level package which may have subpackages and classes.

        For example– java.util.ArrayList

        Here top level package is – java
        Containing a subpackage- util
        Which in turn contains the class – ArrayList


        Advantages of using package in Java
        Package in Java provides following advantages-

        Helps with organizing classes– Packages are used to organize set of related classes and interface which makes its easy to find a specific class, interface. If you want to use specific class residing in a package in another class you can import class from that package and use it.
        Prevent name collision– Packages in Java also prevent naming collision. You can have class with same name in different packages. For example com.knpcode.finance.MyClass and com.knpcode.accounts.MyClass.
        Provides access control– Packages also help in controlling the visibility of the members. Access specifiers protected and default have visibility with in a package.
        A member having default access is visible only within its own package.
        A member having protected access can only be accessed within the package it belongs to or by a subclass of its class in another package.

        Types of packages in Java.
        In Java programming language there are two types of packages.

        1) Built-in packages– Java comes pre-packaged with many built-in packages containing classes that are grouped together as per the functionality.
        For example-
        java.lang– Contains fundamental classes. This package is automatically imported.
        java.io– Contains classes for reading and writing (input and output).
        java.util– Contains the collections framework, date and time facilities, internationalization, and miscellaneous utility classes.

        2) User defined packages– You will use API classes contained in these built-in packages with in your Java application but to group classes with in your application you’ll create user defined packages.

        Creating a package in Java
        To create a package, you put a package statement with package name at the top of every source file (class, interface, enumerations, and annotation types) that you want to include in the package.

        Syntax for package creation

        package package_name;
        Package creation example
        package com.knpcode.programs;

        public class MyClass {
          public static void main(String[] args) {
            System.out.println("creating a package");
          }
        }
        In the example com.knpcode.programs package structure is created if it does not exist already.
        If package already exists then class MyClass is included with in that package.


        Few points to keep in mind while creating a package are-

        package statement must be the first line in the source file.
        There can be only one package statement in each source file.

        Sub-packages in Java
        As already discussed in the beginning a top level package may contain another package which is called the sub-package.
        By using sub-packages you can segregate files based on sub-functionalities.
        A top level package for broader functionality and sub-packages containing source files grouped by sub-functionalities.


        A hierarchy of packages is created by separating package names by a period (.).

        For example– com.knpcode.programs

        Here programs is a package inside knpcode which is under com.


        Importing packages in Java

        If you want to use specific source file (class, interface) residing in one package from outside its package, you must do one of the following:

        Import the package member
        Import the member’s entire package
        Refer to the member by its fully qualified name
        Import the package member
        To import a specific member into the current file, put an import statement at the beginning of the file before any type definitions but after the package statement.

        For example if you are using HashMap class in your class than you do need to import HashMap class from java.util package.

        package com.knpcode.programs;

        import java.util.HashMap;
        import java.util.Map;

        public class MyClass {
          public static void main(String[] args) {
            Map<String, String> testMap = new HashMap<String, String>();
          }
        }

        Import the member’s entire package
        Rather than importing specific classes you can import the whole package.

        import java.util.*;
        Refer to the member by its fully qualified name
        Rather than using import statement you can also use fully qualified name. For example if you are using HashMap class in your class then you can use fully qualified name.

        package com.knpcode.programs;

        public class MyClass {
          public static void main(String[] args) {
            java.util.Map<String, String> testMap = new java.util.HashMap<String, String>();
          }
        }



  */



class Scan {
    public static void main(String[] ar) {
        // Declare the object and initialize with a predefined object which takes input
        // from keyboard

        Scanner sc = new Scanner(System.in);
        // At this moment writing Scanner sc, we are declaring sc as an object of Scanner class.
        // System.in within the round brackets tells Java that this will be System Input, i.e., input will be given to the system.
        // String input
        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        // Character input
        System.out.println("Enter your Gender:");
        char gender = sc.next().charAt(0); // it will take the first character of the entered word

        // Numerical data input
        // byte, short and float can be read
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.print("Enter your Phone Number:+91 ");
        long phoneNo = sc.nextLong();
        System.out.println("Enter your CGPA:");
        double CGPA = sc.nextDouble();

        // Printing all the values
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: +91 " + phoneNo);
        System.out.println("CGPA: " + CGPA);

        /*
        Key Points about Java Scanner Class
            If we want to create an object of Scanner class, we need to pass the System.in as an argument if we’re going to take input from the keyboard. If we’re going to receive input from a file, then we need to pass the file object of the class file.
            If we want to take input for the primitive type we have to write nextABC(); here ABC is a primitive type. For example, if we’re going to take input of a short type, then we need to declare like nextShort().
            If we want to take input for string, we nextLine() is used.
            If we want to take input for the character, we have to use next().

         */


    }
}

class Scan1 {
    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);

        int number1,number2,number3,total ;

        System.out.println("Enter first number: ");
        number1= sc.nextInt();

        System.out.println("Enter second number: ");
        number2= sc.nextInt();

        System.out.println("Enter third number: ");
        number3= sc.nextInt();

        total = number1 * number2 * number3;

        System.out.println("The multiplication of all numbers are :" + total);


    }
 }
 


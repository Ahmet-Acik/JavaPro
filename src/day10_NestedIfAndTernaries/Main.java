package day10_NestedIfAndTernaries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        /*
        Java Nested if..else Statement
            In Java, it is also possible to use if..else statements inside an if...else statement.
            It's called the nested if...else statement.

            Here's a program to find the largest of 3 numbers using the nested if...else statement.

            Example: Nested if...else Statement


         */
        // declaring double type variables
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

        // checks if n1 is greater than or equal to n2
        if (n1 >= n2) {

            // if...else statement inside the if block
            // checks if n1 is greater than or equal to n3
            if (n1 >= n3) {
                largest = n1;
            }

            else {
                largest = n3;
            }
        } else {

            // if..else statement inside else block
            // checks if n2 is greater than or equal to n3
            if (n2 >= n3) {
                largest = n2;
            }

            else {
                largest = n3;
            }
        }

        System.out.println("Largest Number: " + largest); // Output:Largest Number: 4.5

        System.out.println("===================================");

        //In the above programs, we have assigned the value of variables ourselves to make this easier.
        //
        //However, in real-world applications, these values may come from user input data, log files, form submission, etc.



        // Example 1:
        // variable declaration
        int na = 5, nb = 10, max;

        System.out.println("First num: " + na);
        System.out.println("Second num: " + nb);

        // Largest among n1 and n2
        max = (na > nb) ? na : nb;

        // Print the largest number
        System.out.println("Maximum is = " + max);

        //Output:
        //        First num: 5
        //        Second num: 10
        //        Maximum is = 10

        System.out.println("===================================");



    }
}





class Ternary {

      /*
        Ternary Operator in Java

        In Java, a ternary operator can be used to replace the if...else statement in certain situations.
        Before you learn about the ternary operator, make sure you visit Java if...else statement.


        A ternary operator evaluates the test condition and executes a block of code based on the result of the condition.

        Its syntax is:

        condition ? expression1 : expression2;
        Here, condition is evaluated and

        if condition is true, expression1 is executed.
        And, if condition is false, expression2 is executed.

        The ternary operator takes 3 operands (condition, expression1, and expression2).
        Hence, the name ternary operator.


        Ternary Operator
        Java ternary operator is the only conditional operator that takes three operands.
        It’s a one-liner replacement for if-then-else statement and used a lot in Java programming.
        We can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators.
        Although it follows the same algorithm as of if-else statement,
        the conditional operator takes less space and helps to write the if-else statements in the shortest way possible.

        Syntax:
        variable = Expression1 ? Expression2: Expression3

        If operates similarly to that of the if-else statement
        as in Expression2 is executed if Expression1 is true else Expression3 is executed.
         */


    public static void main(String[] args) {

        // take input from users
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        // ternary operator checks if
        // marks is greater than 40
        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");
        input.close();

        System.out.println("===================================");

        /*
                    Output 1

            Enter your marks:
            75
            You pass the exam.
            Suppose the user enters 75.
            Then, the condition marks > 40 evaluates to true.
            Hence, the first expression pass is assigned to result.

                Output 2

            Enter your marks:
            24
            You fail the exam.
            Now, suppose the user enters 24.
            Then, the condition marks > 40 evaluates to false.
            Hence, the second expression fail is assigned to result.


         */

        /*
                When to use the Ternary Operator?
            In Java, the ternary operator can be used to replace certain types of if...else statements. For example,

            You can replace this code

            class Main {
              public static void main(String[] args) {

                // create a variable
                int number = 24;

                if(number > 0) {
                  System.out.println("Positive Number");
                }
                else {
                  System.out.println("Negative Number");
                }
              }
            }

            with

            class Main {
              public static void main(String[] args) {

                // create a variable
                int number = 24;

                String result = (number > 0) ? "Positive Number" : "Negative Number";
                System.out.println(result);
              }
            }
            Output : Positive Number

            Here, both programs give the same output.
            However, the use of the ternary operator makes our code more readable and clean.

            see below
         */


        // create a variable
        int number = 24;

        if(number > 0) {
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Negative Number");
        }

        System.out.println("===================================");

        // create a variable
        int number1 = 24;

        String result1 = (number1 > 0) ? "Positive Number" : "Negative Number";
        System.out.println(result1);


        System.out.println("===================================");


        //Example 2:
        // variable declaration
        int na = 5, nb = 10, res;

        System.out.println("First num: " + na);
        System.out.println("Second num: " + nb);

        // Performing ternary operation
        res = (na > nb) ? (na + nb) : (na - nb);

        // Print the largest number
        System.out.println("Result = " + res);

        //Output:
        //        First num: 5
        //        Second num: 10
        //        Result = -5


        System.out.println("===================================");

        String shorthand = "java";
        String langOne = "java";
        String langTwo = "javascript";
        String language = "js".equals(shorthand) ? langTwo : langOne;
        System.out.println("Language is " + language);


    }
}

class NestedTernaries {
    public static void main(String[] args) {

        /*

        Nested Ternary Operators
            It is also possible to use one ternary operator inside another ternary operator.
            It is called the nested ternary operator in Java.

            Here's a program to find the largest of 3 numbers using the nested ternary operator.



         */
        // create a variable
        int n1 = 2, n2 = 9, n3 = -11;

        // nested ternary operator
        // to find the largest number
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest);

        /*
        Output : Largest Number: 9
            In the above example, notice the use of the ternary operator,

            (n1 >= n2) ? ((n1 >=n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
            Here,

            (n1 >= n2) - first test condition that checks if n1 is greater than n2
            (n1 >= n3) - second test condition that is executed if the first condition is true
            (n2 >= n3) - third test condition that is executed if the first condition is false
            Note: It is not recommended to use nested ternary operators. This is because it makes our code more complex.

         */
        System.out.println("===================================");


        int number = 50;
        String size = number > 30 ? number > 60 ? "Biggest" : "Bigger" :"Big";
        System.out.println("Number is " + size); // result will be "Bigger
        /*
                Above example has a ternary operator with the first operand as a condition that compares a number with 30.
        If it is greater, then the control will move to the inner ternary operator(that is Operand 2) which compares the number with 60.
        This is the condition of the inner ternary operator.

        If the condition of the inner ternary operator is true, then the result will be “Biggest” else “Bigger”.

        If the condition of the outer ternary operator is false, then the inner ternary operator will never be executed and the result will be “Big”.
        Nested ternary operator in the above example when converted to an if-else block will look as below.
        String size = "";
        if(number > 30) {
           if(number > 60) {
              size = "Biggest";
           } else {
              size = "Bigger";
           }
        } else {
           size = "Big";
        }

        A nested ternary operator can also be enclosed between parenthesis to enhance readability.
        Thus, the ternary operator used in the above example could also be written as

        String size = number > 30 ? (number > 60 ? "Biggest" : "Bigger") :"Big";

         */
    }
}
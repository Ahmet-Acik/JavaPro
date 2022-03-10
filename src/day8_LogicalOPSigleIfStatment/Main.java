package day8_LogicalOPSigleIfStatment;

public class Main {
    // The if Statement
    //Use the if statement to specify a block of Java code to be executed if a condition is true.

    // Syntax
    //   if (condition) {
    //     // block of code to be executed if the condition is true
    // }
    // Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.
    //

            /*How if statement works?
            The if statement evaluates the test expression inside the parenthesis ().

            Here, condition is a boolean expression such as age >= 18.

            if condition evaluates to true, statements are executed
            if condition evaluates to false, statements are skipped

             */

    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");

            int i = 10;

            if (i < 15)
                System.out.println("10 is less than 15");

            // This statement will be executed
            // as if considers one statement by default
            System.out.println("Outside if-block");


            String str = "GeeksForGeeks";
            int i2 = 4;

            // if block
            if (i2== 4) {
                i2++;
                System.out.println(str); //GeeksForGeeks
            }

            // Executed by default
            System.out.println("i2 = " + i);





        }


    }
}
class ComparisonDemo {

    //The Equality and Relational Operators
    //The equality and relational operators determine if one operand is greater than, less than, equal to, or not equal to another operand.
    // The majority of these operators will probably look familiar to you as well.
    // Keep in mind that you must use "==", not "=", when testing if two primitive values are equal.
    /*
            ==      equal to
            !=      not equal to
            >       greater than
            >=      greater than or equal to
            <       less than
            <=      less than or equal to
     */
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }


}
class ConditionalDemo1 {
            //The Conditional Operators
            //The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions.
            // These operators exhibit "short-circuiting" behavior, which means that the second operand is evaluated only if needed.
            //
            //&& Conditional-AND
            //|| Conditional-OR

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");



    }
}class ConditionalDemo2 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);


        // Another conditional operator is ?:,
        // which can be thought of as shorthand for an if-then-else statement .
        // This operator is also known as the ternary operator because it uses three operands.
        // In the above example, this operator should be read as: "If someCondition is true, assign the value of value1 to result.
        // Otherwise, assign the value of value2 to result."
        //Because someCondition is true, this program prints "1" to the screen. Use the ?: operator instead of an if-then-else statement if it makes your code more readable;
        // for example, when the expressions are compact and without side-effects (such as assignments).
    }
}


class BitWiseOr {
    public static void main(String[] args) {

        int number1 = 12, number2 = 25, result;

        // bitwise OR between 12 and 25
        result = number1 | number2;
        System.out.println(result);    // prints 29
    }
}

class IfStatement {
    public static void main(String[] args) {

        int number = 10;

        // checks if number is less than 0
        if (number < 0) {
            System.out.println("The number is negative.");
        }

        System.out.println("Statement outside if block"); // Statement outside if block

        // In the program, number < 0 is false. Hence, the code inside the parenthesis is skipped.


        String language = "Java";
        //We can also use Java Strings as the test condition.
        //
        //Example 2: Java if with String

        // if statement
        if (language == "Java") {
            System.out.println("Best Programming Language");

            //In the above example, we are comparing two strings in the if block.
        }

    }
}

class IfElse {
    public static void main(String[] args) {
        int number = 10;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // execute this block
        // if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");

        /*
                In the above example, we have a variable named number.
                Here, the test expression number > 0 checks if number is greater than 0.

                Since the value of the number is 10, the test expression evaluates to true.
                Hence code inside the body of if is executed.

         */

        int number1 = -5;
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // execute this block
        // if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");

        /*
                Now, we changed the value of the number to a negative integer. Let's say -5.

                int number = -5;
                If we run the program with the new value of number, the output will be:

                The number is not positive.
                Statement outside if...else block
                Here, the value of number is -5. So the test expression evaluates to false.
                Hence code inside the body of else is executed.

         */

    }
}


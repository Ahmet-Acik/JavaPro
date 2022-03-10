package day7_Operators;

import java.util.Scanner;

public class Operators {

        public static void main(String args[]) {

        // Java divides the operators into the following groups:
        //
        //1 Arithmetic operators
        //2 Assignment operators
        //3 Comparison operators
        //4 Logical operators
        //5 Bitwise operators

    /* 1 Arithmetic Operators.
            Arithmetic operators are used to perform common mathematical operations.

            Operator	Name	    Description	                                    Example
            +	        Addition	    Adds together two values	                x + y
            -	        Subtraction	    Subtracts one value from another	        x - y
            *	        Multiplication	Multiplies two values	                    x * y
            /	        Division	    Divides one value by another	            x / y
            %	        Modulus	        Returns the division remainder	            x % y
            ++	        Increment	    Increases the value of a variable by 1	    ++x
            --	        Decrement	    Decreases the value of a variable by 1	    --x

*/
        }
}


class ArithmeticDemo {

        public static void main(String[] args) {

                int result = 1 + 2;
                // result is now 3
                System.out.println("1 + 2 = " + result);
                int original_result = result;

                result = result - 1;
                // result is now 2
                System.out.println(original_result + " - 1 = " + result);
                original_result = result;

                result = result * 2;
                // result is now 4
                System.out.println(original_result + " * 2 = " + result);
                original_result = result;

                result = result / 2;
                // result is now 2
                System.out.println(original_result + " / 2 = " + result);
                original_result = result;

                result = result + 8;
                // result is now 10
                System.out.println(original_result + " + 8 = " + result);
                original_result = result;

                result = result % 7;
                // result is now 3
                System.out.println(original_result + " % 7 = " + result);
        }
}


class ConcatDemo {
    public static void main(String[] args) {
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
}


    /*
        //2 Java Unary Operator
        //The Java unary operators require only one operand.
        Unary operators are used to perform various operations i.e.:
        // The Unary Operators
        //The unary operators require only one operand;
        // they perform various operations such as incrementing/decrementing a value by one, negating an expression, or inverting the value of a boolean.

        The increment/decrement operators can be applied before (prefix) or after (postfix) the operand.
        The code result++; and ++result; will both end in result being incremented by one.
        The only difference is that the prefix version (++result) evaluates to the incremented value, whereas the postfix version (result++) evaluates to the original value.
        If you are just performing a simple increment/decrement, it doesn't really matter which version you choose.
        But if you use this operator in part of a larger expression, the one that you choose may make a significant difference.
        */


class UnaryDemo {
        public static void main(String[] args) {

                int result = +1;
                // result is now 1
                System.out.println(result);

                result--;
                // result is now 0
                System.out.println(result);

                result++;
                // result is now 1
                System.out.println(result);

                result = -result;
                // result is now -1
                System.out.println(result);

                boolean success = false;
                // false
                System.out.println(success);
                // true
                System.out.println(!success);
        }
}

class PrePostDemo {

        public static void main(String[] args) {
                int i = 3;
                i++;
                // prints 4
                System.out.println(i);
                ++i;
                //  prints 5
                System.out.println(i);
                // prints 6
                System.out.println(++i);
                // prints 6
                System.out.println(i++);
                // prints 7
                System.out.println(i);

                i--;
                System.out.println(i);
                --i;
                //  prints 6
                System.out.println(i);
                // prints 5
                System.out.println(--i);
                // prints 4
                System.out.println(i--);
                // prints 4
                System.out.println(i);
                // prints 3

                int x = 10;
                System.out.println(x++);//10 (11)
                System.out.println(++x);//12
                System.out.println(x--);//12 (11)
                System.out.println(--x);//10

        }
}



        // 2 Java Assignment Operators.
        //Assignment operators are used to assign values to variables.
        //int x = 10;
        //In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:

            /*The addition assignment operator (+=) adds a value to a variable:
            int x = 10;
            x += 5;
            System.out.println(x); // 15

            Operator	Example	    Same As
            =	        x = 5	    x = 5
            +=	        x += 3	    x = x + 3
            -=	        x -= 3	    x = x - 3
            *=	        x *= 3	    x = x * 3
            /=	        x /= 3	    x = x / 3
            %=	        x %= 3	    x = x % 3
            &=	        x &= 3	    x = x & 3
            |=	        x |= 3	    x = x | 3
            ^=	        x ^= 3	    x = x ^ 3
            >>=	        x >>= 3	    x = x >> 3
            <<=	        x <<= 3	    x = x << 3
            */




       /*   3 Java Relational/Comparison Operators,
        //Relational / Comparison operators are used to compare two values:

        Operator	Name	                    Example
        ==	        Equal to	                x == y
        !=	        Not equal	                x != y
        >	        Greater than	            x > y
        <	        Less than	                x < y
        >=	        Greater than or equal to	x >= y
        <=	        Less than or equal to	    x <= y
        */

class ComparisonDemo {

        public static void main(String[] args) {
                int value1 = 1;
                int value2 = 2;
                if (value1 == value2)
                    System.out.println("value1 == value2");
                if (value1 != value2)
                    System.out.println("value1 != value2");
                if (value1 > value2)
                    System.out.println("value1 > value2");
                if (value1 < value2)
                    System.out.println("value1 < value2");
                if (value1 <= value2)
                    System.out.println("value1 <= value2");
        }
}


   /* 4 Java Logical Operators,
        Logical operators are used to determine the logic between variables or values:

        Operator	Name	        Description	Example	Try it
        && 	        Logical and	    Returns true if both statements are true	x < 5 &&  x < 10
        || 	        Logical or	    Returns true if one of the statements is true	x < 5 || x < 4
        !	        Logical not	    Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

             */


class ConditionalDemo1_TheAnd_Or {

        public static void main(String[] args) {
                int value1 = 1;
                int value2 = 2;
                if ((value1 == 1) && (value2 == 2))
                    System.out.println("value1 is 1 AND value2 is 2");
                if ((value1 == 1) || (value2 == 1))
                    System.out.println("value1 is 1 OR value2 is 1");

                //The Conditional Operators
                //The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions.
                // These operators exhibit "short-circuiting" behavior, which means that the second operand is evaluated only if needed.
                //
                //&& Conditional-AND
                //|| Conditional-OR

        }


}
class ConditionalDemo2_Ternary {

        public static void main(String[] args) {
                int value1 = 1;
                int value2 = 2;
                int result;
                boolean someCondition = true;
                result = someCondition ? value1 : value2;

                System.out.println(result);


                // Another conditional operator is ?:, which can be thought of as shorthand for an if-then-else statement .
                // This operator is also known as the ternary operator because it uses three operands.
                // In the above example, this operator should be read as: "If someCondition is true, assign the value of value1 to result.
                // Otherwise, assign the value of value2 to result."
                //Because someCondition is true, this program prints "1" to the screen. Use the ?: operator instead of an if-then-else statement if it makes your code more readable; for example, when the expressions are compact and without side-effects (such as assignments).
                // take input from users

                Scanner input = new Scanner(System.in);
                System.out.println("Enter your marks: ");
                double marks = input.nextDouble();

                // ternary operator checks if
                // marks is greater than 40
                String result1 = (marks > 40) ? "pass" : "fail";

                System.out.println("You " + result1 + " the exam.");
                input.close();

                /*
                Suppose the user enters 75.
                 Then, the condition marks > 40 evaluates to true. Hence, the first expression pass is assigned to result.
                Now, suppose the user enters 24.
                Then, the condition marks > 40 evaluates to false. Hence, the second expression fail is assigned to result.

                When to use the Ternary Operator?
                In Java, the ternary operator can be used to replace certain types of if...else statements. For example,

                You can replace this code

                */


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
                System.out.println("Largest Number: " + largest); // Output  Largest Number: 9
                /*
                        In the above example, notice the use of the ternary operator,

                        (n1 >= n2) ? ((n1 >=n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
                        Here,

                        (n1 >= n2) - first test condition that checks if n1 is greater than n2
                        (n1 >= n3) - second test condition that is executed if the first condition is true
                        (n2 >= n3) - third test condition that is executed if the first condition is false
                        Note: It is not recommended to use nested ternary operators.
                        This is because it makes our code more complex.
                 */


        }
}

package day9_IfElseThenStatements;

public class Main {
        // The if Statement
        //Use the if statement to specify a block of Java code to be executed if a condition is true.

    /* Syntax
      if (condition) {
        // block of code to be executed if the condition is true
    }
    Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

     */

    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }


        /* The else Statement
        Use the else statement to specify a block of code to be executed if the condition is false.

                Syntax
        if (condition) {
            // block of code to be executed if the condition is true
        } else {
            // block of code to be executed if the condition is false
        }
        Example
        */


        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    // Outputs "Good evening."

        /*The else if Statement
        Use the else if statement to specify a new condition if the first condition is false.

        Syntax
        if (condition1) {
          // block of code to be executed if condition1 is true
        } else if (condition2) {
          // block of code to be executed if the condition1 is false and condition2 is true
        } else {
          // block of code to be executed if the condition1 is false and condition2 is false
        }
        Example

         */

        int time1 = 22;
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time1 < 20) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        /*Short Hand If...Else (Ternary Operator)
            There is also a short-hand if else, which is known as the ternary operator because it consists of three operands. It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:

            Syntax
            variable = (condition) ? expressionTrue :  expressionFalse;
            Instead of writing:

            Instead of writing:
            Example

            int time1 = 20;
            if (time1 < 18) {
              System.out.println("Good day.");
            } else {
              System.out.println("Good evening.");
            }
          You can simply write:

        Example
        */

        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


    }
}
            /*The if-then-else Statement
        The if-then-else statement provides a secondary path of execution when an "if" clause evaluates to false. 
        You could use an if-then-else statement in the applyBrakes method to take some action if the brakes are applied when the bicycle is not in motion. 
        In this case, the action is to simply print an error message stating that the bicycle has already stopped.

        void applyBrakes() {
        if (isMoving) {
        currentSpeed--;
        } else {
        System.err.println("The bicycle has already stopped!");
        }
        }
        The following program, IfElseDemo, assigns a grade based on the value of a test score: an A for a score of 90% or above, a B for a score of 80% or above, and so on.

             */

class IfElseDemo {
    public static void main(String[] args) {

        int testScore = 76;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        // You may have noticed that the value of testScore can satisfy more than one expression in the compound statement: 76 >= 70 and 76 >= 60.
        // However, once a condition is satisfied, the appropriate statements are executed (grade = 'C';) and the remaining conditions are not evaluated.


        /*
        } else if (testScore >= 60); { // error <else' without 'if'>
            grade = 'D';
        } else {
            grade = 'F';

         */
        // That trailing ; is making Java believe that the if statement is finished, and the {} block after it is outside the if condition, consequently the else part has no matching if preceding it.
        //This is a rather frequent bug, and a hard one to spot.
        // If it weren't for the else block, the code would have compiled correctly, but it would have been wrong.
        // Bottom line: never, ever put a ; in the opening line of an if, for or while statement.


        int number = 0;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }

        // if both condition is false
        else {
            System.out.println("The number is 0.");
        }

        /*
            In the above example, we are checking whether number is positive, negative, or zero.
            Here, we have two condition expressions:

            number > 0 - checks if number is greater than 0
            number < 0 - checks if number is less than 0
            Here, the value of number is 0. So both the conditions evaluate to false.
            Hence the statement inside the body of else is executed.

              Note: Java provides a special operator called ternary operator,
              which is a kind of shorthand notation of if...else...if statement.

              e.g., Ternary Operator in Java
            A ternary operator evaluates the test condition and executes a block of code based on the result of the condition.

            Its syntax is:

            condition ? expression1 : expression2;
            Here, condition is evaluated and

            if condition is true, expression1 is executed.
            And, if condition is false, expression2 is executed.
            The ternary operator takes 3 operands (condition, expression1, and expression2).
            Hence, the name ternary operator.



         */

    }
}
      /* The switch Statement
         Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths. A switch works with the byte, short, char, and int primitive data types. It also works with enumerated types (discussed in Enum Types), the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).

        The following code example, SwitchDemo, declares an int named month whose value represents a month. The code displays the name of the month, based on the value of month, using the switch statement.


       */
class SwitchDemo {
    public static void main(String[] args) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
        // In this case, August is printed to standard output.
    }
}

        // The body of a switch statement is known as a switch block.
        // A statement in the switch block can be labeled with one or more case or default labels.
        // The switch statement evaluates its expression, then executes all statements that follow the matching case label.

       //  You could also display the name of the month with if-then-else statements:
/*
        int month = 8;
        if (month == 1) {
        System.out.println("January");
        } else if (month == 2) {
        System.out.println("February");
        }
        ...  // and so on
        Deciding whether to use if-then-else statements or a switch statement is based on readability and the expression that the statement is testing.
        An if-then-else statement can test expressions based on ranges of values or conditions,
        whereas a switch statement tests expressions based only on a single integer, enumerated value, or String object.

        Another point of interest is the break statement.
        Each break statement terminates the enclosing switch statement.
        Control flow continues with the first statement following the switch block.
        The break statements are necessary because without them, statements in switch blocks fall through:
        All statements after the matching case label are executed in sequence, regardless of the expression of subsequent case labels, until a break statement is encountered.
        The program SwitchDemoFallThrough, below, shows statements in a switch block that fall through.
        The program displays the month corresponding to the integer month and the months that follow in the year:


 */

 class SwitchDemoFallThrough {

     public static void main(String[] args) {
         java.util.ArrayList<String> futureMonths =
                 new java.util.ArrayList<String>();

         int month = 8;

         switch (month) {
             case 1:
                 futureMonths.add("January");
             case 2:
                 futureMonths.add("February");
             case 3:
                 futureMonths.add("March");
             case 4:
                 futureMonths.add("April");
             case 5:
                 futureMonths.add("May");
             case 6:
                 futureMonths.add("June");
             case 7:
                 futureMonths.add("July");
             case 8:
                 futureMonths.add("August");
             case 9:
                 futureMonths.add("September");
             case 10:
                 futureMonths.add("October");
             case 11:
                 futureMonths.add("November");
             case 12:
                 futureMonths.add("December");
                 break;
             default:
                 break;
         }

         if (futureMonths.isEmpty()) {
             System.out.println("Invalid month number");
         } else {
             for (String monthName : futureMonths) {
                 System.out.println(monthName);
             }
         }



     }
 }

 class StringSwitchDemo {
            // Using Strings in switch Statements
            // you can use a String object in the switch statement's expression.
            // The following code example, StringSwitchDemo, displays the number of the month based on the value of the String named month:

     public static int getMonthNumber(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    public static void main(String[] args) {

        String month = "August";

        int returnedMonthNumber =
                StringSwitchDemo.getMonthNumber(month);

        if (returnedMonthNumber == 0) {
            System.out.println("Invalid month");
        } else {
            System.out.println(returnedMonthNumber);
        }

    /* The String in the switch expression is compared with the expressions associated with each case label
        as if the String.equals method were being used.
        In order for the StringSwitchDemo example to accept any month regardless of case,
        month is converted to lowercase (with the toLowerCase method),
        and all the strings associated with the case labels are in lowercase.

     */
     }
}



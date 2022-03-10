package day18_NestedLoops;

class Main {
    public static void main(String[] args) {
        /*

            If a loop exists inside the body of another loop, it's called a nested loop.
            Here's an example of the nested for loop.

                    // outer loop
                    for (int i = 1; i <= 5; ++i) {
                      // codes

                      // inner loop
                      for(int j = 1; j <=2; ++j) {
                        // codes
                      }
                    ..
                    }
            Here, we are using a for loop inside another for loop.

            We can use the nested loop to iterate through each day of a week for 3 weeks.

            In this case, we can create a loop to iterate three times (3 weeks).
            And, inside the loop, we can create another loop to iterate 7 times (7 days).

         */
        int weeks = 3;
        int days = 7;

        // outer loop prints weeks
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop prints days
            for (int j = 1; j <= days; ++j) {
                System.out.println("  Day: " + j);
            }

        }

        /*
            In the above example, the outer loop iterates 3 times and prints 3 weeks.
            And, the inner loop iterates 7 times and prints the 7 days.


             */


    }
}
class JavaForLoopInsideWhileLoop {
        public static void main(String[] args) {
        /*
            We can also create nested loops with while and do...while in a similar way.

            Note: It is possible to use one type of loop inside the body of another loop.
            For example, we can put a for loop inside the while loop.



         */
            int weeks = 3;
            int days = 7;
            int i = 1;

            // outer loop
            while (i <= weeks) {
                System.out.println("Week: " + i);

                // inner loop
                for (int j = 1; j <= days; ++j) {
                    System.out.println("  Days: " + j);
                }
                ++i;
            }

            /*
            Here you can see that the output of both Example 1 and Example 2 is the same.

             */
        }
}



class JavaNestedLoopsToCreatePattern {
    public static void main(String[] args) {

        int rows = 5;

        // outer loop
        for (int i = 1; i <= rows; ++i) {

            // inner loop to print the numbers
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        /*
        We can use the nested loop in Java to create patterns like full pyramid, half pyramid, inverted pyramid, and so on.

        Here is a program to create a half pyramid pattern using nested loops.


         */

    }
}

class BreakAndContinueInsideNestedLoops {
    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;

        // outer loop
        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop
            for(int j = 1; j <= days; ++j) {

                // break inside the inner loop
                if(i == 2) {
                    break;
                }
                System.out.println("  Days: " + j);
            }

            /*
            In the above example, we have used the break statement inside the inner for loop. Here, the program skips the loop when i is 2.

            Hence, days for week 2 are not printed. However, the outer loop that prints week is unaffected.


            Similarly, when we use a continue statement inside the inner loop, it skips the current iteration of the inner loop only.
            The outer loop is unaffected. For example, see the next class BreakAndContinueInsideNestedLoops2

             */
        }
    }
}

class BreakAndContinueInsideNestedLoops2 {
    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;

        // outer loop
        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop
            for(int j = 1; j <= days; ++j) {

                // continue inside the inner loop
                if(j % 2 != 0) {
                    continue;
                }
                System.out.println("  Days: " + j);
            }

            /*
            In the above example, we have used the continue statement inside the inner for loop.
            Notice the code,

                if(j % 2 != 0) {
                  continue;
                }
            Here, the continue statement is executed when the value of j is odd.
            Hence, the program only prints those days that are even.

            We can see the continue statement has affected only the inner loop.
            The outer loop is working without any problem.


             */
        }
    }
}

class DivideTwoNumbers {

    public static void main(String[] args) {
        
        int a =30;
        int b= 7;
        int count=0;

        while (a>=b) {
            a-=b;
            count++;
        }
        System.out.println("count = " + count);
    }
}


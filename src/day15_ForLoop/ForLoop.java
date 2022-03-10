package day15_ForLoop;

public class ForLoop {
    /*
       Loops in Java
       The Java for loop is used to iterate a part of the program several times.
       If the number of iteration is fixed, it is recommended to use for loop.


       Loops in Java

       Java Simple for Loop
       A simple for loop is the same as C/C++.

       We can initialize the variable, check condition and increment/decrement value.
       It consists of four parts:

               Initialization: It is the initial condition which is executed once when the loop starts.
               Here, we can initialize the variable, or we can use an already initialized variable.
               It is an optional condition.

               Condition: It is the second condition which is executed each time to test the condition of the loop.
               It continues execution until the condition is false. It must return boolean value either true or false.
               It is an optional condition.

               Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
               Statement: The statement of the loop is executed each time until the second condition is false.
       Syntax:

               for(initialization; condition; increment/decrement){
                    //statement or code to be executed
                }
                Flowchart:

               for loop in java flowchart
                Example:

                ForExample.java

            Java for Loop
            Java for loop is used to run a block of code for a certain number of times. The syntax of for loop is:

            for (initialExpression; testExpression; updateExpression) {
                // body of the loop
            }
            Here,

            The initialExpression initializes and/or declares variables and executes only once.
            The condition is evaluated. If the condition is true, the body of the for loop is executed.
            The updateExpression updates the value of initialExpression.
            The condition is evaluated again. The process continues until the condition is false.


         */

    //Java Program to demonstrate the example of for loop
//which prints table of 1

        public static void main(String[] args) {
            //Code of Java for loop
            for(int i=1;i<=10;i++){
                System.out.println(i);
            }
        }
    }

    /*

    Java Nested for Loop

    If we have a for loop inside the another loop, it is known as nested for loop.
    The inner loop executes completely whenever outer loop executes.
            Example:

    NestedForExample.java

     */

    class NestedForExample {
        public static void main(String[] args) {
            //loop of i
            for (int i = 1; i <= 3; i++) {
                //loop of j
                for (int j = 1; j <= 3; j++) {
                    System.out.println(i + " " + j);
                }//end of i
            }//end of j
            /*
    Output:


            1 1
            1 2
            1 3
            2 1
            2 2
            2 3
            3 1
            3 2
            3 3

             */

        }
    }

   /*     Pyramid Example 1:

          PyramidExample.java
     */

    class PyramidExample {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();//new line

            /*
    Output:

    *
    * *
    * * *
    * * * *
    * * * * *

    */
            }
        }
    }

        /*
            Pyramid Example 2:

            PyramidExample2.java


         */
        class PyramidExample2 {
        public static void main(String[] args) {
            int term = 6;
            for (int i = 1; i <= term; i++) {
                for (int j = term; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();//new line

                /* Output:

                 * * * * * *
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *

                 */
            }
        }
    }
/*
    Java for-each Loop
    The for-each loop is used to traverse array or collection in Java.
    It is easier to use than simple for loop because we don't need to increment value and use subscript notation.

    It works on the basis of elements and not the index. It returns element one by one in the defined variable.


    Syntax:

            for(data_type variable : array_name){
            //code to be executed
                }

    Example:

    ForEachExample.java

        //Java For-each loop example which prints the elements of the array
        In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList).
        It is also known as the enhanced for loop.

            for-each Loop Sytnax
        The syntax of the Java for-each loop is:

        for(dataType item : array) {
            ...
        }
        Here,

        array - an array or a collection
        item - each item of array/collection is assigned to this variable
        dataType - the data type of the array/collection

 */

    class ForEachExample {
        public static void main(String[] args) {
            //Declaring an array
            int arr[] = {12, 23, 44, 56, 78};
            //Printing array using for-each loop
            for (int i : arr) {
                System.out.println(i);

            /*
            Output:

            12
            23
            44
            56
            78


                    */

                // create an array
                int[] numbers = {3, 9, 5, -5};

                // for each loop
                for (int number: numbers) {
                    System.out.println(number);

                    /*
                    Here, we have used the for-each loop to print each element of the numbers array one by one.

                    In the first iteration, item will be 3.
                    In the second iteration, item will be 9.
                    In the third iteration, item will be 5.
                    In the fourth iteration, item will be -5.


                     */
                }
            }
        }
    }
// Calculate the sum of all elements of an array

class SumOfAllElementsOfAnArray {
    public static void main(String[] args) {

        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        // iterating through each element of the array
        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);


        /*
        In the above program, the execution of the for each loop looks as:

        Iteration	Variables
        1	        number = 3
                    sum = 0 + 3 = 3
        2	        number = 4
                    sum = 3 + 4 = 7
        3	        number = 5
                    sum = 7 + 5 = 12
        4	        number = -5
                    sum = 12 + (-5) = 7
        5	        number = 0
                    sum = 7 + 0 = 7
        6	        number = 12
                    sum = 7 + 12 = 19
        As we can see, we have added each element of the numbers array to the sum variable in each iteration of the loop.



         */
    }
}
class ForloopVsForEachLoop {
    public static void main(String[] args) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using a for loop
        for (int i = 0; i < vowels.length; ++ i) {
            System.out.println(vowels[i]);
        }

        char[] vowels1 = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using the for-each loop
        for (char item: vowels1) {
            System.out.println(item);
        }
        /*
        Here, the output of both programs is the same.
        However, the for-each loop is easier to write and understand.
        This is why the for-each loop is preferred over the for loop when working with arrays and collections.


         */

    }
}


        /* Java Labeled For Loop
        We can have a name of each Java for loop. To do so, we use label before the for loop.
        It is useful while using the nested for loop as we can break/continue specific for loop.

               Note: The break and continue keywords breaks or continues the innermost for loop respectively.
        Syntax:

        labelname:
               for(initialization; condition; increment/decrement){
               //code to be executed
               }
               Example:

        LabeledForExample.java

        //A Java program to demonstrate the use of labeled for loop

         */
        class LabeledForExample {
        public static void main(String[] args) {
            //Using Label for outer and for loop
            aa:
            for (int i = 1; i <= 3; i++) {
                bb:
                for (int j = 1; j <= 3; j++) {
                    if (i == 2 && j == 2) {
                        break aa;
                    }
                    System.out.println(i + " " + j);
                }
            }
        }
    }

        /*
        Output:


                1 1
                1 2
                1 3
                2 1
        If you use break bb;, it will break inner loop only which is the default behaviour of any loop.

        LabeledForExample2.java


         */
        class LabeledForExample2 {
        public static void main(String[] args) {
            aa:
            for (int i = 1; i <= 3; i++) {
                bb:
                for (int j = 1; j <= 3; j++) {
                    if (i == 2 && j == 2) {
                        break bb;
                    }
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    /*
    Output:

            1 1
            1 2
            1 3
            2 1
            3 1
            3 2
            3 3

     */

        /* Java Infinitive for Loop
        If you use two semicolons ;; in the for loop, it will be infinitive for loop.

                Syntax:

                for(;;){
        //code to be executed
        }
        Example:

        ForExample.java

        //Java program to demonstrate the use of infinite for loop
        //which prints an statement


     */
        class ForExample {
        public static void main(String[] args) {
            //Using no condition in for loop
            for (; ; ) {
                System.out.println("infinitive loop");
            }
        }
            //
            // Output:
            //
            // infinitive loop
            // infinitive loop
            // infinitive loop
            // infinitive loop
            // infinitive loop
            // ctrl+c
            // Now, you need to press ctrl+c to exit from the program.
        }




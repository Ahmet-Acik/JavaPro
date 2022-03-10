package day6_PrimativeTypeCasting;

public class Main {
    public static void main(String[] args) {
        //Type Casting
        //The process of converting the value of one data type (int, float, double, etc.)
        // to another data type is known as typecasting.
        //In Java, there are 13 types of type conversion.
        // However, in this tutorial, we will only focus on the major 2 types.


        //1. Widening Type Casting
        //
        //2. Narrowing Type Casting

//        1 Widening Type Casting
//        In Widening Type Casting, Java automatically converts one data type to another data type.
        // create int type variable
        int num = 10;
        System.out.println("The integer value: " + num);

        int i = 210;
        long l = i;
        System.out.println(i);


        // convert into double type
        double data = num;
        System.out.println("The double value: " + data);

        double d = 210.02;
        long l1 = (long)d;
        System.out.println(l1);

        // In the above example, we are assigning the int type variable named num to a double type variable named data.
        //Here, the Java first converts the int type data into the double type.
        // And then assign it to the double variable.
        //In the case of Widening Type Casting,
        // the lower data type (having smaller size) is converted into the higher data type (having larger size).
        // Hence there is no loss in data. This is why this type of conversion happens automatically.


    }
        //  2 Narrowing Type Casting
    public class Narrowing {

        //In Narrowing Type Casting, we manually convert one data type into another using the parenthesis.
        //
        //Example: Converting double into an int

        //    // create double type variable

        public static void main(String[] args) {
            double num = 10.99;
            System.out.println("The double value: " + num);

            //    // convert into int type
            int data = (int) num;
            System.out.println("The integer value: " + data);

            // In the above example, we are assigning the double type variable named num to an int type variable named data.
            //Notice the line,
            //int data = (int)num;
            //Here, the int keyword inside the parenthesis indicates that the num variable is converted into the int type.
            //In the case of Narrowing Type Casting, the higher data types (having larger size) are converted into lower data types (having smaller size).
            // Hence there is the loss of data. This is why this type of conversion does not happen automatically.
            //
            //Note: This is also known as Explicit Type Casting.
        }
    }

    // Example 1: Type conversion from int to String

    public static class ConversionFromIntToString {
        public static void main(String[] args) {
            /* create int type variable */
            int num = 10;
            System.out.println("The integer value is: " + num);

            // converts int to string type
            String data = String.valueOf(num);
            System.out.println("The string value is: " + data);

     //   In the above program, notice the line
            //String data = String.valueOf(num);
            //Here, we have used the valueOf() method of the Java String class to convert the int type variable into a string.
        }
    }


    //Example 2: Type conversion from String to int

   public static class ConversionFromStringToInt {
        public static void main(String[] args) {
            // create string type variable
            String data = "10";
            System.out.println("The string value is: " + data);

            // convert string variable to int
            int num = Integer.parseInt(data);
            System.out.println("The integer value is: " + num);

   // In the above example, notice the line
            //int num = Integer.parseInt(data);
            //Here, we have used the parseInt() method of the Java Integer class to convert a string type variable into an int variable.
            //Note: If the string variable cannot be converted into the integer variable then an exception named NumberFormatException occurs.

            String str = "1050";

            int iNum = Integer.parseInt(str);   //return primitive
            System.out.println(iNum);

            Integer oNum = Integer.valueOf(str); //return object
            System.out.println(oNum);

        //There are two methods available for String to int conversion:
            // Integer.parseInt() which returns a primitive int and
            // Integer.valueOf() which return an Integer object.

            // Integer.parseInt() Method
            String str1 = "85";
            int num1 = Integer.parseInt(str1);
            System.out.println(num1); // 85
            // with radix 16
            String strBase16 = "100";
            int num2 = Integer.parseInt(strBase16, 16);
            System.out.println(num2); // 256



            //Integer.valueOf() Method
            Integer num12 = Integer.valueOf("19");
            System.out.println(num12); // 19

            Integer num22 = Integer.valueOf("20", 16);
            System.out.println(num22); // 32


        }
    }

}


package day6_PrimativeTypeCasting;

import java.util.Scanner;

public class ParseAndValueOfCasting {

    public static void main(String[] args) {

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


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculator!");
        System.out.println("Enter first number:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter second number:");
        double b = Double.parseDouble(scanner.nextLine());
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Thank you for using calculator.");

        System.out.println("Addition:" + String.valueOf(sum)); //

        System.out.println("Enter a number and I'll double it: ");
        String s = scanner.nextLine();
        int a1 = Integer.parseInt(s);
        a1 = a1 * 2;
        System.out.println(a1);
        System.out.println("Addition:" + String.valueOf(sum));

    }
}

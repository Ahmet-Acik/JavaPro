package day21_ArrayUtilityForEachLoop;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        /*
        Multidimensional Arrays can be defined in simple words as array of arrays.
        Data in multidimensional arrays are stored in tabular form (in row major order).

        Syntax:

        data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];

        where:

        data_type: Type of data to be stored in the array. For example: int, char, etc.
        dimension: The dimension of the array created.
        For example: 1D, 2D, etc.
        array_name: Name of the array
        size1, size2, …, sizeN: Sizes of the dimensions respectively.
        Examples:


               You can create a 2D array using new as follows:

        data_type [] [] array_name = new data_type[row_size][column_size];
        Here,

        row_size = number of rows an array will contain.
        column_size = number of columns array will contain.

        Two dimensional array:
        int[][] twoD_arr = new int[10][20];

           The next method of initializing the 2d array in Java is by initializing the array at the time of declaration only.
            The general syntax for this initialization method is as given below:

            data_type[][] array_name = {{val_r1c1,val_r1c2,...val_r1cn},
                              {val_r2c1, val_r2c2,...val_r2cn}, …
                              {val_rnc1, val_rnc2,…val_rncn}};
            For Example, if you have a 2×3 array of type int, then you can initialize it with the declaration as:

            int [][] intArray = {{1, 2, 3},
                       {4, 5, 6}};





        Three dimensional array:
        int[][][] threeD_arr = new int[10][20][30];

        Size of multidimensional arrays:
        The total number of elements that can be stored in a multidimensional array can be calculated by multiplying the size of all the dimensions.

        For example:
        The array int[][] x = new int[10][20] can store a total of (10*20) = 200 elements.
        Similarly, array int[][][] x = new int[5][10][20] can store a total of (5*10*20) = 1000 elements.




         */
    }
}

class TwoDAArrays {
    public static void main(String[] args)
    {

        int[][] arr = { { 1, 2 }, { 3, 4 } };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);

        System.out.println("---------------------");

        for (int[] i: arr
             ) {
            for (int j: i
                 ) {
                System.out.print(j +" "); // print columns
            }
            System.out.println();
        }


        System.out.println("------------------------");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
    }

class ThreeDaArray {
    public static void main(String[] args)
    {

        int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6} }, { { 7, 8, 9}, { 10, 11, 12 } } };

        for (int i = 0; i < 2; i++) { // arrays
            for (int j = 0; j < 2; j++) // rows
                for (int z = 0; z < 3; z++) // columns
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + arr[i][j][z]);
        }
        System.out.println("-------------------");
        for (int i = 0; i < 2; i++) { // arrays

            for (int j = 0; j < 2; j++) { // rows

                for (int k = 0; k < 3; k++) { //  columns

                    System.out.print(arr[i][j][k] + " ");
                }

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        for (int [][] i:arr // array
             ) {
            for (int [] j: i // row
                 ) {
                for (int t: j // columns
                     ) {
                    System.out.print(t + "  "); // print columns
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}



class GFGTestCase {
    public static void main(
            String[] args)
    {
        // Scanner class to take
        // values from console
        Scanner scanner = new Scanner(System.in);

        // totalTestCases = total
        // number of TestCases
        // eachTestCaseValues =
        // values in each TestCase as
        // an Array values
        int totalTestCases, eachTestCaseValues;

        // takes total number of
        // TestCases as integer number
        totalTestCases = scanner.nextInt();

        // An array is formed as row
        // values for total testCases
        int[][] arrayMain = new int[totalTestCases][];

        // for loop to take input of
        // values in each TestCase
        for (int i = 0; i < arrayMain.length; i++) {
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];
            for (int j = 0; j < arrayMain[i].length; j++) {
                arrayMain[i][j] = scanner.nextInt();
            }
        } // All input entry is done.

        // Start executing output
        // according to condition provided
        for (int i = 0; i < arrayMain.length; i++) {

            // Initialize total number of
            // even & odd numbers to zero
            int nEvenNumbers = 0, nOddNumbers = 0;

            // prints TestCase number with
            // total number of its arguments
            System.out.println(
                    "TestCase " + i + " with "
                            + arrayMain[i].length + " values:");
            for (int j = 0; j < arrayMain[i].length; j++) {
                System.out.print(arrayMain[i][j] + " ");

                // even & odd counter updated as
                // eligible number is found
                if (arrayMain[i][j] % 2 == 0) {
                    nEvenNumbers++;
                }
                else {
                    nOddNumbers++;
                }
            }
            System.out.println();

            // Prints total numbers of
            // even & odd
            System.out.println(
                    "Total Even numbers: " + nEvenNumbers
                            + ", Total Odd numbers: " + nOddNumbers);
        }
    }
}


package day20_Arrays;

import java.util.*;
import java.util.List;

class OneDArrays{
    public static void main(String[] args) {

        int [] myArray = {10,20,30,40,100};
        int [] statePopulation = new int[5];
        statePopulation = new int[]{101, 205, 307, 408, 1100};
        // all elements are by default 0
        System.out.println(Arrays.toString(statePopulation));

        // read the element in Array
        System.out.println("statePopulation [0] = " + statePopulation[0]);



    }

}



public class Main {

    public static void main(String[] args) {

    /*

            Creating Arrays

        An array is a sequence of values; the values in the array are called elements.
        You can make an array of ints, doubles, Strings, or any other type, but all the values in an array must have the same type.


            To create an array, you have to declare a variable with an array type and then create the array itself.
            Array types look like other Java types, except they are followed by square brackets ([]).
            For example, the following lines declare that counts is an “integer array” and values is a “double array”:

            you can also declare the variable and create the array with a single line of code:

                    int[] counts = new int[4];
                    double[] values = new double[size];

        You can use any integer expression for the size of an array, as long as the value is nonnegative.
        If you try to create an array with -4 elements, for example, you will get a NegativeArraySizeException.
        An array with zero elements is allowed, and there are special uses for such arrays.

        You can initialize an array with a comma-separated sequence of elements enclosed in braces, like this:

                    int[] a = {1, 2, 3, 4};
        This statement creates an array variable, a, and makes it refer to an array with four elements.


     */









        String [] arr = {"chicken", "bacon", "avocado"};

        Arrays.asList(arr);
        List<String> list = Arrays.asList(arr);

        for(String s : list ) {
            System.out.println("s = " + s);
        }

        /*
        Syntax:

         For(<DataType of array/List><Temp variable name>   : <Array/List to be iterated>){
                System.out.println();
            //Any other operation can be done with this temp variable.
            }

        the statement for(int i:arr) of for(String s : list ) is a new type of for loop called for each loop.
        This is called a “for each” loop which is specifically designed for arrays.
        The variable I is kind of a reference to each of the elements of the array. This variable,
        after every iteration automatically points to the next element in the array until the end of the array arr is reached.


         */

        System.out.println("--------------------------" );
        int [] arr1 = new int[5];

        Arrays.fill(arr1, 100);
        for (Integer i : arr1) {
            System.out.println("i = " + i);
        }

        System.out.println("--------------------------" );

        int [] arr2 = new int[5];
        int [] arr3 = Arrays.copyOf(arr2, arr2.length );

        arr3 [2] = 47;
        
        for (int i : arr2) {
            System.out.println("i = " + i);
        }

        System.out.println();
        
        for (int i : arr3) {
            System.out.println("i = " + i);
        }

        System.out.println("--------------------------" );

    }
}
class UsingForEach {
    public static void main(String[] args) {

        /*
        Consider a String array arrData initialized as follows:

        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
        Although you might know methods like finding the size of the array and then iterating through each element of the array using the traditional for loop (counter, condition, and increment),
        we need to find a more optimized approach that will not use any such counter.

        This is the conventional approach of the “for” loop:


        for(int i = 0; i< arrData.length; i++){
            System.out.println(arrData[i]);
        }

        You can see the use of the counter and then use it as the index for the array.

        Java provides a way to use the “for” loop that will iterate through each element of the array.

        Here is the code for the array that we had declared earlier-

        for (String strTemp : arrData){

        System.out.println(strTemp);

        }
        You can see the difference between the loops. The code has reduced significantly.
        Also, there is no use of the index or rather the counter in the loop.

        Do ensure that, the data type declared in the foreach loop must match the data type of the array/list that you are iterating.

        Here we have the entire class showing the above explanation-




         */


        String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
        //The conventional approach of using the for loop
        System.out.println("Using conventional For Loop:");
        for(int i=0; i< arrData.length; i++){
            System.out.println(arrData[i]);
        }
        System.out.println("\nUsing Foreach loop:");

        //The optimized method of using the for loop - also called the foreach loop
        for (String strTemp : arrData){
            System.out.println(strTemp);
        }

        /*
        Here, the output of both programs is the same. However, the for-each loop is easier to write and understand.

        This is why the for-each loop is preferred over the for loop when working with arrays and collections.

         */

    }
}

class ForEachExample1{
    public static void main(String args[]){
        //declaring an array
        int arr[]={12,13,14,44};
        //traversing the array with for-each loop
        for(int i:arr){
            System.out.println(i);

        }
        //The Java for-each loop traverses the array or collection until the last element.
        // For each element, it stores the element in the variable and executes the body of the for-each loop.


        // Let us see another of Java for-each loop where we are going to total the elements.
        int total=0;
        for(int i:arr){
            total=total+i;
        }
        System.out.println("Total: "+total);

    }
}


class ForEachExample2{
    public static void main(String args[]){
        //Creating a list of elements
        ArrayList<String> list=new ArrayList<String>();
        list.add("vimal");
        list.add("sonoo");
        list.add("ratan");
        //traversing the list of elements using for-each loop
        for(String s:list){
            System.out.println(s);
        }


        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using the for-each loop
        for (char item: vowels) {
            System.out.println("item = " + item);;
        }
    }
}

class loop_demos {

    public static void main(String []args) {

        List<String> lstdemo = new ArrayList<>();

        lstdemo.add("Iterate");

        lstdemo.add("Through");

        lstdemo.add("A");

        lstdemo.add("List");

        lstdemo.add("Collection");


        lstdemo.forEach(lstitem->System.out.println(lstitem));

    }

}

class TicTacToe {

    public static void main(String[] args) {

        char [] [] board ={ {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};
        printBoard(board);

        Scanner scanner = new Scanner(System.in);

        playerTurn(board, scanner);

        Random rand = new Random();
        int computerMove;
        while (true) {
            computerMove = rand.nextInt(9)+1;
            if (isValidMove(board,computerMove)) {
                break;

            }
        }

        placeMove(board, Integer.toString(computerMove), '0');

        System.out.println(board);

    }

    private static void playerMove(char[][] board) {
    }

    private static boolean isValidMove (char [] [] board, int position ) {

        switch (position){
            case 1: return (board[0][0] == ' ');
            case 2: return (board[0][1] == ' ');
            case 3: return (board[0][2] == ' ');
            case 4: return (board[1][0] == ' ');
            case 5: return (board[1][1] == ' ');
            case 6: return (board[1][2] == ' ');
            case 7: return (board[2][0] == ' ');
            case 8: return (board[2][1] == ' ');
            case 9:return (board[2][2] == ' ');
            default: return true;
        }

    }



    private static void playerTurn(char[][] board, Scanner scanner) {
            System.out.println("Where would you like to play? between (1-9)" );
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        placeMove(board, userInput, 'X');
        scanner.close();
    }

    private static void placeMove(char[][] board, String position, char symbol ) {
        switch (position){
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(";)");

        }
    }

    private static void printBoard(char[][] board) {
        System.out.println( board[0] [0] + "|" + board[0] [1] + "|" + board[0] [2]);
        System.out.println( "-+-+-");
        System.out.println( board[1] [0] + "|" + board[1] [1] + "|" + board[1] [2]);
        System.out.println( "-+-+-");
        System.out.println( board[2] [0] + "|" + board[2] [1] + "|" + board[2] [2]);
    }

}
class sortArray {

    public static void main(String[] args) {
        int [] numbers = {5, 2, 3, -1, 0, 4, 1};
        Arrays.sort(numbers);

        char [] characters = {'a', 'z', 'b', 'w', 'c', 'A', 'D', 'Z', 'C'};
        Arrays.sort(characters);

        int [] uniCodes = {'a', 'z', 'b', 'w', 'c', 'A', 'D', 'Z', 'C'};
        Arrays.sort(uniCodes);

        int [] number1  = {5, 4, 3, 2, 1, 0, -1};
        Arrays.sort(number1, 3,7);

        String [] strings = {"hij", "abc", "efg"};
        Arrays.sort(strings);



        System.out.println(Arrays.toString(numbers) );
        System.out.println(Arrays.toString(characters));
        System.out.println(Arrays.toString(uniCodes));
        System.out.println(Arrays.toString(number1));
        System.out.println(Arrays.toString(strings));

    }
}

class searchArray {

    public static void main(String[] args) {


    }
}
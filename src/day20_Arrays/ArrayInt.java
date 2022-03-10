package day20_Arrays;

import java.util.Scanner;

public class ArrayInt {

    /*

        0. Declare an array

        String[] aArray = new String[5];
        String[] bArray = {"a","b","c", "d", "e"};
        String[] cArray = new String[]{"a","b","c","d","e"};

        1. Print an array in Java

            int[] intArray = { 1, 2, 3, 4, 5 };
            String intArrayString = Arrays.toString(intArray);

        // print directly will print reference value
        System.out.println(intArray);
        // [I@7150bd4d

        System.out.println(intArrayString);
        // [1, 2, 3, 4, 5]

        2. Create an ArrayList from an array

            String[] stringArray = { "a", "b", "c", "d", "e" };
            ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);
        // [a, b, c, d, e]


        3. Check if an array contains a certain value

            String[] stringArray = { "a", "b", "c", "d", "e" };
            boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b);
        // true


        4. Concatenate two arrays

            int[] intArray = { 1, 2, 3, 4, 5 };
            int[] intArray2 = { 6, 7, 8, 9, 10 };
            // Apache Commons Lang library
            int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);


        5. Declare an array inline

            method(new String[]{"a", "b", "c", "d", "e"});


        6. Joins the elements of the provided array into a single String

            // containing the provided list of elements
        // Apache common lang
            String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
        System.out.println(j);
        // a, b, c

        7. Convert an ArrayList to an array

            String[] stringArray = { "a", "b", "c", "d", "e" };
            ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
            String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr)
                    System.out.println(s);


        8. Convert an array to a set

            Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println(set);
        //[d, e, b, c, a]


        9. Reverse an array

            int[] intArray = { 1, 2, 3, 4, 5 };
        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));
        //[5, 4, 3, 2, 1]


        10. Remove element of an array

            int[] intArray = { 1, 2, 3, 4, 5 };
            int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
        System.out.println(Arrays.toString(removed));
            One more - convert int to byte array

            byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();

        for (byte t : bytes) {
                System.out.format("0x%x ", t);
            }
           }

     */

}

class FirstAndLastLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for (int i = 0; i < words.length; i++) {
            System.out.println("" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1));
        }


    }
}


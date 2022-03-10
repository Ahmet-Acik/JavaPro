package day22_MultiDAArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {


        String[][] groups = new String[3][3];
        groups[0] = new String[]{"Ali", "Veli", "Deli"};
        groups[1] = new String[]{"Cem", "Can", "Cet"};
        groups[2] = new String[]{"Mete", "Batu", "Kaan"};


        //  String groups1 [] [] = { {"ali" ,"veli", "deli"}, {"cem", "can",  "ceto"}, {"mete", "batu", "kaan"} };

        System.out.println(Arrays.deepToString(groups));


        System.out.println("----------------------");

        // index of elements
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        System.out.println(Arrays.toString(arr2D[1]));

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}







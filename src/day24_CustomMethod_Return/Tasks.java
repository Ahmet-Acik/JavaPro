package day24_CustomMethod_Return;

import java.util.Locale;

public class Tasks {

    public static void main(String[] args) {

        // a method that can display the initials of a person


        initial("Ahmet", "Acik");

    }

    public static void initial (String name, String lastName) {


        String initial = name.charAt(0) + ". "+ lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }


}

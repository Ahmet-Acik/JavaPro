package day24_CustomMethod_Return;

public class Timer {

    public static void main(String[] args) {

       domain("ahmet.acik@icloud.com");




    }

    // creat a method that can display the domain of the email

    public static void domain (String email) {

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".") );
        System.out.println("domain = " + domain);

    }

}

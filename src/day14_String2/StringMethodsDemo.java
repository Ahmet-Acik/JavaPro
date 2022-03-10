package day14_String2;

public class StringMethodsDemo {
        /*
                   Java Strings
            The strings in java are a collection of characters bound by double quotes(“”).
            They are immutable, i.e once they are declared, their values cannot be changed.
            String can also be listed as an array of characters starting at the index 0 and ending with a null character (\0).
            This means that the first letter of the string is at index 0 to the last character of the string which is indexed at (length of the string-1).
            This is an individual datatype in Java.

            Methods of Declaring String in Java
            There are two ways of declaring strings in Java

            1. By using the new keyword
            String course = new String(“Java”);

            2. By using the String literal.
            String course=”java”;

            However there is a problem while declaring strings using the literal.
            In this method the String object is not created explicitly by the programmer(We do not use the new keyword).
            So the compiler creates one object for us when the line is executed.
            But, if we have the same string initialization in a different line, then the initialization would not be completed and no new object would be created.
            for example,

            String s1=”DataFlair”;
            String s2=”DataFlair”;
            For the first string the java object is created, which references s1.
            However when the second line is executed the s2 instance points to the same old “DataFlair” object which was declared before.
            No new objects are created.
            But when you use the new keyword, JVM is forced to create a new object.

     Java String Constant Pool
            Do you know the differences between using a string literal and using the new keyword while declaring strings.
            Let us clear it once and for all. Remember we talked about java being a memory efficient programming language?
            This is how it manages to save a lot of memory:

            When you are declaring a string literal(i.e without using the new keyword), the JVM stores this string in a pool of strings called the String Constant Pool.
            Simple,right? Now we declared two strings of the same value “DataFlair” in the case above.
            So what JVM does is, it creates a reference s1 and points it to the object “DataFlair”.
            Whenever the compiler executes the second line which is String s2=”DataFlair”; it realizes that DataFlair object is already in the String Constant Pool !
            So, it points the new instance s2 to the same old “DataFlair” object created in the first line. No new objects create.

            This results in saving up space as the JVM did not need to create a different object for the same String.
            That is why the String Constant Pool is an integral part of Java.


            String immutability advantages:
            1. String constant pool

            The string constant pool saves memory hence the string class being immutable helps a lot.

            2. Security

            The fact that strings cannot be changed also aids to security.

            3. Thread Safe

            Since the objects cannot be modified,multiple threads can share these objects amongst themselves.No synchronization is required.

            4. Caching KEY

            As strings are immutable, the hashcode of the same creates at the time of the string declaration. Then it can be used as candidate keys for hashmaps.

            Memory Allocation
            As soon as a string object gets created, it is created in two places, one in the heap memory and the other in the string constant pool. However when the second reference also has the same value as the one in the string constant pool the reference points to the pool memory instead of the heap memory.

            All the following objects, the same as the one before are referenced in the String Constant Pool memory.



            Java String Methods.
            String Methods in Java

            1. length- This method is particularly useful for finding out the length of the string.
            It returns an integer which is the length of the string. The basic syntax of this method is <string variable>.length();

            2. charAt- This returns the character at the particular index passed as an argument to this method. The syntax is <string variable>.charAt(<index>);

            3. substring(int i)- This method returns a string which is a substring of the original string starting at the index passed as the argument to the method.
            This has a simple syntax of <String variable>.substring(<index>);


            4. substring(int i,int j)- This method returns the substring which starts at the index i, given as the first argument to the method and ends at j, given as the second argument in the method.
            It has a simple syntax of <String variable>.substring(<index1>,<index2>);

            5. concat- As the name suggests, this method is useful for concatenating two strings.
            Concatenating means adding together two entities.
            It has the syntax of <String-variable1>.concat(<String_variable2>); In place of the variables you can also use string literals directly.
            You can also concat strings by simple add operator
            Example- “Hello”+” DataFlair”; yields Hello DataFlair.

            6. indexOf- This method returns the index of the first occurence of the character passed as an argument in the string.
            The syntax of the method is <string_variable1>.indexOf(<String_variable2>);

            7. equals- This method returns true if both the strings are equal and false if they are not equal.
            It has a syntax of <String_variable1>.equals(<String_variable2>);

            8. compareTo- This method compares the two strings in a lexicographical order.
            If both of the strings are equal it returns zero.The result is positive if the first argument string is greater than the second string, lexicographically. If not, the result is negative. It has a syntax of <variable1>.compareTo(<variable2>);

            9. toLowerCase- Converts the string to lowercase. It has a syntax of <variable>.toLowerCase();

            10. toUpperCase- Converts the string to uppercase. It has a syntax of <variable>.toUpperCase();

            11. trim- Trims the string, i.e, removes all unnecessary spaces before and after the string.
            Note that it does not remove the spaces inside the string. It has a syntax like <variable>.trim();

            12. replace- Returns the string by replacing all occurrences of the first character with the second character.
            It has a syntax <String_variable>.replace(<character1>,<character2>);


         */



    public static void main(String[] args) {
        String targetString = "Java is fun to learn";
        String s1= "JAVA";
        String s2= "Java";
        String s3 = "  Hello Java  ";

        System.out.println("Char at index 2(third position): " + targetString.charAt(2));
        System.out.println("After Concat: "+ targetString.concat("-Enjoy-"));
        System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
        System.out.println("Checking equals with case: " +s2.equals(s1));
        System.out.println("Checking Length: "+ targetString.length());
        System.out.println("Replace function: "+ targetString.replace("fun", "easy"));
        System.out.println("SubString of targetString: "+ targetString.substring(8));
        System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
        System.out.println("Converting to lower case: "+ targetString.toLowerCase());
        System.out.println("Converting to upper case: "+ targetString.toUpperCase());
        System.out.println("Triming string: " + s3.trim());
        System.out.println("searching s1 in targetString: " + targetString.contains(s1));
        System.out.println("searching s2 in targetString: " + targetString.contains(s2));

        char [] charArray = s2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);
        System.out.println("Printing last element of array: " + charArray[3]);

    }

}
        /*
        Method Chaining is the practice of calling different methods in a single line instead of calling other methods with the same object reference separately.
        Under this procedure, we have to write the object reference once and then call the methods by separating them with a (dot.).

        Method chaining in Java is a common syntax to invoke multiple methods calls in OOPs.
        Each method in chaining returns an object. It violates the need for intermediate variables.
        In other words, the method chaining can be defined as if we have an object and we call methods on that object one after another is called method chaining.

        Syntax:

        obj.method1().method2().method3();
        In the above statement, we have an object (obj) and calling method1() then method2(), after that the method3().
        So, calling or invoking methods one after another is known as method chaining.



         */
class User {

    private String name;
    private int age;

// In addition to having the side-effect of setting the attributes in question,
// the setters return "this" (the current Person object) to allow for further chained method calls.

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public void getUserDetails() {
        System.out.println("User name is " + name + " and " + age + " years old.");
    }

    // Usage:
    public static void main(String[] args) {
        User user = new User();
        user.setName("Ahmet Ak").setAge(22).getUserDetails();
    }
}
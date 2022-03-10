package day19_RecapLoopString;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.StringTokenizer;


/*Iterate over characters of a String in Java
        This post will discuss various methods to iterate over characters in a string in Java.
        1. Naive solution
        A naive solution is to use a simple for-loop to process each character of the string.
        This approach proves to be very effective for strings of smaller length.

         */
public class Main
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";

        // using simple for-loop
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}
 /*
        2. Using String.toCharArray() method
        We can also convert a string to char[] using String.toCharArray() method and then iterate over the character array using enhanced for-loop (for-each loop) as shown below:

  */
class toCharArrayMethod
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";

        // convert string to `char[]` array
        char[] chars = s.toCharArray();

        // iterate over `char[]` array using enhanced for-loop
        for (char ch: chars) {
            System.out.print(ch);
        }
    }
}

/*
        3. Using Iterator
        We can also use the StringCharacterIterator class that implements bidirectional iteration for a String.
 */

class UsingIterator
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";

        CharacterIterator it = new StringCharacterIterator(s);

        while (it.current() != CharacterIterator.DONE)
        {
            System.out.print(it.current());
            it.next();
        }
    }
}

/*
        4. Using StringTokenizer
        Another solution is to use StringTokenizer, although its use is discouraged.
        The StringTokenizer class breaks a string into tokens. Its prototype is:

        StringTokenizer(String str, String delim, boolean returnDelims)

        An instance of StringTokenizer behaves in one of two ways, depending on whether it was created with the returnDelims flag having the value true or false:

        If returnDelims is false, delimiter characters serve to separate tokens.
        A token is a maximal sequence of consecutive characters that are not delimiters.
        If returnDelims is true, delimiter characters are themselves considered to be tokens.
        Thus, a token is either one delimiter character or a maximal sequence of consecutive characters that are not delimiters.
        The following program demonstrates it:

        import java.util.StringTokenizer;

 */

class UsingStringTokenizer
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";

        @Deprecated
        // if returnDelims is true, use the string itself as a delimiter
        StringTokenizer st = new StringTokenizer(s, s, true);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());
        }

        // if returnDelims is false, use an empty string as a delimiter
        st = new StringTokenizer(s, "", false);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());
        }
    }
}

/*
        5. Using String.Split() method
        It is recommended to use the String.split() method over StringTokenizer, which is a legacy class and still alive for compatibility reasons.

 */
class StringSplitMethod
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";

        String[] arr = s.split("");

        for (String ch: arr) {
            System.out.print(ch);
        }
    }
}
/*
        6. Using String.chars() method
        Java 8 provides a new method, String.chars(), which returns an IntStream (a stream of ints) representing an integer representation of characters in the String.
        This method does not return the desired Stream<Character> (for performance reasons),
        but we can map IntStream to an object in such a way that it will automatically box into a Stream<Character>.
        There are various ways to achieve that, as shown below:

 */
class StringCharsMethod
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";

        // 1. Implicit boxing into `Stream<Character>`

        // 1.1. Using method reference
        s.chars()
                .mapToObj(Character::toChars)
                .forEach(System.out::print);

        // 1.2. Using lambda expressions by casting `int` to `char`
        s.chars()
                .mapToObj(i -> Character.valueOf((char) i))
                .forEach(System.out::print);

        s.chars()
                .mapToObj(i -> (char) i)
                .forEach(System.out::print);

        s.chars()
                .mapToObj(i -> new StringBuilder().appendCodePoint(i))
                .forEach(System.out::print);

        // 2. Without boxing into `Stream<Character>`

        s.chars()
                .forEach(i -> System.out.print(Character.toChars(i)));

        s.chars()
                .forEach(i -> System.out.print((char) i));

        s.chars()
                .forEach(i -> System.out.print(new StringBuilder()
                        .appendCodePoint(i)));
    }
}
/*

        7. Using Code Points
        We can also use Java 8 String.codePoints() instead of String.chars() that also returns an IntStream but having Unicode code points instead of char values.


 */
class CodePoints
{
    // Iterate over the characters of a string
    public static void main(String[] args)
    {
        String s = "Techie Delight";

        /* 1. Implicit Boxing into `Stream<Character>` */

        // 1.1. Using method reference
        s.codePoints()
                .mapToObj(Character::toChars)
                .forEach(System.out::print);

        s.codePoints()
                .mapToObj(i -> new StringBuilder().appendCodePoint(i))
                .forEach(System.out::print);

        // 1.2. Using lambda expressions by casting `int` to `char`
        s.chars()
                .mapToObj(i -> Character.valueOf((char) i))
                .forEach(System.out::print);

        s.codePoints()
                .mapToObj(i -> (char) i)
                .forEach(System.out::print);

        /* 2. Without Boxing into `Stream<Character>` */

        s.codePoints()
                .forEach(i -> System.out.print(Character.toChars(i)));

        s.codePoints()
                .forEach(i -> System.out.print((char) i));

        s.chars()
                .forEach(i -> System.out.print(new StringBuilder()
                        .appendCodePoint(i)));
    }
}
/*

    Iterate over a string backward in Java
        This post will discuss various methods to iterate over a string backward in Java.

        1. For loop
        We can use a simple for-loop to process each character of the string in the reverse direction.
        This approach is very effective for strings having fewer characters.


 */
class StringBackward_ForLoop
{
    // Iterate over a string backward
    public static void main(String[] args)
    {
        String s = "Reverse String";

        // using simple for-loop
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}

/*
        2. Convert to character array
        In this approach, we initially reverse the string.
        Then we convert the reversed string to a character array by using the String.toCharArray() method.
        Finally, we iterate the char[] using a for-each loop, as shown below:


 */
class StringBackward_ConvertToCharacterArray
{
    // Iterate over a string backward
    public static void main(String[] args)
    {
        String s = "Reverse String";

        // reverse the string and convert it to `char[]` array
        char[] chars = new StringBuilder(s).reverse().toString()
                .toCharArray();

        // iterate over char[] using the for-each loop
        for (char ch: chars) {
            System.out.print(ch);
        }
    }
}

/*
        3. Using CharacterIterator
        We can also use the CharacterIterator interface that provides bidirectional iteration for a String.

        import java.text.CharacterIterator;
        import java.text.StringCharacterIterator;


 */
class StringBackward_CharacterIterator
{
    // Traverse the string backward, from end to start
    public static void traverseBackwards(CharacterIterator itr)
    {
        char ch = itr.last();
        while (ch != CharacterIterator.DONE)
        {
            System.out.print(ch);
            ch = itr.previous();
        }
    }

    // Iterate over a string backward
    public static void main(String[] args)
    {
        String s = "Reverse String";

        CharacterIterator it = new StringCharacterIterator(s);
        traverseBackwards(it);
    }
}

/*
        4. Using String.Split() method
        String.split() splits the specified string and returns an array of strings created by splitting this string.


 */
class StringBackward_StringSplitMethod
{
    // Iterate over a string backward
    public static void main(String[] args)
    {
        String s = "Reverse String";

        String[] arr = s.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}

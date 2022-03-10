package day21_ArrayUtilityForEachLoop;

public class ArrayUtilityClass_Intro {

    public static void main(String[] args) {

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



        /*

                    Declaring an Array Variable in Java
            A Java array variable is declared just like you would declare a variable of the desired type, except you add [] after the type.
            Here is a simple Java array declaration example:

            int[] intArray;
            You can use a Java array as a field, static field, a local variable, or parameter, just like any other variable.
            An array is simply a variation of the data type. Instead of being a single variable of that type, it is a collection of variables of that type.

            Here are a few more Java array declaration examples:

            String[]  stringArray;

            MyClass[] myClassArray;
            The first line declares an array of String references.
            The second line declares an array of references to objects of the class MyClass, which symbolizes a class you have created yourself.

            You actually have a choice about where to place the square brackets [] when you declare an array in Java.
            The first location you have already seen. That is behind the name of the data type (e.g. String[]).
            The second location is after the variable name.
            The following Java array declarations are actually all valid:

            int[] intArray;
            int   intArray[];

            String[] stringArray;
            String   stringArray[];

            MyClass[] myClassArray;
            MyClass   myClassArray[];
            Personally I prefer to locate the square brackets [] after the data type (e.g. String[]) and not after the variable name.
            After all, an array is a special kind of data type,
            so I feel it is easier to read the code when the square brackets are placed right after the data type in the array declaration.


            Instantiating an Array in Java
            When you declare a Java array variable you only declare the variable (reference) to the array itself.
            The declaration does not actually create an array. You create an array like this:

            int[] intArray;

            intArray = new int[10];
            This example creates an array of type int with space for 10 int variables inside.

            The previous Java array example created an array of int which is a primitive data type.
            You can also create an array of object references. For instance:

            String[] stringArray = new String[10];
            Java allows you to create an array of references to any type of object (to instances of any class).


            Java Array Literals
            The Java programming language contains a shortcut for instantiating arrays of primitive types and strings.
            If you already know what values to insert into the array, you can use an array literal.
            Here is how how an array literal looks in Java code:

            int[]   ints2 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
            Notice how the values to be inserted into the array are listed inside the { ... } block.
            The length of this list also determines the length of the created array.

            Actually, you don't have to write the new int[] part in the latest versions of Java.
            You can just write:

            int[]   ints2 = { 1,2,3,4,5,6,7,8,9,10 };
            It is the part inside the curly brackets that is called an array literal.

            This style works for arrays of all primitive types, as well as arrays of strings.
            Here is a string array example:

             String[] strings = {"one", "two", "three"};
            Java Array Length Cannot Be Changed
            Once an array has been created its size cannot be resized.
            In some programming languages (e.g. JavaScript) arrays can change their size after creation, but in Java an array cannot change its size once it is created.
            If you need an array-like data structure that can change its size, you should use a List, or you can create a resizable Java array.
            In some cases you can also use a Java RingBuffer which, by the way, is implemented using a Java array internally.


            Accessing Java Array Elements
            Each variable in an Java array is also called an "element".
            Thus, the example shown earlier created an array with space for 10 elements, and each element is a variable of type int.

            Each element in the array has an index (a number).
            You can access each element in the array via its index.
            Here is an example:

            intArray[0] = 0;

            int firstInt = intArray[0];
            This example first sets the value of the element (int) with index 0, and second it reads the value of the element with index 0 into an int variable.

            You can use the elements in a Java array just like if they were ordinary variables. Y
            ou can read their value, assign values to them, use the elements in calculations and pass specific elements as parameters to method calls.

            The indexes of elements in a Java array always start with 0 and continue to the number 1 below the size of the array.
            Thus, in the example above with an array with 10 elements the indexes go from 0 to 9.



            Array Length
            You can access the length of an array via its length field. Here is an example:

            int[] intArray = new int[10];

            int arrayLength = intArray.length;
            In this example the variable named arrayLength will contain the value 10 after the second line of code has been executed.


            Iterating Arrays
            You can loop through all the elements of an array using the Java for loop.
            Here is an example of iterating an array with a for loop in Java:

            String[] stringArray = new String[10];

            for(int i=0; i < stringArray.length; i++) {
                stringArray[i] = "String no " + i;
            }

            for(int i=0; i < stringArray.length; i++) {
                System.out.println( stringArray[i] );
            }
            This example first creates an array of String references.
            When you first create an array of object references, each of the cells in the array points to null - no object.

            The first of the two for loops iterate through the String array, creates a String and makes the cell reference that String.

            The second of the two for loops iterate through the String array and prints out all of the strings that the cells reference.

            If this had been an array of int (primitive values), it could have looked like this:

            int[] intArray = new int[10];

            for(int i=0; i < intArray.length; i++) {
                intArray[i] = i;
            }

            for(int i=0; i < intArray.length; i++) {
                System.out.println( intArray[i] );
            }
            The variable i is initialized to 0 and runs up until the length of the array minus 1.
            In this case, i takes the values 0 through 9, each time repeating the code inside the for loop one time, and for each iteration i has a different value.

            You can also iterate an array using the "for-each" loop in Java. Here is how that looks:

            int[] intArray = new int[10];

            for(int theInt : intArray) {
                System.out.println(theInt);
            }
            The for-each loop gives you access to each element in the array, one at a time, but gives you no information about the index of each element.
            Additionally, you only have access to the value.
            You cannot change the value of the element at that position. If you need that, use a normal for-loop as shown earlier.

            For for-each loop also works with arrays of objects. Here is an example showing you how to iterate an array of String objects:

            String[] stringArray = {"one", "two", "three"};

            for(String theString : stringArray) {
                System.out.println(theString);
            }


            Multidimensional Java Arrays
            The examples shown above all created arrays with a single dimension, meaning elements with indexes going from 0 and up.
            It is, however, possible to create arrays where each element has two or more indexes which identify (locate) it in the array.

            You create a multidimensional array in Java by appending one set of square brackets ([]) per dimension you want to add.
            Here is an example that creates a two-dimensional array:

            int[][] intArray = new int[10][20];
            This example creates a two-dimensional array of int elements.
            The array contains 10 elements in the first dimension, and 20 elements in the second dimension.
            In other words, this examples creates an array of arrays of int elements.
            The array of arrays has space for 10 int arrays, and each int array has space for 20 int elements.

            You access the elements in a multidimensional array with one index per dimension.
            In the example above you would have to use two indexes.
            Here is an example:

            int[][] intArray = new int[10][20];

            intArray[0][2] = 129;

            int oneInt = intArray[0][2];
            The variable named oneInt will contain the value 129 after the last line of Java code has executed.



            Iterating Multidimensional Arrays
            When you iterate a multidimensional array in Java you need to iterate each dimension of the array separately.
            Here is is how iterating a multidimensional looks in Java:

            int[][] intArray = new int[10][20];

            for(int i=0; i < intArrays.length; i++){
                for(int j=0; j < intArrays[i].length; j++){
                    System.out.println("i: " + i + ", j: " + j);
                }
            }


            Inserting Elements Into an Array
            Sometimes you need to insert elements into a Java array somewhere.
            Here is how you insert a new value into an array in Java:

            int[] ints   = new int[20];

            int insertIndex = 10;
            int newValue    = 123;

            //move elements below insertion point.
            for(int i=ints.length-1; i > insertIndex; i--){
                ints[i] = ints[i-1];
            }

            //insert new value
            ints[insertIndex] = newValue;

            System.out.println(Arrays.toString(ints));
            The example first creates an array. Then it defines an insert index and a new value to insert.
            Then all elements from the insertion index and to the end of the array are shifted one index down in the array.
            Note that this will shift the last value in the array out of the array (it will simply be deleted).

            The above array insertion code could be embedded in a Java method. Here is how that could look:

            public void insertIntoArray(
                    int[] array, int insertIndex, int newValue){

                //move elements below insertion point.
                for(int i=array.length-1; i > insertIndex; i--){
                    array[i] = array[i-1];
                }

                //insert new value
                array[insertIndex] = newValue;
            }
            This method takes an int[] array as parameter as well as the index to insert the new value, and the new value.
            You can insert elements into an array by calling this method like this:

            int[] ints   = new int[20];

            insertIntoArray(ints, 0, 10);
            insertIntoArray(ints, 1, 23);
            insertIntoArray(ints, 9, 67);
            Of course, if the insertIntoArray() method is located in a different class than the above code,
            you would need an object of that class in order to be able to call the method.
            Or, if the insertIntoArray() method was static, you would need to put the class name and a dot in front of the method name.



            Removing Elements From an Array
            Sometimes you have want to remove an element from a Java array.
            Here is the code for removing an element from an array in Java:

            int[] ints   = new int[20];

            ints[10] = 123;

            int removeIndex = 10;

            for(int i = removeIndex; i < ints.length -1; i++){
                ints[i] = ints[i + 1];
            }
            This example first creates an int array.
            Then it sets the value of the element with index 10 to 123.
            Then the example removes the element with index 10.
            It removes the element by shifting all elements below index 10 one position up in the array.
            After the removal, the last element in the array will exist twice.
            Both in the last and second last element.

            The above code could be embedded in a Java method. Here is how such an array removal Java method could look:

            public void removeFromArray(
                int[] array, int removeIndex){

                for(int i = removeIndex; i < array.length -1; i++){
                    array[i] = array[i + 1];
                }
            }
            This removeFromArray() method takes two parameters: The array to remove the element from, and the index of the element to remove.

            Of course, if the removeFromArray() method is located in a different class than the above code,
            you would need an object of that class in order to be able to call the method.
            Or, if the removeFromArray() method was static, you would need to put the class name and a dot in front of the method name.



            Finding Min and Max Value in Arrays
            Sometimes you may need to find the minimum or maximum value in a Java array.
            Java does not have any built-in functions for finding minimum and maximum value,
            so I will show you how to code that yourself.

            Here is first how you find the minimum value in an array:

            int[] ints = {0,2,4,6,8,10};

            int minVal = Integer.MAX_VALUE;

            for(int i=0; i < ints.length; i++){
                if(ints[i] < minVal){
                    minVal = ints[i];
                }
            }

            System.out.println("minVal = " + minVal);
            The example first sets the minVal to Integer.MAX_VALUE which is the highest possible value an int can take.
            This is done to make sure that the initial value is not by accident smaller than the smallest value in the array.

            Second, the example iterates through the array and compares each value to minValue.
            If the element in the array is smaller than minVal then minVal is set to the value of the element.

            Finally the minimum value found in the array is printed out. In the example above the minimum value is 0.

            Here is how you find the maximum value in an array. It is pretty similar to finding the minimum value.

            int[] ints = {0,2,4,6,8,10};

            int maxVal = Integer.MIN_VALUE;
            for(int i=0; i < ints.length; i++){
                if(ints[i] > maxVal){
                    maxVal = ints[i];
                }
            }
            System.out.println("maxVal = " + maxVal);
            This example will print out the value 10.

            The major differences to finding the minimum value is the initialization of maxVal and the comparison of maxVal to the elements in the array.


            The Arrays Class
            Java contains a special utility class that makes it easier for you to perform many often used array operations
            like copying and sorting arrays, filling in data, searching in arrays etc.
            The utility class is called Arrays and is located in the standard Java package java.util. T
            hus, the fully qualified name of the class is:

            java.util.Arrays
            I will cover a few of the methods found in this class in the following sections.
            Remember, in order to use java.util.Arrays in your Java classes you must import it.
            Here is how importing java.util.Arrays could look in a Java class of your own:

            package myjavaapp;

            import java.util.Arrays;

            public class MyClass{

                public static void main(String[] args) {

                }
            }
            Notice the import java.util.Arrays; statement in bold.
            It is this statement that imports the class java.util.Arrays into your Java class.



            Copying Arrays
            You can copy an array into another array in Java in several ways.


            Copying an Array by Iterating the Array
            The first way to copy an array in Java is to iterate through the array and copy each value of the source array into the destination array.
            Here is how copying an array looks using that method:

            int[] source = new int[10];
            int[] dest   = new int[10];

            for(int i=0; i < source.length; i++) {
                source[i] = i;
            }

            for(int i=0; i < source.length; i++) {
                dest[i] = source[i];
            }
            First two int arrays are created.
            Second, the source array is initialized with values from 0 to 9 (0 to the length of the array minus 1).
            Third, each element in the source array is copied into the destination array.


            Copying an Array Using Arrays.copyOf()
            The second method to copy a Java array is to use the Arrays.copyOf() method.
            Here is how copying an array using Arrays.copyOf() looks:

            int[] source = new int[10];

            for(int i=0; i < source.length; i++) {
                source[i] = i;
            }

            int[] dest = Arrays.copyOf(source, source.length);
            The Arrays.copyOf() method takes 2 parameters.
            The first parameter is the array to copy.
            The second parameter is the length of the new array.
            This parameter can be used to specify how many elements from the source array to copy.


            Copying an Array Using Arrays.copyOfRange()
            The third method to copy a Java array is to use the Arrays.copyOfRange() method.
            The Arrays.copyOfRange() method copies a range of an array, not necessarily the full array.
            Here is how copying a full array using Arrays.copyOfRange() in Java looks:

            int[] source = new int[10];

            for(int i=0; i < source.length; i++) {
                source[i] = i;
            }

            int[] dest = Arrays.copyOfRange(source, 0, source.length);
            The Arrays.copyOfRange() method takes 3 parameters.
            The first parameter is the array to copy.
            The second parameter is the first index in the source array to include in the copy.
            The third parameter is the last index in the source array to include in the copy (excluded - so passing 10 will copy until and including index 9).


            Converting Arrays to Strings With Arrays.toString()
            You can convert an Java array of primitive types to a String using the Arrays.toString() method.
            Here is an example of how to convert an array of int to a String using Arrays.toString():

            int[]   ints = new int[10];

            for(int i=0; i < ints.length; i++){
                ints[i] = 10 - i;
            }

            System.out.println(java.util.Arrays.toString(ints));
            The first line creates an array of int with 10 elements.
            The for loop initializes the array with the values from 10 to 1.
            The last line prints out the value returned from Arrays.toString().
            The returned String (which is printed) looks like this:

            [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]


            Sorting Arrays
            You can sort the elements of an array using the Arrays.sort() method.
            Sorting the elements of an array rearranges the order of the elements according to their sort order.
            Here is an Arrays.sort() example:

            int[]   ints = new int[10];

            for(int i=0; i < ints.length; i++){
                ints[i] = 10 - i;
            }

            System.out.println(java.util.Arrays.toString(ints));

            java.util.Arrays.sort(ints);

            System.out.println(java.util.Arrays.toString(ints));
            The first line declares and instantiates an array of int with a length of 10;

            The for loop iterates over the array and inserts values into each element.
            The values inserted will go from 10 to 1 in descending order.

            After the for loop the array is converted to a String using Arrays.toString() and printed out to the console (command line).
            At this point the output written to the console (the String version of the array) looks like this:

            [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
            The array is then sorted using Arrays.sort().
            The elements will now be ordered in ascending order.

            After sorting the array, it is again converted into a String and printed to the console.
            The output printed this time looks like this:

            [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


            Sorting Arrays of Objects
            The Arrays.sort() example shown earlier only works for Java arrays of primitive data types.
            Java's primitive data types have a natural ordering, either their numeric order,
            or the order of the characters in the ASCII table (the binary number representing the character).

            If you want to sort an array of objects you need to use a different method.
            Objects may not have any natural sort order,
            so you need to provide another object which is capable of determining the order of your objects.
            Such an object is called a Comparator.

            The Comparator is an interface.
            Interfaces are covered in my tutorial about Java interfaces.
            The Comparator interfaces is covered in more detail in my Java Collections tutorial, in the text about Java Collections - Sorting tutorial.
            If you don't understand Java interfaces or the Comparator interface, you may find it hard to understand the following code.
            But I will show it to you anyways.

            Here is first the class for the objects we want to sort:

            private static class Employee{
                public String name;
                public int    employeeId;

                public Employee(String name, int employeeId){
                    this.name       = name;
                    this.employeeId = employeeId;
                }
            }
            The class Employee is a simple model of an employee (I have created the Employee class).
            The employee has a name and an employee id.
            You could potentially sort an array of Employee objects by the name, or by their employee id.
            I will show you how to do both.

            Here is first an example of sorting an array of Employee objects by their name using the Arrays.sort() method:

            Employee[] employeeArray = new Employee[3];

            employeeArray[0] = new Employee("Xander", 1);
            employeeArray[1] = new Employee("John"  , 3);
            employeeArray[2] = new Employee("Anna"  , 2);

            java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    return e1.name.compareTo(e2.name);
                }
            });


            for(int i=0; i < employeeArray.length; i++) {
                System.out.println(employeeArray[i].name);
            }
            First a Java array is declared.
            The array is of type Employee - the class I showed you earlier.
            Second, three Employee objects are created and inserted into the array.

            Third, the Arrays.sort() method is called to sort the array.
            As parameter to the Arrays.sort() method we pass the employee array, and a Comparator implementation which can determine the order of Employee objects.
            Don't worry if you don't fully understand this statement.
            It creates an anonymous implementation of the Comparator interface.
            Anonymous implementations of interfaces are covered in my text about nested classes in Java.
            The implementation also use Java Generics, which may further make it hard to read.

            What is important to catch in this example is the implementation of the compare() method of the anonymous inner implementation of the Comparator interface.
            This method returns a positive number if the first object is "bigger" (later in sort order)
            than the second object, 0 they are "equal" (in sort order),
            and a negative number if the first object is "smaller" (earlier in sort order) than the second object.
            In the example above we simply call the String.compare() method which does the comparison for us (compares the employee names).

            After sorting the array we iterate through it and print out the employee names. This is how the output printed looks:

            Anna
            John
            Xander
            Notice how the order has been reversed compared to the order in which they were originally inserted into the array.

            Let us now see how it looks to sort the Employee objects by their employee id instead.
            Here is the example from before, with a modified implementation of the compare() method of the anonymous implementation of the Comparator interface:

            Employee[] employeeArray = new Employee[3];

            employeeArray[0] = new Employee("Xander", 1);
            employeeArray[1] = new Employee("John"  , 3);
            employeeArray[2] = new Employee("Anna"  , 2);

            java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    return e1.employeeId - e2.employeeId;
                }
            });

            for(int i=0; i < employeeArray.length; i++) {
                System.out.println(employeeArray[i].name);
            }
            Notice how the compare() method returns the difference between the employee ids by subtracting one from the other.
            This is the easiest way to determine the natural order of number variables.

            The output printed from this code would be:

            Xander
            Anna
            John
            To compare the Employee objects in the array first by their name,
            and if that is the same,
            then by their employee id, the compare() implementation would look like this:

            java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    int nameDiff = e1.name.compareTo(e2.name);
                    if(nameDiff != 0) { return nameDiff; }

                    return e1.employeeId - e2.employeeId;
                }
            });


            Filling Arrays With Arrays.fill()
            The Arrays class has set of methods called fill().
            These Arrays.fill() methods can fill an array with a given value.
            This is easier than iterating through the array and inserting the value yourself.
            Here is an example of using Arrays.fill() to fill an int array:

            int[] intArray = new int[10];

            Arrays.fill(intArray, 123);

            System.out.println(Arrays.toString(intArray));
            This example creates an int array and fills the value 123 into all elements in the array.
            The last line of the example converts the array to a String and prints it out to the console.
            Here is what the output would look like:

            [123, 123, 123, 123, 123, 123, 123, 123, 123, 123]
            There is a version of the Arrays.fill() method which takes a from and to index,
            so only elements with indexes in this interval are filled with the given value.
            Here is an example of that Arrays.fill() method:

            int[] intArray = new int[10];

            Arrays.fill(ints2, 3, 5, 123) ;

            System.out.println(Arrays.toString(intArray));
            This example only fills the elements which have index 3 and 4 (3 to 5 without 5) with the value 123.
            Here is the output printed from this example:

            0, 0, 0, 123, 123, 0, 0, 0, 0, 0]
            Searching Arrays with Arrays.binarySearch()
            The Arrays class contains a set of methods called binarySearch().
            This method helps you perform a binary search in an array.
            The array must first be sorted. You can do so yourself, or via the Arrays.sort() method covered earlier in this text.
            Here is an Arrays.binarySearch() example:

            int[] ints = {0,2,4,6,8,10};

            int index = Arrays.binarySearch(ints, 6);

            System.out.println(index);
            The second line of this example searches in the array for the value 6.
            The binarySearch() method will return the index in the array in which the element was found.
            In the example above the binarySearch() method would return 3.

            If more than one element exists in the array with the searched value, there is no guarantee about which element will be found.

            If no element is found with the given value, a negative number will be returned.
            The negative number will be the index at which the searched element would be inserted, and then minus one. Look at this example:

            int[] ints = {0,2,4,6,8,10};

            int index = Arrays.binarySearch(ints, 7);

            System.out.println(index);
            The number 7 is not found in the array.
            The number 7 should have been inserted into the array at index 4, if 7 was to be inserted into the array (and the sort order kept).
            Therefore binarySearch() returns -4 - 1 = -5 .

            If all elements in the array are smaller than the sought value, then binarySearch() will return - length of the array - 1. Look at this example:

            int[] ints = {0,2,4,6,8,10};

            int index = Arrays.binarySearch(ints, 12);

            System.out.println(index);
            In this example we search for 12 in the array, but all elements in the array are smaller than 12.
            Therefore binarySearch() will return -length (-6) - 1 = -6 -1 = -7.

            The Arrays.binarySearch() method also exists in a version where you just search part of the array. Here is how that looks:

            int[] ints = {0,2,4,6,8,10};

            int index = Arrays.binarySearch(ints, 0, 4, 2);

            System.out.println(index);
            This example searches the array for the value 2 but only between index 0 and 4 (without 4).

            This version of binarySearch() works just like the other version, except in the cases where no matching element is found.
            If no element is found matching within the index interval,
            then binarySearch() will still return the index of where the value should have been inserted.
            But, if all values in the interval are smaller than the sought value, binarySearch() will return -toIndex -1 , and not -array length - 1.
            Thus, this binarySearch() example

            int[] ints = {0,2,4,6,8,10};

            int index = Arrays.binarySearch(ints, 0, 4, 12);
            will return -5 and not -7 like binarySearch(ints, 12) would have.

            Checking if Arrays are Equal with Arrays.equals()
            The java.util.Arrays class contains a set of methods called equals() which can be used to check if two Java arrays are equal.
            Two arrays are considered equal if the arrays have the same length, and the elements are equal to each other in the order they are found in the array.
            Look at this Arrays.equals() example:

            int[] ints1 = {0,2,4,6,8,10};
            int[] ints2 = {0,2,4,6,8,10};
            int[] ints3 = {10,8,6,4,2,0};

            boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
            boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

            System.out.println(ints1EqualsInts2);
            System.out.println(ints1EqualsInts3);
            This example compares the array ints1 to the arrays ints2 and ints3.
            The first comparison will result in the value true since ints1 and ints2 contains the same elements in the same order.
            The second comparison will result in the value false. Array ints1 contains the same elements as ints3 but not in the same order.
            Therefore the two arrays are not considered equal.






         */
}

}
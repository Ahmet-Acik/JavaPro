package day2_HelloWorld;

public class Method {

    /*
        Java Methods With Examples
    In Java programming language when you create a class it contains variables and methods.
    In this tutorial we’ll learn about Java methods.
    In the Day1_ JavaInt we have already seen one method; main method which begins the execution of the program.


            // Table of contents
            Methods in Java
            Components in a Java method
            Method Naming convention in Java
            Java method examples
            Advantages of method
            Methods in Java
    A method is a collection of statements that can be executed by calling that method and it may or may not return a value after executing statements.

            // Syntax of a method in Java is as follows-

             Access_modifier return_type methodName(parameter-list) {
              // body of method
            }
        e.g., public int doAddition(int i, int j){
                  int sum = i + j;
                  return sum;
                }

            // Components in a Java method
        A method in Java is made up of the following components-

    1. Access modifier– All the four access modifiers – public, private, protected, default can be used with methods of the class.

        If a method is declared as public then it is visible to all classes in the same package or other packages.
        If a method is declared as private then that method can only be accessed in its own class.
        If a method is declared as protected then it is accessible to any class in the same package or to any subclass (of the class where method is declared) even in different package.
        If a method has default access specifier (declared with no access specifier) then it is accessible by any class with in the same package.

    2. Return type– A method can return a value and the type of that value should be specified as the return type. If a method doesn’t return a value then the return type should be specified as void.

    3. Method name– A method should have a name to identify that method. That name is used to call the method. A method name in the class doesn’t have to be unique but the method with the same name is said to be overloading the method and it needs to follow certain rules.

    4. Parameter list– You can pass arguments to a method and it should be passed as a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.

    5. Method body– The method body, enclosed between braces {}, it contains the method’s code along with the declaration of local variables.


    6. Exception list— A method can also specify the list of exceptions that is expected to throw using throws clause.

    7. Static method– You can also declare a method to be static. A static method is associated with the class and it can be called directly using the class name like ClassName.static_method(). You don’t need to create an instance of a class to call a static method.

    Here is an example of a Java method declaration which is a public method, takes two integers as arguments and also return a value of type int.

        public int doAddition(int i, int j){
          int sum = i + j;
          return sum;
        }

            // Method Naming convention in Java
    Although a method name can be any legal identifier, code conventions restrict method names. By convention, method names should be a verb in lowercase or a multi-word name that begins with a verb in lowercase, followed by adjectives, nouns, etc. If method has a multi-word name, the first letter of each of the second and following words should be capitalized (known as camel case). Here are some examples:

        add
        doAddition
        getFinalData
        isEmpty

            // Java method examples

        When a method is called it executes method body and returns to the point from where it was called after one of the following-

        It completes all the statements in the method.
        Reaches a return statement.
        An exception occurs and method throws that exception.


            // 1- Method that returns a value– In the first example there is a method doAddition() that takes two integers as arguments and return sum of those two integers.

                public class MyClass {
                  public static void main(String[] args) {
                    MyClass obj = new MyClass();
                    // calling method
                    int sum = obj.doAddition(5, 10);
                    System.out.println("Sum is- " + sum);
                  }

                  public int doAddition(int i, int j){
                    int sum = i + j;
                    return sum;
                  }
                }
                Output
                 */

    public static void main(String[] args) {
        Method obj = new Method();
        // calling method
        int sum = obj.doAddition(5, 10);
        System.out.println("Sum is- " + sum);
    }

    public int doAddition(int i, int j) {
        int sum = i + j;
        return sum; // Sum is- 15


        }
}

/*
            // 2 - Method with no return value (void)– In this Java method example there is a method display() which has one String argument and return type is void.

                public class MyClass {
                  public static void main(String[] args) {
                    MyClass obj = new MyClass();
                    obj.display("knpCode");
                  }

                  public void display(String str){
                    System.out.println("Hello " + str);
                  }
                }
                Output

                Hello knpCode

                 */

class MyClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display("knpCode");
    }

    public void display(String str) {
        System.out.println("Hello " + str);
    }
}


/*

            // 3- Calling method of another class– In this example there are two classes ReverseWord and MyClass.
            In class ReverseWord there is a public method reverseString() which is called from MyClass using an instance of ReverseWord class.

                public class ReverseWord {
                  public String reverseString(String str){
                    // validate String
                    if((str == null) || (str.length() <= 1)){
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(str);
                    return sb.reverse().toString();
                  }
                }
                public class MyClass {
                  public static void main(String[] args) {
                    ReverseWord obj = new ReverseWord();
                    String reversedString = obj.reverseString("knpCode");
                    System.out.println("Reversed String is- " + reversedString);
                  }

                  public void display(String str){
                    System.out.println("Hello " + str);
                  }
                }
                Output

            Reversed String is- edoCpnk

*/

class ReverseWord {
    public String reverseString(String str){
        // validate String
        if((str == null) || (str.length() <= 1)){
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
class MyClass1 {
    public static void main(String[] args) {
        ReverseWord obj = new ReverseWord();
        String reversedString = obj.reverseString("knpCode");
        System.out.println("Reversed String is- " + reversedString);
    }

    public void display(String str){
        System.out.println("Hello " + str);

            // Output

          //   Reversed String is- edoCpnk
        }
}

/*

            // 4- Calling method from another method– In this example there are two methods in the class method1 and method2 and method2() is called from method1().

                public class MyClass {
                  public static void main(String[] args) {
                    MyClass obj = new MyClass();
                    obj.method1();
                    System.out.println("After calling method1");
                  }

                  private void method1(){
                    System.out.println("in method1");
                    this.method2();
                    System.out.println("After calling method2");
                  }

                  private void method2(){
                    System.out.println("in method2");
                  }
                }
                Output

                in method1
                in method2
                After calling method2
                After calling method1
                Few things to note here are-
            - Access modifier is private for the methods so these methods can be used only with in this class.
            - From method1, method2 is called using the this. keyword.
            - From the output you can see how method returns to the point from which it is called after finishing its execution.

*/
class MyClass2 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.method1();
        System.out.println("After calling method1");
    }

    private void method1(){
        System.out.println("in method1");
        this.method2();
        System.out.println("After calling method2");
    }

    private void method2(){
        System.out.println("in method2");
    }
}
        //   Output
        //
        //      in method1
        //      in method2
        //      After calling method2
        //      After calling method1
        //      Few things to note here are-

    //  Access modifier is private for the methods so these methods can be used only with in this class.
    //    From method1, method2 is called using the this. keyword.
    //    From the output you can see how method returns to the point from which it is called after finishing its execution.

/*

Advantages of method
1 Code reusability– Main advantage of using methods is code reusability.
    You can write any functionality with in a method and then that method can be called any time that functionality is needed.
2 Encapsulation– Methods help with the object oriented concept encapsulation.
    Any member variable should only be manipulated by the method of that class.
3 Method also help with polymorphism through method overloading and method overriding.


     */


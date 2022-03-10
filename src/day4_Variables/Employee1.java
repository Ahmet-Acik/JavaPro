package day4_Variables;

        /*
                Class variables (static variables) in Java
            Class variables are also declared in a class not in any method or constructor and these variables also use static keyword.
            A static variable is associated with the class and all the instances of the class share the same variable
            i.e. there is only one copy of static variable.

            Class Variable: It is basically a static variable that can be declared anywhere at class level with static.
            Across different objects, these variables can have only one value.
            These variables are not tied to any particular object of the class, therefore, can share across all objects of the class.

                Example:

                // class Taxes
                // {
                //    static int count;
                //    /*...*/
                // }

        /*
        Static variable Java example

         */

class Employee1 {

    private String name;
    private int age;
    private String dept;
    private int wages;
    //static variable
    static final int DAYS_PAID = 22;
    Employee1 (String name, int age, String dept, int wages){
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.wages = wages;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public int getWages() {
        return wages;
    }
    public void setWages(int wages) {
        this.wages = wages;
    }
}
class InstanceExp1 {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1("Mark", 32, "Engineering", 50*8*Employee1.DAYS_PAID);
        Employee1 emp2 = new Employee1("Amy", 28, "Human Resources", 30*8*Employee1.DAYS_PAID);
        System.out.println("First Employee details- ");
        System.out.println("Name- " + emp1.getName() + " Age- " + emp1.getAge() + " Dept- " + emp1.getDept() + " Salary- "+ emp1.getWages());
        System.out.println("Second Employee details- ");
        System.out.println("Name- " + emp2.getName() + " Age- " + emp2.getAge() + " Dept- " + emp2.getDept()+ " Salary- "+ emp2.getWages());

    /*

        In the example there is a static variable DAYS_PAID which is accessed using the class name (Employee.DAYS_PAID).
        First Employee details-
        Name- Mark Age- 32 Dept- Engineering Salary- 8800
        Second Employee details-
        Name- Amy Age- 28 Dept- Human Resources Salary- 5280
     */


    }
}
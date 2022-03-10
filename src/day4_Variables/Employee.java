package day4_Variables;

                 /*

            Instance variable in Java

        Instance variables in Java (also known as non-static fields) are those variables which are created for each instance (object) of the class.
        Each object of the class will have a separate copy of instance variable.
        Instance variables are declared in a class not in any method or constructor.


        Instance Variable: It is basically a class variable without a static modifier and is usually shared by all class instances.
        Across different objects, these variables can have different values.
        They are tied to a particular object instance of the class, therefore, the contents of an instance variable are totally independent of one object instance to others.

                Example:

                        //class Taxes
                       // {
                       //   int count;
                       //    /*...*/
                       //  }

/*
        Instance variables Java example

        */
class Employee {




        private String name;
        private int age;
        private String dept;
        Employee(String name, int age, String dept){
            this.name = name;
            this.age = age;
            this.dept = dept;
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
    }
    class InstanceExp {
        public static void main(String[] args) {
            Employee emp1 = new Employee("Mark", 32, "Engineering");
            Employee emp2 = new Employee("Amy", 28, "Human Resources");
            System.out.println("First Employee details- ");
            System.out.println("Name- " + emp1.getName() + " Age- " + emp1.getAge() + " Dept- " + emp1.getDept());
            System.out.println("Second Employee details- ");
            System.out.println("Name- " + emp2.getName() + " Age- " + emp2.getAge() + " Dept- " + emp2.getDept());

       /*

               In the example there are three instance variables in class Employee.
               Then two objects of Employee class are created both have their own copy of instance variables with different values.

                First Employee details-
                Name- Mark Age- 32 Dept- Engineering
                Second Employee details-
                Name- Amy Age- 28 Dept- Human Resources
        */



        }
    }


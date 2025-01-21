public class Intro103 {
    public static void main(String[] args) {
        Student var1 = new Student("Harshal", 24 );      //parameterized constructor
        Student var2 = new Student("Raj", 32 );         //parameterized constructor
        Student var3 = new Student();                             // defalut constructor

        System.out.println(var1.name+" "+var1.roll_no);
        System.out.println(var2.name+" "+var2.roll_no);
        System.out.println(var3.name+" "+var3.roll_no);


    }
}
class Student{
    String name;
    int roll_no;

    Student(String name,int roll) {      //parameterized constructor
        this.name = name;
        this.roll_no = roll;
    }
    
    Student(){                            // default constructor
        this.name = "Harry";              
        this.roll_no = 30;
    }
}
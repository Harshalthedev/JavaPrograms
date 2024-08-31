class Intro {
    public static void main(String[] args) {
        // int[] roll_no = new int[5];
        // float[] marks = new float[5];
        // String[] name = new String[5];

        // Students[] students = new Students[5];

        Students st1 = new Students(35,98.02f,"Student1");
        Students random = new Students();
        Students st2 = new Students(35,98.02f,"Student2");

        // st1.greeting();

        // st1.roll_no = 5;
        // st1.marks = 95.26f;
        // st1.name = "jay";

        System.out.println(st1.roll_no);
        System.out.println(st1.marks);
        System.out.println(st1.name);
        
        System.out.println(st2.roll_no);
        System.out.println(st2.marks);
        System.out.println(st2.name);
    }
}

class Students {
    int roll_no;
    float marks;
    String name;

    void greeting() {
        System.out.println("my name is: "+name);
    }

    Students(int roll, float marks,String naam) {
        this.roll_no = roll;
        this.marks = marks;
        this.name = naam;
    }
    Students() {
        this.roll_no = 25;
        this.marks = 88.36f;
        this.name = "Raj";
    }
}
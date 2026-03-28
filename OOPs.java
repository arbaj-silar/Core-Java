class Calculator {
    int num = 5;
    /* Method Overloading in add */
    public int add() {
        System.out.println("in add");
        return 0;
    }

    public int add(int num1, int num2) {
        return num1+num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1+num2+num3;
    }
}

class Students {
    int rollNo;
    String name;
    int marks;

}
public class OOPs {
    // Object : Properties and Behaviour
    // Class are bluePrints of On=bjects and Method

    public static void main(String[] args) {
        //Creating a Object
        /* calc like a object who store th Calculator data types in the variable like
        permitive data types like int, float */
        Calculator calc = new Calculator();
        calc.add(); 

        int a = 9, b = 4;
        int res = calc.add(a, b);
        System.out.println(res);

        Calculator obj = new Calculator();

        System.out.println(calc.num); // 5
        System.out.println(obj.num); // 5
        
        obj.num = 8;
        System.out.println(calc.num); // 5
        System.out.println(obj.num); // 8

        Students s1 = new Students();
        s1.rollNo = 1;
        s1.name = "Dean";
        s1.marks = 79;
    
        Students s2 = new Students();
        s2.rollNo = 2;
        s2.name = "Alice";
        s2.marks = 83;
        Students s3 = new Students();
        s3.rollNo = 3;
        s3.name = "Sam";
        s3.marks = 50;


        /* Students students[] = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;
        */
        Students students[] = {s1, s2, s3};

        for(Students st: students) {
            System.out.println("Rollno : " + st.rollNo + " | Name : " + st.name + " | Marks : " + st.marks);
        }
    }
}

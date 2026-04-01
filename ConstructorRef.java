import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private int age;
    private String name;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }   
}

public class ConstructorRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Dean", "Max");
        List<Student> students = new ArrayList<>();

        // for(String name: names) {
        //     students.add(new Student(name));
        // }

        students = names.stream().map(Student::new).toList();
        System.out.println(students);
    }
}
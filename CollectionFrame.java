import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return  "Student [age = "+ age +", name = "+name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if(this.age >that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class CollectionFrame {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 >j%10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Comparator<Student> s = (i, j) ->  i.age > j.age ? 1 : -1;
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(45);
        nums.add(37);
        nums.add(20);
        nums.add(56);
        nums.add(98);
        
        Collections.sort(nums, com);
        System.out.println(nums);
        List<Student> std = new ArrayList<>();

        Collections.sort(nums, com);
        for(Integer i: nums) {
            System.out.println(i);
        }
        std.add(new Student(17, "Alice"));
        std.add(new Student(23, "Sam"));
        std.add(new Student(19, "Dean"));
        std.add(new Student(22, "Max"));
        std.add(new Student(15, "Page"));
        
        Collections.sort(std, s);
        
        for(Student c: std) {
            System.out.println(c);
        }
        Collections.sort(std);
        
        for(Student c: std) {
            System.out.println(c);
        }
    }
}
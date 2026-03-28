class Human {
    private String name;
    private int age = 19;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() { // Default
        System.out.println("in constructor");
    }
    public Human(int age, String name) { // Parametrize const
        System.out.println("Name : "+ name + "| Age : "+ age);
    }
}

public class Incapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        
        obj.setAge(20);
        System.out.println(obj.getAge());

        Human obj1 = new Human(21, "Alice");
    }
}

interface A {
    int age = 21; // final and static cann't change
    String name = "Alice";

    void show();
    void search(); // abstract functions
}
interface C {
    void config();
}

class B implements A, D {
    public void show() {
        System.out.println("in show");
    }
    public void search() {
        System.out.println("searching");
    }
    public void config() {
        System.out.println("congig");
    }
}

//  class - class - extends
//  class - interface - implements
//  interfece - interface - extends

interface D extends C {

}

class Interfaces {
    public static void main(String[] args) {
        A obj = new B();
        obj.search();
        obj.show();

        System.out.println(A.age);
    }    
}

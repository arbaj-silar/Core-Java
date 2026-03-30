@FunctionalInterface
interface A {
    void show();
}
interface B {
    void show(int i);
}

class LamdaExpression {
    public static void main(String[] args) {
        A obj = () -> System.out.println("in show");
        B obj1 =  i -> System.out.println("in show  : "+ i);
        
        obj.show();
        obj1.show(3);
    }
}

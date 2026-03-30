class A {
    public void show() {
        System.out.println("in a show");
    }
}
class B extends A {
    @Override  // It show the method name has a mistake
    public void show() {
        System.out.println("in b show");
    }
}
@FunctionalInterface
interface C {
    void search();
}

class Annotations {
    public static void main(String[] args) {
        B b = new B();
        b.show();

        //  @.... - Annotations

        C c = new C() {
            public void search() {
                System.out.println("Search");
            }
        };
        c.search();
    }
}
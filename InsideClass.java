class A {
    public void show() {
        System.out.println("show..");
    }

    class B {
        public void config() {
            System.out.println("config..");
        }
    }

    static class C {
        public void cut() {
            System.out.println("cut..");
        }
    }
}

class D {
    public void seek() {
        System.out.println("seek");
    }
}
class InsideClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C();
        obj2.cut();

        //  Anonymous Class
        D ob3 = new D() {
            public void seek() {
                System.out.println("searching");
            }
            // We can add multiple mathed to override the main class
        };
        ob3.seek();
    }
}

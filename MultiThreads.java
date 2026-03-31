/* 
class A {
    public void show() {
        for(int i=0; i<10; i++) {
            System.out.println("A");
        }
    }
}

class B {
    public void show() {
        for(int i=0; i<10; i++) {
            System.out.println("B");
        }
    }
}
class C extends Thread{
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("C");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class D extends Thread{
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("D");
        }
    }
}*//* 
class E implements Runnable{
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class F implements Runnable{
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
*/

class Counter {
    int count;
    public synchronized void increament() {
        count++;
    }
}
public class MultiThreads {
    public static void main(String[] args) {
        /* 
        A a = new A();
        B b = new B();
        
        a.show();
        b.show();

        C c = new C();
        D d = new D();

        c.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d.start();
        */
        /*Runnable e = new E();
        Runnable f = new F();

        Thread t1 = new Thread(e);
        Thread t2 = new Thread(f);

        t1.start();
        t2.start();
    */
        Counter c = new Counter();

        Runnable a = () -> {
        for(int i=0; i<1000; i++) {
            c.increament();
        }
        };
        Runnable b = () -> {
        for(int i=0; i<1000; i++) {
            c.increament();;    
        }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.count);
    }
}

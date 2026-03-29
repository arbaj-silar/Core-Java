abstract class Car {
    public abstract void drive();
    // It is neccessary for all other inherited classes

    public void music() {
        System.out.println("play music...");
    }

    public abstract void fly();
}

abstract class Frari extends Car{
    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdatedFrari extends Frari {
    public void drive() {
        System.out.println("Drining new.....");
    }
    public void fly() {
        System.out.println("flying...");
    }
    
}

public class Abstract {
    public static void main(String[] args) {
        Car obj = new UpdatedFrari();

        obj.drive();
        obj.music();
        obj.fly();
    }
}

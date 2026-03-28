class Mobile {
    String brand;
    int price;
    /*  Static variable are comon for all object.
        We can call it by class name ( No need of object to call ).
        It is a Class Member not a object member  */
    static String name;

    //  Static block call one in the class 
    /*  Class loads and object created 
    (when class loads the static lock are called)   */
    static {
        name = "Phone";
        System.out.println("In static Block");
    }

    public Mobile() {
        brand = "";
        price = 200;
    }
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
    
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

class StaticKey {
    public static void main(String[] args) {
        Mobile obj = new Mobile();

        obj.brand = "Apple";
        obj.price = 2000;
        //  obj.name = "SmartPhone";
        Mobile.name = "SmartPhone";
        Mobile obj1 = new Mobile();

        obj1.brand = "Samsung";
        obj1.price = 2500;
        //  obj1.name = "SmartPhone";
        Mobile.name = "SmartPhone";

        //  obj.name = "phone";
        Mobile.name = "Phone";
        obj.show();
        obj.show();

        Mobile.show1(obj1);

        new Mobile();
       // Object Created to store the value need variable whose data type is Mobile
        new Mobile().show();
        /*  Camel Case  */

        //   class and interface - Calc, Runneble
        //   Variable and method - marks , show()
        //   Constants - PIE, BRAND;
    }
}
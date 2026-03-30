enum Status {
    Runing , Error, Pending, Success;
}

enum Laptop {
    Macbook(200), Lenovo(320), Dell(543), XPS(1200);
    private int price;
    Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}

class Enums {
    public static void main(String[] args) {
        Status obj = Status.Error;
        System.out.println(obj);        
        Status s = Status.Pending;
        System.out.println(s);        
        System.out.println(s.ordinal());   //idx or position   
        
        Status ss[] = Status.values();
        for(Status a: ss) {
            System.out.println(a+" : "+a.ordinal());
        }
        if(Status.Pending == s) {
            System.out.println("His pending until now");
        }

        Laptop lap = Laptop.Lenovo;
        System.out.println(lap+" : "+lap.getPrice());


        for(Laptop l: Laptop.values()) {
            System.out.println(l + " : "+l.getPrice());
        }
    }    
}

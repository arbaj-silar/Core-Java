sealed class A permits B, C {
    
}
final class B extends A {

}
non-sealed class C extends A {

}
class D extends C {

}

class Cons {
    final int id;
    final String name;
    public Cons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cons other = (Cons) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cons [id=" + id + ", name=" + name + "]";
    }
    
}

record Alien (int id, String name) {}
public class LVTI {
    // Local variable Type Interface
    public static void main(String[] args) {
        // var i = 5;
        // var nums = new int[2];
        // var c = new ArrayList<>();
        Cons c1 = new Cons(191, "Dean");
        Cons c2 = new Cons(191, "Dean");

        System.out.println(c1.equals(c2));

        Alien A1 = new Alien(191, "Dean");
        Alien A2 = new Alien(191, "Dean");

        System.out.println(A1.equals(A2));
    }
}

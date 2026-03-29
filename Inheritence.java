class Calc {

    public int add(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a-b;
    }

    public Calc() {
        super();
        System.out.println("in calc");
    }
    public Calc(int n) {
        super();
        System.out.println("in adcalc");
    }
}
class AdvCalc extends Calc {
    public int mul(int a, int b) {
        return a*b;
    }
    public int div(int a, int b) {
        return a/b;
    }

    /*  Single level Inheritence -  A -> B
        Multi level Inheritence -  A -> B -> C -> ....   
        Multiple Inheritence -  A, B   A -> C, B -> C (In java it's Not work) it called Ambiguity
    */
   public AdvCalc() {
        super();
        System.out.println("inAdv Calc");
    }
    public AdvCalc(int n) {
        super(n);
        System.out.println("inAdv Calc");
    }

    /*  Method overriding   A(add())  ->  B(add())   
        if obj are B then it calls B(add()) method
    */

}
public class Inheritence {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(7, 1);
        int r2 = obj.sub(8, 3);
        
        System.out.println(obj.mul(3, 2));
        System.out.println(r1 +" "+ r2);
        
    }
}

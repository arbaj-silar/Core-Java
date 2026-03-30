class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        int i =0;
        int j = 1;

        try {
            j = 18/i;
            throw new MyException("My Build Exception ");
        } catch(Exception e) {
            System.out.println("SomeThing Wrong..");
        }

        System.out.println(j);
        i =1;
        j = 1;
        int arr[] = new int[5];

        try {
            j = 18/i;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch(ArithmeticException e) {
            System.out.println("Arthmetic excepssion");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("SomeThing Wrong..   " + e);
        }
        
        System.out.println(j);
        i =1;
        j = 0;

        try {
            j = 18-18;
            if(j == 0){
                throw new ArithmeticException();
            }
        }catch(Exception e) {
            System.out.println("SomeThing Wrong..   " + e);
        }

        j = 0; 
        try {
            j = 0;
        } catch (Exception e) {

        }
        System.out.println(j);

        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

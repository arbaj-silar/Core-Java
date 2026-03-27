public class Basic {
    public static void main(String[] args) {
        // Premitive Data type

        // Integer Datatype : int, byte, short, long

        int num = 7;
        byte by = 127;
        short sh = 178;
        long l = 890;

        // Float Data types : float, double

        float f = 3.9f;
        double d = 8.91;

        // Character Data types : char
        char ch = 'k';

        // Boolean Data type : True, False
        boolean bo = true;

        //literals
        int no = 0x12e; // hex number
        System.out.println(no);

        double dl = 12e10;
        System.out.println(dl);

        /* Type conversion And Type casting */
        byte b = 127;
        int a = 12;

        // Casting : lossy conversion
        b = (byte)a;

        // Conversion
        a = b;
    }
}
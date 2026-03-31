import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter no. : ");
        try {
            int i = System.in.read();
            System.out.println(i-48);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println();
        }

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        // or use Throws
        
        System.out.println("Enter : ");
        int num = Integer.parseInt(br.readLine());
        System.out.println(num);
    }
}

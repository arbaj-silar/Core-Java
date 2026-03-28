public class Strings {
    public static void main(String[] args) {
        //String s = new String("Alice");
        /* Strings are imutable : They cann't change in any condition */

        String s = "Alice";
        //String concatination
        System.out.println("Name : " + s);

        StringBuffer sb = new StringBuffer("Alice");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Silvia");
        System.out.println(sb);

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

        sb.insert(5, " Rude");
        System.out.println(sb);

        // StringBuffer are thread safe and String Builder is not
    }
}

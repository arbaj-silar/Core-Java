import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Dean", "Sam", "Max");
        
        List<String> Nam = names.stream()
                            //.map(name -> name.toUpperCase())
                            .map(String::toUpperCase).toList();

        Nam.forEach(System.out::println);
        System.out.println(Nam);
    }   
}

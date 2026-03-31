import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 7, 1, 2, 8);

        int sum = 0;
        for(int i: nums) {
            if(i%2 == 0) {
                i *= 2;
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(nums);
        
        Consumer<Integer> com = n -> System.out.println(n);
        nums.forEach(com);
        System.out.print("Different for each loop : ");
        nums.forEach(n -> System.out.println(n));
        
        Stream<Integer> s1 = nums.stream();
        s1.forEach(n -> System.out.println(n));

        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // s2.forEach(n -> System.out.println(n)); 


    }
}

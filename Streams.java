import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 7, 1, 2, 8);
        
        // time calculation in program
        long stTime = System.currentTimeMillis();
        Predicate<Integer> p = n -> n%2 == 0;
        Function<Integer, Integer> fn = n -> n*2;
        int res = nums.stream()
                        .filter(p)
                        .map(fn) 
                        .reduce(0, (c, e)->c+e);
        
        // int res = nums.stream()
        //                 .filter(n -> n%2 == 0)
        //                 .map(n -> n*2)
        //                 .reduce(0, (c, e)->c+e);
        Stream<Integer> sortStream = nums.parallelStream()
                                    .filter(p)
                                    .sorted();
        long midTime = System.currentTimeMillis();
        sortStream.forEach(n -> System.out.println(n));
        System.out.println(res);
        long endTime = System.currentTimeMillis();

        System.out.println("Program runTime : "+(endTime-stTime));
        System.out.println("Program runTime : "+(endTime-midTime));
        System.out.println("Program runTime : "+(midTime-stTime));
    }
}

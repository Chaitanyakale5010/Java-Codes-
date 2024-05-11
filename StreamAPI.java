import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class StreamAPI{
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,3,5,6,7,9);
        // System.out.println(l);
// For the foreACH METHOD       // l.forEach(cms);


// Implementing the consumer functional interface 
        Consumer<Integer> cms = new Consumer<Integer>() {
          public void accept(Integer i){
            System.out.println(i);
            }
        };

        // Stream API

        Stream<Integer> s =l.stream();
        s.forEach(cms);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenStreams {
    public static void main(String[] args) {
        //Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //way1
        System.out.println(numbers.stream().filter(n->n%2==0).collect(Collectors.summingInt(Integer::intValue)));

        //way2
        System.out.println(numbers.stream().filter(n->n%2 !=0).collect(Collectors.summingInt(Integer::intValue)));
    }
}

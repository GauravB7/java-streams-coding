import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NLargestSmallest {
    public static void main(String[] args) {
        //Write a Java program to find the second smallest and largest elements in a list of integers using streams.

        List<Integer> list = Arrays.asList(70,50,35,89,77);

        //2nd smallest
        System.out.println(list.stream().sorted().skip(1).findFirst().orElse(0));

        //2nd Largest
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0));
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateList {
    public static void main(String[] args) {
        //Write a Java program to remove all duplicate elements from a list using streams.

        List<Integer> numbers = Arrays.asList(2,2,1,3,4,3,5,2,6,4,5);

        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));

    }
}

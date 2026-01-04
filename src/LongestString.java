import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        //Find the longest string in a list of strings using Java streams

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        System.out.println(strings.stream().max(Comparator.comparingInt(String::length)).orElse(""));
    }
}

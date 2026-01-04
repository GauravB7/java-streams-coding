import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

        List<String> list = Arrays.asList("Dhoni","Raina","Kohli","Gaikwad");

        //Ascending
        System.out.println(list.stream().sorted().collect(Collectors.toList()));

        //Descending
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}

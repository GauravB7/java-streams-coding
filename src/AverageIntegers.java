import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageIntegers {
    public static void main(String[] args) {
        //Write a Java program to calculate the average of a list of integers using streams.

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        //Way 1
        System.out.println(integerList.stream().collect(Collectors.averagingDouble(Integer::intValue)));

        //Way 2
        //Point to remember: having only average method without orelse will return optional
        System.out.println(integerList.stream().mapToInt(Integer::intValue).average().orElse(0));

    }
}

import java.util.ArrayList;
import java.util.List;

public class MinMaxList {
    public static void main(String[] args) {
        //Write a Java program to find the maximum and minimum values in a list of integers using streams.

        List<Integer> list1 = new ArrayList<>();
        list1.add(70);
        list1.add(75);
        list1.add(-1);
        list1.add(0);


        System.out.println(list1.stream().max(Integer::compareTo).orElse(0));
        System.out.println(list1.stream().min(Integer::compareTo).orElse(0));
    }
}

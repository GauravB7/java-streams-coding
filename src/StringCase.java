import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCase {
    public static void main(String[] args) {
        //Write a Java program to convert a list of strings to uppercase or lowercase using streams.

        List<String> players = new ArrayList<>();

        players.add("Dhoni");
        players.add("Kohli");
        players.add("Raina");
        players.add("Dube");

        //way 1
        System.out.println(players.stream().map(player -> player.toUpperCase()).collect(Collectors.toList()));

        //way 2
        System.out.println(players.stream().map(String::toLowerCase).collect(Collectors.toList()));
    }
}

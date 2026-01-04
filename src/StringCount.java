import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        //Count strings starting with letter using streams

        List<String> players = Arrays.asList("Dhoni","Raina","Kohli","Gaikwad","Dhawan");

        //Find the players starting with "D"
        System.out.println(players.stream().filter(player -> player.startsWith("D")).count());

    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAge {
    public static void main(String[] args) {
        //Calculate the average age of a list of Person objects using Java streams

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Dhoni",43));
        persons.add(new Person("Kohli", 38));
        persons.add(new Person("Raina", 39));


        //Way 1 using aggregators in collectors
        System.out.println(persons.stream().collect(Collectors.averagingInt(Person::getAge)));

        //Way 2 Create stream of ages and average
        System.out.println(persons.stream().mapToInt(Person::getAge).average().orElse(0));
    }
}


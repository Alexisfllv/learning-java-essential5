package App.Collectors02;

import App.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingExample {


    // contar elementos
    public void counting(List<Person> persons) {
        Map<String,Long> conteo = persons.stream()
                .collect(Collectors.groupingBy(Person::getName,Collectors.counting()));
        System.out.println(conteo);
    }

    public static void main(String[] args) {

        CountingExample cex = new CountingExample();

        List<Person> persons = List.of(
                new Person(1L,"Alexis", new BigDecimal("300")),
                new Person(2L,"Juan", new BigDecimal("400")),
                new Person(3L,"Maria", new BigDecimal("300")),
                new Person(4L,"Ana", new BigDecimal("500")),
                new Person(5L,"Alexis", new BigDecimal("600"))
        );

        cex.counting(persons);

    }
}

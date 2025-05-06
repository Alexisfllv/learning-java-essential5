package App.Collectors02;

import App.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

    // method
    public void joiningexmp(List<Person> personList){
        String nombresContatenados = personList.stream()
                .map(person -> person.getName())
                .collect(Collectors.joining(", "));

        System.out.println(nombresContatenados);
    }

    public static void main(String[] args) {

        JoiningExample jn = new JoiningExample();

        List<Person> persons = List.of(
                new Person(1L,"Alexis", new BigDecimal("300")),
                new Person(2L,"Juan", new BigDecimal("400")),
                new Person(3L,"Maria", new BigDecimal("300")),
                new Person(4L,"Ana", new BigDecimal("500")),
                new Person(5L,"Alexis", new BigDecimal("600"))
        );

        jn.joiningexmp(persons);
    }
}

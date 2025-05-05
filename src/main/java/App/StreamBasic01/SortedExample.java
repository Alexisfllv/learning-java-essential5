package App.StreamBasic01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortedExample {

    public void sortedPersons(List<Person> persons) {
        persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
    public void sortedNumbers(List<Integer> numbers) {
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }


    public static void main(String[] args) {

        SortedExample stp = new SortedExample();
        List<Person> personas = new ArrayList<>();
        personas.add(new Person(1l,"Alexis",new BigDecimal("332.20")));
        personas.add(new Person(2l,"Juan",new BigDecimal("123.20")));
        personas.add(new Person(3l,"Maria",new BigDecimal("123.20")));
        personas.add(new Person(4l,"Ana",new BigDecimal("123.20")));

        List<Integer> numeros = List.of(3,4,1,2,5);

        stp.sortedNumbers(numeros);
        stp.sortedPersons(personas);


    }

    // Clase interna
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Person {
        // atributos o métodos aquí

        private Long idPerson;
        private String name;
        private BigDecimal salary;
    }
}

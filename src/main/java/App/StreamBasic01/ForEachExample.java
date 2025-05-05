package App.StreamBasic01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public void forEachPersons(List<Person> persons) {

        persons.stream()
                .map(person -> new Person(
                        person.getIdPerson(),
                        person.getName().toUpperCase(),
                        person.getSalary()
                ))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        ForEachExample fel = new ForEachExample();
        List<Person> persons = new ArrayList<>();


        persons.add(new Person(1l,"Alexis",new BigDecimal("332.20")));
        persons.add(new Person(2l,"Juan",new BigDecimal("123.20")));
        persons.add(new Person(3l,"Maria",new BigDecimal("123.20")));

        fel.forEachPersons(persons);

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


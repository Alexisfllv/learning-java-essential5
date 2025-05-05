package App.StreamBasic01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public void mapPersons(List<Person> persons) {
        var personax2=  persons.stream()
                .filter(person -> person.getName().length() >=5)
                .map(person -> new Person(
                        person.getIdPerson(),
                        person.getName(),
                        person.getSalary().multiply(new BigDecimal("2"))
                ))
                .collect(Collectors.toList());
        personax2.forEach(System.out::println);
    }



    public static void main(String[] args) {
        MapExample ml = new MapExample();

        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1l,"Alexis",new BigDecimal("332.20")));
        persons.add(new Person(2l,"Juan",new BigDecimal("123.20")));
        persons.add(new Person(3l,"Maria",new BigDecimal("123.20")));

        ml.mapPersons(persons);


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

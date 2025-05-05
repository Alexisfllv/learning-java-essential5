package App.StreamBasic01;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {

    // methods
    public void filterPersons(List<Person> persons) {
        // filtrar nombres con mas de 5 letras
         List<Person> filtradoPersonas = persons.stream()
                .filter(person -> person.getName().length() >=5)
                .toList();
        filtradoPersonas.forEach(System.out::println);
    }

    public static void main(String[] args) {

        // lista de nombres
        FilterExample fl = new FilterExample();
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1l,"Alexis",new BigDecimal("332.20")));
        persons.add(new Person(2l,"Juan",new BigDecimal("123.20")));
        persons.add(new Person(3l,"Maria",new BigDecimal("123.20")));

        fl.filterPersons(persons);

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



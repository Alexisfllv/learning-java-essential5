package App.Collectors02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrupingByExample {


    public void groupingBySalary(List<Person> persons) {
        Map<BigDecimal,List<Person>> grouped = persons.stream()
                .collect(Collectors.groupingBy(person -> person.getSalary()));

//        grouped.forEach((salary, list) -> {
//                    System.out.println("Salary :" + salary);
//                    list.forEach(System.out::println);
//                }
//                );

        grouped.forEach((salary, list) -> System.out.println("Salary :" + salary + " - " + list));


    }

    public static void main(String[] args) {
        GrupingByExample gbe = new GrupingByExample();
        List<Person> persons = List.of(
                new Person(1L, "Alexis", new BigDecimal("300")),
                new Person(2L, "Juan", new BigDecimal("400")),
                new Person(3L, "Maria", new BigDecimal("300")),
                new Person(4L, "Ana", new BigDecimal("500"))

        );
        gbe.groupingBySalary(persons);

    }


    //modelo
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Person {
        private Long idPerson;
        private String name;
        private BigDecimal salary;
    }
}

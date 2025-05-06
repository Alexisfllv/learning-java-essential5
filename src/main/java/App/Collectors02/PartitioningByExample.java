package App.Collectors02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {


    // divide una colección en dos grupos basados en una condición booleana
    public void partitioningBySalary(List<Person> persons) {
        Map<Boolean, List<Person>> partitioned = persons.stream()
                .collect(Collectors.partitioningBy
                        (person -> person.getSalary().compareTo(new BigDecimal("400")) >= 0));

        partitioned.forEach((condicio, list) -> System.out.println("condicion >= 400: " + condicio + " - " + list + ";"));
    }


    public static void main(String[] args) {

        PartitioningByExample pbe = new PartitioningByExample();
        List<Person> personList = List.of(
                new Person(1L, "Alexis", new BigDecimal("300")),
                new Person(2L, "Juan", new BigDecimal("400")),
                new Person(3L, "Maria", new BigDecimal("300")),
                new Person(4L, "Ana", new BigDecimal("500"))
        );

        pbe.partitioningBySalary(personList);


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

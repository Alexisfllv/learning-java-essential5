package App.Collectors02;

import App.Person;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExampleExample {


    //

    public void mappingExample(List<Person> persons) {
        Map<String,List<BigDecimal>>  salariosAgrupados = persons.stream()
                .collect(Collectors.groupingBy(
                        person -> person.getName(),
                        Collectors.mapping(person -> person.getSalary(), Collectors.toList())
                ));


        salariosAgrupados.forEach((nombre, salarios) -> {
            System.out.println("Nombre: " + nombre);
            salarios.forEach(System.out::println);
        });

    }


    public static void main(String[] args) {

        MappingExampleExample mee = new MappingExampleExample();

        List<Person> persons = List.of(
                new Person(1L,"Alexis", new BigDecimal("300")),
                new Person(2L,"Juan", new BigDecimal("400")),
                new Person(3L,"Maria", new BigDecimal("300")),
                new Person(4L,"Ana", new BigDecimal("500")),
                new Person(5L,"Alexis", new BigDecimal("600"))
        );

        mee.mappingExample(persons);


    }

}

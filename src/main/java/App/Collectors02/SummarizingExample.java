package App.Collectors02;

import App.Person;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingExample {


    //
    public void summarizingExample(List<Person> persons) {
        DoubleSummaryStatistics salarioPromedio = persons.stream()
                .collect(Collectors.summarizingDouble(person -> person.getSalary().doubleValue()));
        System.out.println("Suma : " + salarioPromedio.getSum());
        System.out.println("Promedio : " + salarioPromedio.getAverage());
        System.out.println("Maximo : " + salarioPromedio.getMax());
        System.out.println("Minimo : " + salarioPromedio.getMin());
        System.out.println("Cantidad de elementos : " + salarioPromedio.getCount());
    }

    public static void main(String[] args) {
        SummarizingExample smex = new SummarizingExample();

        List<Person> persons = List.of(
                new Person(1L,"Alexis", new BigDecimal("300")),
                new Person(2L,"Juan", new BigDecimal("400")),
                new Person(3L,"Maria", new BigDecimal("300")),
                new Person(4L,"Ana", new BigDecimal("500")),
                new Person(5L,"Alexis", new BigDecimal("600"))
        );

        smex.summarizingExample(persons);
    }
}

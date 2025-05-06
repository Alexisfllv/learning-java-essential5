package App.AdvancedStreams05.Reducing;

import App.AdvancedStreams05.Employee;

import java.util.Arrays;
import java.util.List;

public class ReducirEmpleado {


    // 1. Sumar todos los salarios con Collectors.reducing();
   public void sumarSalarios(List<Employee> employees) {
       double suma = employees.stream()
               .mapToDouble(Employee::getSalary)
               .sum();
       System.out.println("Suma de salarios: " + suma);
   }



    public static void main(String[] args) {

        ReducirEmpleado re = new ReducirEmpleado();

        List<Employee> employees = Arrays.asList(
                new Employee(1,"ana",24,3220),
                new Employee(2,"Carlos", 28, 2500),
                new Employee(3,"Juan", 40, 4500),
                new Employee(4,"Marta", 32, 3800)
        );

        // 1.
        re.sumarSalarios(employees);



    }
}

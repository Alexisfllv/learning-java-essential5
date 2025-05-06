package App.AdvancedStreams05.Asinc;

import App.AdvancedStreams05.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class OperationAsinc {

    // simular la obtencion de empleados db de forma asincrona
    public CompletableFuture<List<Employee>> getEmployees() {
       return CompletableFuture.supplyAsync(() -> {
           // Simulamos una consulta a la bd
           try{ Thread.sleep(1000);} catch (InterruptedException e)
           {e.printStackTrace();}
           return  List.of(
                   new Employee(1,"ana",24,3220),
                   new Employee(2,"Carlos", 28, 2500),
                   new Employee(3,"Juan", 40, 4500),
                   new Employee(4,"Marta", 32, 3800)
           );
           });
    }

    // Simular calcular la suma de los salarios de los empleados de forma asincrona
    public CompletableFuture<Double> obtenerSalarioTotal (List<Employee> employees) {
        return CompletableFuture.supplyAsync( () ->{
            // simular el procesamiento de los empleados
            try{ Thread.sleep(500);} catch (InterruptedException e)
            {e.printStackTrace();}
            return employees.stream()
                    .mapToDouble(Employee::getSalary)
                    .sum();
        });
    }

    // metodo que orquesta las tareas asincronas
    public CompletableFuture<Void> procesarDatosAsybc (){
        return getEmployees()
                .thenCompose(this::obtenerSalarioTotal)
                .thenAccept(total -> System.out.println("Total de salarios: " + total));
    }



    public static void main(String[] args)throws ExecutionException, InterruptedException {


        // activar los hilos virtuales
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "1000");

        // crear una instancia del servicio y ejecuta las tareas asincrona
        OperationAsinc oa = new OperationAsinc();
        oa.procesarDatosAsybc().join();

    }
}

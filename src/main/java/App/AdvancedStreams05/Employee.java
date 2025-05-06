package App.AdvancedStreams05;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer idEmployee;
    private String name;
    private int age;
    private double salary;
}

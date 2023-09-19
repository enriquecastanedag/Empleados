import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static List<Employee>employees=new ArrayList<>();

    public static void main(String[] args) {
        employees.add(new Employee("Johnny",10));
        employees.add(new Employee("Alberto",9));
        employees.add(new Employee("Mario",56));
        employees.add(new Employee("Fernando",3));
        employees.add(new Employee("Alicia",10));
        employees.add(new Employee("Efrain",2));
        employees.add(new Employee("Gustavo",16));
        employees.add(new Employee("Jorge",7));
        employees.add(new Employee("Cleo",5));

        List<String> names=employees.stream()
                .filter(employee -> employee.getName().startsWith("A"))
                .filter(e-> e.getSalary()>=10)
                .map(employee -> employee.getName().toUpperCase())
                .toList();

        names.forEach(System.out::print);




    }
}

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
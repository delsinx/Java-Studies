package entities;

public class Employee
{
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
        public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
public void aumentarSalario(double percentage) {
        salary += salary * percentage / 100.0;
    }


}

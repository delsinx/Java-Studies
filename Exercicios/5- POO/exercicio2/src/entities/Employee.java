package entities;

public class Employee {

    public String name;
    public double salary;
    public double tax;

    public double NetSalary(){
        return salary - tax;
    };


    public void IncreaseSalary(double percentage){
        percentage = (percentage/100) * salary;
        salary += percentage;
         return;
    };
}

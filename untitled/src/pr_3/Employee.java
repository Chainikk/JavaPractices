package pr_3;

public class Employee {
    private String name;
    private Double salary;
    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }
    public Double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

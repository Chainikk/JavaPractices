package pr_17;

class Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


class EmployeeView {
    public void printEmployeeDetails(String name, double salary) {
        System.out.println("Employee: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public void setHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем объекты
        Employee model = new Employee("Lionel Messi", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Обновляем представление
        controller.updateView();

        // Изменяем модель и обновляем представление
        controller.setHourlyRate(25.0);
        controller.updateView();
    }
}

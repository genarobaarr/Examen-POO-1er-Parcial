package Employee;

class CalculateNetSalary extends Employee {

    CalculateNetSalary(String name, double salary) {
        super(name, salary);
    }

    public double calculateNetSalary() {

        return (getSalary() * 0.80);

    }
}

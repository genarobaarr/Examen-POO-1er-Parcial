package Employee;

public class PrintEmployeeDetails extends CalculateNetSalary {

    PrintEmployeeDetails(String name, double salary) {
        super(name, salary);
    }

    public void printEmployeeDetails() {

        System.out.println("Nombre de Empleado: " + getName());

        System.out.println("Salario neto: " + calculateNetSalary() + " pesos");

    }
}

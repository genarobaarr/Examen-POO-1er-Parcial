package Employee;


public class Main {

    public static void main(String[] args) {
        System.out.println("");

        PrintEmployeeDetails employee1 = new PrintEmployeeDetails("Genaro", 65134);
        employee1.printEmployeeDetails();

        System.out.println("");

        PrintEmployeeDetails employee2 = new PrintEmployeeDetails("Baarr", 45239);
        employee2.printEmployeeDetails();

    }

}

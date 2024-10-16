package Classroom;

public class Main {
    public static void main(String[] args) {
        System.out.println("");

        Classroom students = new Classroom();

        students.addStudentId("S13014083");

        students.addStudentId("S13014080");

        students.addStudentId("S12014012");

        students.addStudentId("S19078086");

        students.addStudentId("S13014063");

        students.addStudentId("S15015003");

        students.addStudentId("S19078086");

        System.out.println("");
        System.out.println("");

        students.displayStudentIds();
    }
}

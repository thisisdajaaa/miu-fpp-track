package lesson5.prog2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] deptEmployees = new DeptEmployee[]{
                new Professor("D", 12, LocalDate.now(), 12),
                new Professor("A", 13, LocalDate.now(), 13),
                new Professor("S", 14, LocalDate.now(), 14),
                new Secretary("T", 13, LocalDate.now(), 11),
                new Secretary("Y", 15, LocalDate.now(), 12),
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you wanna check the total salary of all department employees?");
            System.out.println("Type Y to check");
            System.out.println("Type N to stop");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "Y":
                    int totalSalary = 0;

                    for (DeptEmployee deptEmployee : deptEmployees) {
                        totalSalary += deptEmployee.computeSalary();
                    }

                    System.out.println("Total Salary is: " + totalSalary);
                    break;
                case "N":
                    System.out.println("Roger that");
                    scanner.close();
                    return;
                default:
                    System.out.println("That is an incorrect command");
                    break;
            }
        }
    }
}

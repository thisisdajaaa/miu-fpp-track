package lesson5.prog2;

import java.time.LocalDate;

public abstract class DeptEmployee {
    protected String name;
    protected Integer salary;
    protected LocalDate hireDate;

    public DeptEmployee(String name, Integer salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    protected Integer computeSalary() {
        return salary;
    }
}

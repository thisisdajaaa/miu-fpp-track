package lesson5.prog2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private Integer overtimeHours;

    public Secretary(String name, Integer salary, LocalDate hireDate, Integer overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public Integer getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(Integer overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    protected Integer computeSalary() {
        return salary * (12 * overtimeHours);
    }
}

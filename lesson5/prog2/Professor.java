package lesson5.prog2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
    private Integer numberOfPublications;


    public Professor(String name, Integer salary, LocalDate hireDate, Integer numberOfPublications) {
        super(name, salary, hireDate);
        this.numberOfPublications = numberOfPublications;
    }

    public Integer getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(Integer numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}

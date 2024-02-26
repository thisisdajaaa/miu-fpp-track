package lesson3.prog2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private final Integer RESTING_HEART_RATE = 70;
    private final Double LOWER_BOUNDARY = 0.5;
    private final Double UPPER_BOUNDARY = 0.85;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    private int getMaximumHeartRate() {
        System.out.println(calculateAge());
        return 220 - calculateAge();
    }

    private double[] getTargetHeartRate() {
        int averageHeartRate = getMaximumHeartRate() - RESTING_HEART_RATE;
        double lowerBoundary = ((double) averageHeartRate * LOWER_BOUNDARY) + (double) RESTING_HEART_RATE;
        double upperBoundary = ((double) averageHeartRate * UPPER_BOUNDARY) + (double) RESTING_HEART_RATE;


        return new double[]{lowerBoundary, upperBoundary};
    }

    @Override
    public String toString() {
        return "HeartRates{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + calculateAge() +
                ", maximumHeartRate=" + getMaximumHeartRate() +
                ", targetHeartRate=" + Arrays.toString(getTargetHeartRate()) +
                '}';
    }
}

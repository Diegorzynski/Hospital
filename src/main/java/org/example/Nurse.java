package org.example;

import java.io.Serializable;
import java.math.BigDecimal;

public class Nurse extends Person implements Serializable {

    private double overtime;

    private Nurse() {
    }

    public Nurse(String name, String lastName, double salary, double overtime) {
        super(name, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Nurse{" +
                "overtime=" + overtime +
                '}';
    }
}

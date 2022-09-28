package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeesTest {

    private static Logger log = LogManager.getLogger(EmployeesTest.class);

    @Test
    public void employeesInfo(){
        Hospital hospital = new Hospital();
        Doctor doctor = new Doctor("Steve","Kowalski",6.500,300);
        Nurse nurse = new Nurse("Fred", "Boyton",3.650, 3.5);
        hospital.add(doctor);
        hospital.add(nurse);

        log.trace("Hospital employees {}", hospital.getInfo());

    }
}
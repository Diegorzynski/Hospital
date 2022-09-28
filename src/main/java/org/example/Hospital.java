package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Person> employees = new ArrayList<>();

    public boolean add(Person employee){
        if(employee == null){
            return false;
        }
        employees.add(employee);
        return true;
    }

    public String getInfo(){
        StringBuffer allEmployees = new StringBuffer();
       for (Person employee : employees){
           allEmployees.append(employee.toString());
       }
       return allEmployees.toString();
    }
}

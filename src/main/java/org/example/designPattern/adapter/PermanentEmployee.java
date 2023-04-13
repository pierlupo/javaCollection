package org.example.designPattern.adapter;

public class PermanentEmployee implements Employee{



    private String name;

    private double salary;

    private String position;


    public PermanentEmployee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getPosition() {
        return this.position;
    }
}

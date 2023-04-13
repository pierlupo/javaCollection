package org.example.designPattern.adapter;

public class DemoAdapter {
    public static void main() {


        Employee permanentEmployee = new PermanentEmployee("John", 5000, "Manager");
        Employee temporaryEmployee = new TemporaryEmployeeAdapter(new TemporaryEmployee("Jane", 6000, "CEO"));

        System.out.println(permanentEmployee.getName()+" "+permanentEmployee.getSalary()+" "+permanentEmployee.getPosition());
        System.out.println(temporaryEmployee.getName()+" "+temporaryEmployee.getSalary()+" "+temporaryEmployee.getPosition());

    }
}

package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {

    public static void main(String[] args) {
        Employee employee = new Employee(true, "Aaditya", new Date(), 1, false);
        Employee employee1 = new Employee(false, "Aman", new Date(), 2, true);
        Employee employee2 = new Employee(true, "Jitendra", new Date(), 3, true);
        Employee employee3 = new Employee(true, "Sumit", new Date(), 4, false);
        Employee employee4 = new Employee(false, "Pawan", new Date(), 5, true);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        EmployeeImpl employeeImpl = new EmployeeImpl();
        // print All Managers
        System.out.println(employeeImpl.getManagers(employeeList));

        // print All Part time employee
        System.out.println(employeeImpl.isPartTimeEmployee(employeeList));

    }

    public List<Employee> getManagers(List<Employee> employeeList){
       return employeeList.stream().filter(emp -> emp.isManager()).collect(Collectors.toList());
    }
    public List<Employee> isPartTimeEmployee(List<Employee> employeeList){
        return employeeList.stream().filter(emp -> emp.isPartTime()).collect(Collectors.toList());
    }


}

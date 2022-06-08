package com.company;

import java.util.Date;

public class Employee {
    boolean managerFlag;
    String name;
    Date dateHired;
    int id;
    boolean partTimeFlag;

    public Employee(boolean managerFlag, String name, Date dateHired, int id, boolean partTimeFlag) {
        this.managerFlag = managerFlag;
        this.name = name;
        this.dateHired = dateHired;
        this.id = id;
        this.partTimeFlag = partTimeFlag;
    }

    public boolean isManager() {
        return managerFlag;
    }

    public String getName() {
        return name;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public int getID() {
        return id;
    }

    public boolean isPartTime() {
        return partTimeFlag;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "managerFlag=" + managerFlag +
                ", name='" + name + '\'' +
                ", dateHired=" + dateHired +
                ", id=" + id +
                ", partTimeFlag=" + partTimeFlag +
                '}';
    }
}

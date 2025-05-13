package com.github.badjavii.vm01_LibraryManager.p06_Users;
import abstractclasses.User;

public class Professor extends User{
    private String department, specialty;

    public Professor(int id, String name, String mail, boolean active, String department, String specialty) {
        super(id, name, mail, active);
        this.department = department;
        this.specialty = specialty;
    }

    // Implementation of abstract methods of Materials.User class
    public int calculateLoanLimit(){
        return 0;
    }

    // Implementation of abstract methods of Materials.User class
    public boolean canReserve(){
        return false;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpecialty() {
        return specialty;
    }
}
package com.github.badjavii.vm01_LibraryManager.p06_Users;
import abstractclasses.User;

public class Administrative extends User{
    private String area, position;

    public Administrative(int id, String name, String mail, boolean active, String area, String position) {
        super(id, name, mail, active);
        this.area = area;
        this.position = position;
    }

    // Implementation of abstract methods of Materials.User class
    public int calculateLoanLimit(){
        return 0;
    }

    // Implementation of abstract methods of Materials.User class
    public boolean canReserve(){
        return false;
    }

    public String getArea() {
        return area;
    }

    public String getPosition() {
        return position;
    }
}
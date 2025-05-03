package users;
import abstractclasses.User;

public class Student extends User {
    private String degree;
    private int semester;

    public Student(int id, String name, String mail, boolean active, String degree, int semester) {
        super(id, name, mail, active);
        this.degree = degree;
        this.semester = semester;
    }

    // Implementation of abstract methods of Materials.User class
    public int calculateLoanLimit(){
        return 0;
    }

    // Implementation of abstract methods of Materials.User class
    public boolean canReserve(){
        return false;
    }

    public String getDegree() {
        return degree;
    }

    public int getSemester() {
        return semester;
    }
}
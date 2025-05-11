package com.github.badjavii.vm01_LibraryManager.p05_Menus;
import abstractclasses.User;
import extras.ConsoleUtils;
import java.util.List;
import users.Professor;
import users.Administrative;
import users.Student;

public class SubMenuUsers extends Library {

    public SubMenuUsers() {
        super();
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "SubMenuUsers initialized.");
    }

    private void addUser(List<User> users){
        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\n\nEnter user type (1. Professor, 2. Student, 3. Administrative):");
        int i = ConsoleUtils.scanv(0, "int");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user name: ");
        String name = ConsoleUtils.scanv("", "string");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user id: ");
        int id = ConsoleUtils.scanv(0, "int");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user mail: ");
        String mail = ConsoleUtils.scanv("", "string");

        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter, is user active (true/false)?: ");
        boolean active = ConsoleUtils.scanv(false, "boolean");

        User newUser = null;

        switch (i){
            case 1:
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user department: ");
                String department = ConsoleUtils.scanv("", "string");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user specialty: ");
                String specialty = ConsoleUtils.scanv("", "string");

                newUser = new Professor(id, name, mail, active, department, specialty);
                break;
            case 2:
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user department: ");
                String degree = ConsoleUtils.scanv("", "string");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user specialty: ");
                int semester = ConsoleUtils.scanv(0, "int");

                newUser = new Student(id, name, mail, active, degree, semester);
                break;
            case 3:
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user department: ");
                String area = ConsoleUtils.scanv("", "string");

                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter user specialty: ");
                String position = ConsoleUtils.scanv("", "string");

                newUser = new Administrative(id, name, mail, active, area, position);
                break;
            default:
                ConsoleUtils.printlnf(ConsoleUtils.RED, "\nInvalid user type...\n");
                return;
        }
        users.add(newUser);
        ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nUser added successfully\n");
    }

    private void showUsers(List<User> users) {
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n=== Current Users ===\n");

        if (users.isEmpty()) {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "No users found.\n");
            return;
        }

        for (User user : users) {
            // Mostrar atributos comunes (de User)
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "\n- User ID: " + user.getId());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Name: " + user.getName());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Email: " + user.getMail());
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "  Active: " + (user.isActive() ? "Yes" : "No"));

            // Verificar tipo específico y mostrar sus atributos únicos
            if (user instanceof Professor) {
                Professor professor = (Professor) user; // Casting a Professor
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Type: Professor");
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Department: " + professor.getDepartment());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Specialty: " + professor.getSpecialty());
            } else if (user instanceof Student) {
                Student student = (Student) user; // Casting a Student
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Type: Student");
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Degree: " + student.getDegree());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Semester: " + student.getSemester());
            } else if (user instanceof Administrative) {
                Administrative administrative = (Administrative) user; // Casting a Administrative
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Type: Administrative");
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Area: " + administrative.getArea());
                ConsoleUtils.printlnf(ConsoleUtils.CYAN, "  Position: " + administrative.getPosition());
            } else {
                // Si el tipo no coincide con ninguno esperado
                ConsoleUtils.printlnf(ConsoleUtils.RED, "  Unknown user type.");
            }
        }
    }

    private void deleteUser(List<User> users) {
        ConsoleUtils.printlnf(ConsoleUtils.CYAN, "\nEnter the ID of the user to delete: ");
        int id = ConsoleUtils.scanv(0, "int");

        User target_user = null;
        for (User user : users){
            if (user.getId() == id){
                target_user = user;
                break;
            }
        }

        if (target_user != null){
            users.remove(target_user);
            ConsoleUtils.printlnf(ConsoleUtils.GREEN, "\nUser deleted successfull");
        } else {
            ConsoleUtils.printlnf(ConsoleUtils.RED, "\nUser not found");
        }
    }

    private void showMenu (){
        ConsoleUtils.clear_screen();
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n\n\t=== Users Management Menu ===");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n1. Add User");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n2. Show Users");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n3. Delete User");
        ConsoleUtils.printlnf(ConsoleUtils.BLUE, "\n0. EXIT");
    }

    public void mainMenu (List<User> users) {
        int i = -1;

        while (i != 0){
            showMenu();
            ConsoleUtils.printlnf(ConsoleUtils.YELLOW, "\n\nSelect Option: ");
            i = ConsoleUtils.scanv(0, "int");

            switch (i){
                case 1:
                    addUser(users);
                    break;
                case 2:
                    showUsers(users);
                    break;
                case 3:
                    deleteUser(users);
                    break;
                case 0:
                    ConsoleUtils.printlnf(ConsoleUtils.RED, "\nClosing program...");
                    break;
                default:
                    ConsoleUtils.printlnf(ConsoleUtils.RED, "\nInvalid Option");
            }
            ConsoleUtils.pause_terminal();
        }
    }
}
package com.samsung.model;

public class Student extends User {
    private String group;

    public String getGroup() {
        return group;
    }
    public Student(String name, String surname,String patronymic, String phone, String group) {
        super(name,surname, patronymic, phone);
        this.group=group;
    }

    @Override
    public void sayHello() {
        System.out.println("Привет! Я студент, моё имя "+ getName() + " " + getSurname() + ".");
    }

    public Student(String name, String surname, String patronymic, String group) {
        super(name,surname,patronymic);
        this.group=group;
    }

    public Student(Student student) {
        super(student.getName(), student.getSurname(), student.getPatronymic(), student.getPhone());
        this.group=student.getGroup();
    }

    public void printInfoToConsoleSuperКрасиВо() {
        System.out.printf("^=^=^=^ STUDENT ^=^=^=^=^\n");
        System.out.printf("Name: "+ getName() + "\n");
        System.out.printf("Surname: " + getSurname() + "\n");
        System.out.printf("Patronymic: " + getPatronymic() + "\n");
        System.out.printf("Phone: "+ getPhone() + "\n");
        System.out.printf("Group: " + getGroup() + "\n");
        System.out.printf("^=^=^=^=^=^=^=^=^=^=^=^=^=^\n");
    }
}

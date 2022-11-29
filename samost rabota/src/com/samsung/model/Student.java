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
        System.out.println("Привет! Я студент, моё имя "+ getName() + " " + getSurname());
    }

    public Student(String name, String surname, String patronymic, String group) {
        super(name,surname,patronymic);
        this.group=group;
    }

    public Student(Student student) {
        super(student.getName(), student.getSurname(), student.getSurname(), student.getPhone());
        this.group=student.getGroup();
    }

    public void printInfoToConsoleSuperКрасиВо() {
        StringBuilder sb= new StringBuilder()
        .append("^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^\n");
                sb.append(this.getClass() + "\n")
        .append("Name: ").append(getName())
                        .append("Surname: ").append(getSurname() + "\n")
                        .append("Patronymic: ").append(getPatronymic() + "\n")
                        .append("Phone: ").append(getPhone() + "\n")
                        .append("Group: ").append(getGroup() + "\n")
                        .append("^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^\n");
    }
}

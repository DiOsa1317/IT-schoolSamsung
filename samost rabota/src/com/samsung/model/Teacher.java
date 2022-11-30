package com.samsung.model;

public class Teacher extends User{
 private String []subject = new String[20];

    public Teacher(String name, String surname, String patronymic, String phone, String[] subject) {
        super(name, surname, patronymic, phone);
        this.subject=subject;
    }

    public Teacher(String name, String surname, String patronymic, String[] subject) {
        super(name, surname, patronymic);
        this.subject=subject;
    }

    public Teacher(Teacher teacher) {
        super(teacher.getName(), teacher.getSurname(),
                teacher.getSurname(), teacher.getPhone());
        this.subject=teacher.getSubject();
    }

    public String[] getSubject() {
        return subject;
    }

    public void sayHello() {
        System.out.println("Привет! Я преподаватель, моё имя "
                + getName() + " " + getSurname() + " " + getPatronymic());
    }

    public void printInfoToConsoleSuperКрасиВо() {
        System.out.printf("0-0?=-_-=0-0?=-_-=0-0? "+ getClass() + " 0-0?=-_-=0-0?=-_-=0-0?\n");
        System.out.printf("Full name: "+ getName() + " " + getPatronymic() + " " + getSurname() + "\n");
        System.out.printf("Subject: " + getSubject() + "\n");
        System.out.printf("Phone: "+ getPhone() + "\n");
        System.out.printf("^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^=^\n");
    }

}

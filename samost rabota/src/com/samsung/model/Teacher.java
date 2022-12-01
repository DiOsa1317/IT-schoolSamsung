package com.samsung.model;

public class Teacher extends User {
    private String[] subject = new String[20];

    public Teacher(String name, String surname, String patronymic, String phone, String[] subject) {
        super(name, surname, patronymic, phone);
        this.subject = subject;
    }

    public Teacher(String name, String surname, String patronymic, String[] subject) {
        super(name, surname, patronymic);
        this.subject = subject;
    }

    public Teacher(Teacher teacher) {
        super(teacher.getName(), teacher.getSurname(),
                teacher.getPatronymic(), teacher.getPhone());
        this.subject = teacher.getSubject();
    }

    public String[] getSubject() {
        return subject;
        }

    public void sayHello() {
        System.out.println("Привет! Я преподаватель, моё имя "
                + getName() + " " + getPatronymic() + " " + getSurname() + ".");
    }

    public void printInfoToConsoleSuperКрасиВо() {
        System.out.printf("0-0?=-_-=0-0?=-_-=0-0? ПРЕПОДАВАТЕЛЬ 0-0?=-_-=0-0?=-_-=0-0?\n");
        System.out.printf("Full name: " + getName() + " " + getPatronymic() + " " + getSurname() + "\n");
        System.out.printf("Subjects:\n");
        for(int i=0; i<subject.length; i++) {
            System.out.printf(subject[i] + "\n");
        }
        System.out.printf("Phone: " + getPhone() + "\n");
        System.out.printf("0-0?=-_-=0-0?=-_-=0-0?0-0?=-_-=0-0?=-_-=0-0?0-0?=-_-=0-0?=-_-=0-0?\n");
    }
}

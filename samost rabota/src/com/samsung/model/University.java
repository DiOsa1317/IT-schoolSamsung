package com.samsung.model;

public class University implements Printer {
    String adress;
    Student[] listOfStudents;
    Teacher[] listOfTeachers;

    public Student[] getListOfStudents() {
        return listOfStudents;
    }

    public Teacher[] getListOfTeachers() {
        return listOfTeachers;
    }

    public String getAdress() {
        return adress;
    }

     public University(String adress, Student[] listOfStudents, Teacher[] listOfTeachers) {
        this.adress=adress;
        this.listOfStudents = listOfStudents;
        this.listOfTeachers = listOfTeachers;
    }


    @Override
    public void printInfoToConsoleSuperКрасиВо() {
        System.out.printf("**************** OUR UNIVERSITY ******************\n");
        System.out.printf("Adress: " + getAdress() + "\n");
        System.out.printf("OUR STUDENTS:\n");
        for(int i=0; i<listOfStudents.length; i++)
            listOfStudents[i].printInfoToConsoleSuperКрасиВо();
        System.out.printf("OUR TEACHERS:\n");
        for(int i=0; i<listOfTeachers.length; i++)
            listOfTeachers[i].printInfoToConsoleSuperКрасиВо();
        System.out.printf("***************************************************\n");
    }
}

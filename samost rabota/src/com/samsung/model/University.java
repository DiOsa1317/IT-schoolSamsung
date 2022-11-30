package com.samsung.model;

public class University implements Printer {
    String adress;
    Student[] listOfStudents;
    Teacher[] listOfTeachers;

    public String[] getListOfStudents() {
        return listOfStudents;
    }

    public String[] getListOfTeachers() {
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
        System.out.printf("**************** this.getClass() ******************\n");
        System.out.printf("Adress: " + getAdress() + "\n");
        System.out.printf("Our students:\n");
        //for(int i=0; i<s)
        System.out.printf("Our teachers: " + getListOfTeachers());
        System.out.printf("***************************************************\n");
    }
}

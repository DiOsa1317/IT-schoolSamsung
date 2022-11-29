package com.samsung.model;

public class University implements Printer {
    String adress;
    String[] listOfStudents;
    String[] listOfTeachers;

    public String[] getListOfStudents() {
        return listOfStudents;
    }

    public String[] getListOfTeachers() {
        return listOfTeachers;
    }

    public String getAdress() {
        return adress;
    }

     public University(String adress, String[] listOfStudents, String[] listOfTeachers) {
        this.adress=adress;
        this.listOfStudents = listOfStudents;
        this.listOfTeachers = listOfTeachers;
    }


    @Override
    public void printInfoToConsoleSuperКрасиВо() {
            StringBuilder sb= new StringBuilder();
                    sb.append("**************** this.getClass() ******************\n")
            .append("Adress: ").append(getAdress() + "\n")
                    .append("Our students: ").append(getListOfStudents())
                    .append("Our teachers: ").append(getListOfTeachers())
                    .append("***************************************************\n");
    }
}

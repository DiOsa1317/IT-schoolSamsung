package com.samsung.model;

public class DemoService {
    University university;
    public DemoService() {

    }
    public void demo() {
        this.university = new University("Moscow", listOfStudents, university.listOfTeachers);
            Student theBest = new Student("Григорий",
                    "Ежов",
                    "Александрович",
                    "+79823485321",
                    "39");

            Student problem = new Student("Антон",
                    "Рыжий",
                    "Витальевич",
                    "35");

            Student spy = new Student(problem);

        Teacher decan = new Teacher(
                "Аркадий",
                "Паровозов",
                "Аркадьевич",
                "+79829821711",
                new String[]{"Математический анализ", "Стереометрия"}
        );

        Teacher kind = new Teacher(
                "Марья",
                "Пышкова",
                "Валерьевна",
                new String[]{"История", "Английский"}
        );
        Student[] listOfStudents={theBest, problem, spy};
        Teacher[] listOfTeachers={decan, kind};
        university.printInfoToConsoleSuperКрасиВо();
        theBest.sayHello();
        decan.sayHello();

    }
}

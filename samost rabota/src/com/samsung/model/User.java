package com.samsung.model;

public abstract class User implements Printer {
    private String name;
    private String surname;
    private String patronymic;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        if(phone == null) return "Нет информации";
        else return phone;
    }

    public abstract void sayHello();

    public User(String name, String surname,String patronymic, String phone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
    }

    public User(String name, String surname,String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public User(User user) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.patronymic = user.getPatronymic();
        this.phone = user.getPhone();
    }
}

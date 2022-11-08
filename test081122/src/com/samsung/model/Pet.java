package com.samsung.model;

public class Pet {
    private String name;
    private String owner;
    private String type;

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public Pet(String name, String owner, String type) {
        this.name=name;
        this.owner=owner;
        this.type=type;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Owner: " + owner);
        System.out.println("Type of pet: " + type);
    }
}

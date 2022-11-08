package com.samsung;

import com.samsung.model.Pet;

public class App {
    public static void main(String[] args) {
        Pet pet1= new Pet("Eddi", "Jack", "dog");
        Pet pet2= new Pet("Nemo", "Dora", "fish");
        Pet pet3 = new Pet("Pascal", "Peter", "hamster");
        pet1.printInfo();
        pet2.printInfo();
        pet3.printInfo();
    }
}

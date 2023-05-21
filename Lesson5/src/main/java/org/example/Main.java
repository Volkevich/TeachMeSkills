package org.example;

import org.example.zoo.Breed;
import org.example.zoo.Cat;
import org.example.zoo.Dog;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        String barsikString = barsik.toString();
        System.out.println(barsikString);
        Dog rex = new Dog();
        rex.setBreed(Breed.PITBULL);
        rex.setName("Рекс");
        rex.setAge(10);
        rex.sit();
        rex.lie();
        rex.voice();
        rex.jump();
        System.out.println(rex.toString());
    }
}
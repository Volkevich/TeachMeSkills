package org.example.zoo;

public class Cat implements Command {


    private final String name;
    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

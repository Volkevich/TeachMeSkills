package org.example.zoo;

public class Cat extends Animals implements Command {


    private final String name;
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(getName() + " делает: ");
        Command.super.jump();
    }

    @Override
    public void voice() {
        System.out.println("Мяу-Мяу");
    }
    public String getName() {
        return name;
    }
}

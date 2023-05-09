package org.example.zoo;

public class Dog extends Animals implements Command {

    @Override
    public void jump() {
        System.out.println(getName() + " делает");
        Command.super.jump();

    }

    @Override
    public void sit() {
        System.out.print(getName() + " выполняет команду ");
        Command.super.sit();
    }

    public Dog(){
    }

    @Override
    public void voice() {
        System.out.println(getName() + " произносит: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(" Гав-Гав \n");
        }
    }

}

package org.example.zoo;

public interface Command {
    default void jump() {
        System.out.println("прыжок");
    }

    default void sit() {
        System.out.println("сидеть");
    }
    default void lie(){
        System.out.println("лежать");
    }


}

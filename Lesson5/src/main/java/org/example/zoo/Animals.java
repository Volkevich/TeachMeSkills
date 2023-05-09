package org.example.zoo;

import java.util.Objects;

public abstract class Animals {

    public Animals() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals animals)) return false;
        return getAge() == animals.getAge() && Objects.equals(getName(), animals.getName()) && Objects.equals(getBreed(), animals.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getBreed());
    }

    private String name;

    private int age;
    private Enum breed;
    private String ageOut;

    public Enum getBreed() {
        return breed;
    }

    public void setBreed(Enum breed) {
        this.breed = breed;
    }
    public abstract void voice();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {

        return age;
    }
    public void setAge(int age) {
        if (age <= 4 & age > 0 & age !=1){
            ageOut ="года";
        }else{
            ageOut = "лет";
        }
        if (age == 1){
            ageOut = "год";
        }
        this.age = age;
    }
    @Override
    public String toString() {


        return "Животные\n " +
                "Имя: " + name +
                ", возраст: " + age + " " +
                ageOut + ", порода: " + breed;
    }
}

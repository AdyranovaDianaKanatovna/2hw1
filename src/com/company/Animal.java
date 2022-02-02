package com.company;

import java.util.Random;

public class Animal {
    private int age;
    private Character character;

    public Animal(int age, Character character) {
        this.age = age;
        this.character = character;
    }

    public int getAge() {
        return age;
    }

    public Character getCharacter() {
        return character;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(14)+1;
    }
    public String getInfo(){
        return "Age:" + age +
                "\ncharacter:" + character;
    }
}

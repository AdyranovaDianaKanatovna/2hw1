package com.company;

public final class Cat extends Tiger {
    private String breed;

    public Cat(int age, Character character, String name, String gender, String[] commands, String breed) {
        super(age, character, name, gender, commands);
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    }




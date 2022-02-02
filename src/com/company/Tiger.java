package com.company;

import java.util.Arrays;

public class Tiger extends Animal {
private String name;
private String gender;
private String[] commands;

    public Tiger(int age, Character character, String name, String gender, String[] commands) {
        super(age, character);
        this.name = name;
        this.gender = gender;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }


    public void makeCommand(){
        System.out.println("Sit still");
    }
    public void makeCommand(String command){
        System.out.println(command);

    }
    public void makeCommand(String[] command){
        System.out.println(command);
        }

    @Override
    public String getInfo() {
            return super.getInfo() +
                    "\nName:" + name+
                    "\nGender:" + gender+
                    "\nCommand" + Arrays.toString(commands);

    }
}

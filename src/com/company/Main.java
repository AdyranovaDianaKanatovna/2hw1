package com.company;

public class Main {

    public static void main(String[] args) {
	Tiger tora = new Tiger(5,Character.WILD,"Tora","male",new String[]{"open mouth", "make voice"});
        System.out.println(tora.getInfo());
        tora.makeCommand();

        Cat pochi = new Cat(3,Character.CUTE,"Pochi","male",
                new String[]{"Listen me"},"Bobtail");
        System.out.println(pochi.getInfo());
        pochi.makeCommand("play with me");

        Cat tama = new Cat(3,Character.UNFRIENDLY,"Tama","male",
                new String[]{"Come to me "},"Scottish fold");
        System.out.println(tama.getInfo());
        tama.makeCommand("let me to pet you ");

    }

}


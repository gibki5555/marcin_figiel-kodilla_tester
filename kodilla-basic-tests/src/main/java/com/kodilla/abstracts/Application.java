package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        //      Animal a = new Animal(12);
        Dog d = new Dog();
        Duck du = new Duck();
        d.giveVoice();
        du.giveVoice();

        Animal reksio = new Dog();
        System.out.println(reksio.getNumberOfLegs());

        new AnimalProcessor().process(reksio);
        new AnimalProcessor().process(new Duck());
    }
}

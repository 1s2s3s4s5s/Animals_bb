package org.top_1.animals_bb;

public class Cat extends AbstractPet implements ISoundable {

    @Override
    public void breathe() {
        System.out.println("я мяукаю");
    }

    @Override
    public void sound() {
    }
}

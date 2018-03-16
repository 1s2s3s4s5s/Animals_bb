package org.top_1.animals_bb;

public class Leopard extends AbstractWild implements ISoundable {

    public void breathe() {
        System.out.println("Я дышу");
    }

    public void sound() {
        System.out.println("rrrrrr");
    }
}

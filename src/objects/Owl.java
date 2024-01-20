package objects;

import interfases.Admire;
import interfases.FlyDown;

public class Owl extends Obj implements FlyDown, Admire {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Owl{" +
                "name='" + name + '\'' +
                '}';
    }

    public void admire() {
        System.out.println("Сова, залюбовалась своим почтовым ящиком");
    }
    public void flyDown() {
        System.out.println("Сова слетела вниз");
    }
}

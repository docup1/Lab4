package objects;

import interfases.BowDown;
import interfases.Push;

public class Fluff extends Obj implements  Push {
    public Fluff(String name) {
        super(name);
    }
    {System.out.println("На объект Пух не может быть возложена ответственность.");}
    @Override
    public String toString() {
        return "Fluff{" +
                "name='" + name + '\'' +
                '}';
    }
    public String sayName() {
        return this.name;
    }
    public void push() {
        System.out.println(this.name + " толкает кресло");
    }
    public void BowUp() {

        System.out.println("Пух вылезает из под кресла");
    }
}

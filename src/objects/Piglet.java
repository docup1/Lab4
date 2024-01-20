package objects;

import interfases.BowDown;
import interfases.Push;

public class Piglet extends Obj implements BowDown, Push {
    public Piglet(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Piglet{" +
                "name='" + name + '\'' +
                '}';
    }
    public void bowDown() {

        System.out.println("Пятачок склонился над ним");
    }
    public void push() {

        System.out.println(this.name + " толкает кресло");
    }
}

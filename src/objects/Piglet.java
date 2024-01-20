package objects;

import interfases.BowDown;

public class Piglet extends Obj implements BowDown {
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
}

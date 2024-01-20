package objects;

import java.util.Objects;

public abstract class Obj{

    public class Counter {
        public static int personCount = 0;
        public static int getPersonCount() {
            return personCount;
        }
    }


    {
        Obj.Counter.personCount++;
    }
    String name;
    public Obj(String name){

        this.name = name;
        validateName();
    }

    private void validateName() throws IllegalArgumentException {
        char[] nameInChars = name.toCharArray();
        for (char c : nameInChars) {
            if (Character.isDigit(c)) throw new IllegalArgumentException("Ошибка: в названии содержатся цифры!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(name, obj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                '}';
    }
}

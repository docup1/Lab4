package objects;


import java.util.Objects;
import enums.MaterialType;

public class Mailbox extends Obj  {

    {
        System.out.printf("Создан объект пренадлежащий сове - " +this.name+ "\n");
        Gap gap = new Gap("Щель");
        gap.SetText("Для писем и газет");
        gap.SetVisability(false);

    }

    public Mailbox(String name) {
        super(name);
    }

    String material = MaterialType.Plastic.getCode();
    public void setMaterial(){

        System.out.printf("материал объекта " + this.name + " - " + material + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mailbox mailbox = (Mailbox) o;
        return Objects.equals(material, mailbox.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material);
    }

    @Override
    public String toString() {
        return "Mailbox{" +
                "material='" + material + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

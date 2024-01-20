package objects;

import interfases.Admire;

import java.util.Objects;

public class Gap extends Obj {

    {System.out.printf("На объекте есть " + this.name + "\n");}
    public Gap(String name) {
        super(name);
    }

    String Text;
    boolean Visability;

    public void SetText(String text){
        this.Text = text;
        System.out.printf("На объекте "+ this.name + " есть надпись - " + "'" + this.Text + "'" + "\n");
    }

    public void SetVisability(boolean visability){
        this.Visability = visability;
        if(this.Visability) System.out.printf("надписи сейчас видно");
        else System.out.printf("но надписи сейчас невидно, потому что она находится снаружи\n");
    }

    @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gap gap = (Gap) o;
        return Visability == gap.Visability && Objects.equals(Text, gap.Text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Text, Visability);
    }

    @Override
    public String toString() {
        return "Gap{" +
                "Text='" + Text + '\'' +
                ", Visability=" + Visability +
                ", name='" + name + '\'' +
                '}';
    }
}

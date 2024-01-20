import objects.Mailbox;
import objects.Owl;
import objects.Piglet;

public class Main {
    public static void main(String[] args) {

        Mailbox box = new Mailbox("почтовыЙ ящик");
        box.setMaterial();
        Piglet piglet = new Piglet("Пяточек");
        piglet.bowDown();
        Owl owl = new Owl("Сова");
        owl.admire();
        owl.flyDown();

    }
}
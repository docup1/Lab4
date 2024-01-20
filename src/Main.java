import exeptions.StoryIsNotReadyException;
import objects.*;


public class Main {
    public static void main(String[] args) {

        try{
            Fluff fluff = new Fluff("Пух");

            Mailbox box = new Mailbox("почтовыЙ ящик");
            box.setMaterial();

            Piglet piglet = new Piglet("Пяточек");

            piglet.bowDown();

            Owl owl = new Owl("Сова");

            owl.admire();
            owl.flyDown();

            fluff.push();
            piglet.push();

            fluff.BowUp();

            if (Counter.getPersonCount() <= 0) throw new StoryIsNotReadyException("В история нет персонажей!");

        }
        catch (StoryIsNotReadyException exception){
            System.out.println(exception.getMessage());
        }
    }
}
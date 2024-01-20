package exeptions;

public class StoryIsNotReadyException extends Exception {
    public StoryIsNotReadyException(String message) {
        super(message);
    }
}
package image;

public class NotSupportedException extends RuntimeException{
    String string;

    public NotSupportedException(String message, String string) {
        super(message);
        this.string = string;
    }
}


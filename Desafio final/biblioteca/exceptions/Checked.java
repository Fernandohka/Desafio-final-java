package exceptions;

public class Checked extends RuntimeException{
    
    String title;

    public Checked(String title) {
        super(title);
        this.title = title;
    }
}

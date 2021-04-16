package homework04.handle_exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String s) {
        super(s);
    }
}

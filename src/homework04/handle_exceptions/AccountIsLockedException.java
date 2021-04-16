package homework04.handle_exceptions;

public class AccountIsLockedException extends Exception {
    public AccountIsLockedException(String s) {
        super(s);
    }
}

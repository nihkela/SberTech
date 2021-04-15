package homework04;

public class PinValidator {
    static final int pin = 1212;
    int count = 0;
    boolean pinCorrect = false;

    public void checkPin(int pin) throws Exception {
        if (this.pin == pin) {
            pinCorrect = true;
        }
        else {
            pinCorrect = false;
            count++;
            if (count >= 3) {
                // поменять
                throw new Exception();
            }
        }
    }
}

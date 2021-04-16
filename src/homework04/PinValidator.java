package homework04;

import homework04.handle_exceptions.AccountIsLockedException;

public class PinValidator {
    static final int pin = 1212;
    int count = 0;
    boolean pinCorrect = false;

    public void checkPin(int p) throws AccountIsLockedException {
        if (pin == p) {
            pinCorrect = true;
        }
        else {
            pinCorrect = false;
            count++;
            if (count >= 3) {
                throw new AccountIsLockedException("Превышено количество попыток, карта заблокирована на 10 секунд");
            }
        }
    }
}

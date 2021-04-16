package homework04;

import homework04.handle_exceptions.NotEnoughMoneyException;
import homework04.handle_exceptions.RemainderException;

public class TerminalServer {
    static int money = 0;

    public boolean checkMoney(int m) throws RemainderException {
        if (m % 100 == 0) {
            return true;
        }
        else {
            throw new RemainderException("Сумма должна быть кратна 100");
        }
    }

    public void getMoney(int m) throws NotEnoughMoneyException {
        if (m <= money) {
            money -= m;
        }
        else {
            throw new NotEnoughMoneyException("Недостаточно денег");
        }
    }

    public void putMoney(int m) {
        money += m;
    }
}

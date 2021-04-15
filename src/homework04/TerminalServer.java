package homework04;

public class TerminalServer {
    static int money = 0;

    public boolean checkMoney(int m) throws Exception {
        if (m % 100 == 0) {
            return true;
        }
        else {
            throw new Exception();
        }
    }

    public void getMoney(int m) throws Exception {
        if (m <= money) {
            money -= m;
        }
        else {
            throw new Exception();
        }
    }

    public void putMoney(int m) {
        money += m;
    }
}

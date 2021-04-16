package homework04;

import homework04.handle_exceptions.AccountIsLockedException;

public interface Terminal {
    public void checkBalance() throws InterruptedException;

    public void putMoney() throws InterruptedException, AccountIsLockedException;

    public void getMoney() throws InterruptedException;
}

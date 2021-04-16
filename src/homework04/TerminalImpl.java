package homework04;

import homework04.handle_exceptions.AccountIsLockedException;
import homework04.handle_exceptions.NotEnoughMoneyException;
import homework04.handle_exceptions.PinException;
import homework04.handle_exceptions.RemainderException;

import java.util.Scanner;

public class TerminalImpl implements Terminal {
    private final TerminalServer server = new TerminalServer();
    private final PinValidator pinValidator = new PinValidator();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void checkBalance() throws InterruptedException {
        try {
            pinValidator.checkPin(scanner.nextInt());
            if (pinValidator.pinCorrect) {
                System.out.println(TerminalServer.money);
            } else {
                throw new PinException("Неправильный пин-код");
            }

        } catch (PinException e) {
            System.out.println("Неправильный пин-код");
        } catch (AccountIsLockedException a) {
            System.out.println("Превышен лимит попыток");
            Thread.sleep(10000);
        }
    }

    @Override
    public void putMoney() throws InterruptedException {
        if (!(pinValidator.pinCorrect)) {
            checkBalance();
        }
        int sum = scanner.nextInt();
        try {
            if (server.checkMoney(sum)) {
                server.putMoney(sum);
                System.out.println(TerminalServer.money);
            }
        } catch (RemainderException e) {
            System.out.println("Сумма не кратна 100");
        }
    }

    @Override
    public void getMoney() throws InterruptedException {
        if (!(pinValidator.pinCorrect)) {
            checkBalance();
        }
        int sum = scanner.nextInt();
        try {
            if (server.checkMoney(sum)) {
                server.getMoney(sum);
                System.out.println(TerminalServer.money);
            }
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно денег");
        } catch (RemainderException r) {
            System.out.println("Сумма не кратна 100");
        }
    }
}

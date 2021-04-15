package homework04;

import java.util.Scanner;

public class TerminalImpl implements Terminal {
    private final TerminalServer server = new TerminalServer();
    private final PinValidator pinValidator = new PinValidator();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void checkBalance() {
        try {
            pinValidator.checkPin(scanner.nextInt());
            if (pinValidator.pinCorrect) {
                System.out.println(TerminalServer.money);
            } else {
                // wrong password
                throw new Exception();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void putMoney() {
        if (!(pinValidator.pinCorrect)) {
            checkBalance();
        }
        int sum = scanner.nextInt();
        try {
            if (server.checkMoney(sum)) {
                server.putMoney(sum);
                System.out.println(TerminalServer.money);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getMoney() {
        if (!(pinValidator.pinCorrect)) {
            checkBalance();
        }
        int sum = scanner.nextInt();
        try {
            if (server.checkMoney(sum)) {
                server.getMoney(sum);
                System.out.println(TerminalServer.money);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

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

            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void putMoney() {

    }

    @Override
    public void getMoney() {

    }
}

package homework04;

import homework04.handle_exceptions.AccountIsLockedException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException, AccountIsLockedException {
        Scanner scanner = new Scanner(System.in);
        TerminalImpl terminal = new TerminalImpl();
        System.out.println("Что хотите сделать?");
        System.out.println("1 - Проверить баланс");
        System.out.println("2 - Пополнить карту");
        System.out.println("3 - Снять наличные");
        int number = scanner.nextInt();

        if (number == 1) {
            terminal.checkBalance();
        } else if (number == 2) {
            terminal.putMoney();
        } else if (number == 3) {
            terminal.getMoney();
        } else {
            System.out.println("Error. Try Again.");
        }
    }
}

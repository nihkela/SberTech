package homework01.hw;

public class PersonTest {
    public static void main(String[] args) {
        Person alexey = new Person(true, "Alexey");
        Person kseniya = new Person(false, "Kseniya");
        Person ivan = new Person(true, "Ivan");
        Person elena = new Person(false, "Elena");

        alexey.marry(kseniya);
        ivan.marry(elena);
        alexey.marry(elena);
        elena.divorce();
        alexey.divorce();


    }
}

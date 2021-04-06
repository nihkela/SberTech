package homework01.hw;

public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (this.man != person.man) {
            if (this.spouse != null) {
                this.divorce();
            }
            if (person.spouse != null) {
                person.divorce();
            }
            this.spouse = person;
            person.spouse = this;
            System.out.println(person.name + " и " + this.name + " поженились");
            return true;
        }
        else {
            System.out.println(person.name + " и " + this.name + " имеют один пол и не могут пожениться");
            return false;
        }
    }

    public boolean divorce() {
        if (this.spouse != null) {
            System.out.println(this.name + " и " + this.spouse.name + " развелись");
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        }
        else {
            return false;
        }
    }
}

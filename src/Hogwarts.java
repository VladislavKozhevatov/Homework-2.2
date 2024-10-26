import java.util.Objects;

public class Hogwarts {
    private String name;
    private String surname;
    private int witchcraftPower;
    private int transgressionRange;

    public Hogwarts(String name, String surname, int witchcraftPower, int transgressionRange) {
        this.name = name;
        this.surname = surname;
        this.witchcraftPower = witchcraftPower;
        this.transgressionRange = transgressionRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public void setWitchcraftPower(int witchcraftPower) {
        this.witchcraftPower = witchcraftPower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return witchcraftPower == hogwarts.witchcraftPower && transgressionRange == hogwarts.transgressionRange && Objects.equals(name, hogwarts.name) && Objects.equals(surname, hogwarts.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, witchcraftPower, transgressionRange);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", witchcraftPower=" + witchcraftPower +
                ", transgressionRange=" + transgressionRange +
                '}';
    }

    private int getTotalPoint() {
        return witchcraftPower + transgressionRange;
    }

    public static void compareingStudentds(Hogwarts StudentOne, Hogwarts StudentTwo) {
        if (StudentOne.getTotalPoint() > StudentTwo.getTotalPoint()) {
            System.out.println(StudentOne.getSurname() + " Обладает большей мощью чем " + StudentTwo.getSurname());
        } else if (StudentOne.getTotalPoint() < StudentTwo.getTotalPoint()) {
            System.out.println(StudentTwo.getSurname() + " Обладает большей мощью чем" + StudentTwo.getSurname());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}

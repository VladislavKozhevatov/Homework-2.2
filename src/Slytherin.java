import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstforpower;


    public Slytherin(String name, String surname, int witchcraftPower, int transgressionRange, int cunning, int determination, int ambition, int resourcefulness, int thirstforpower) {
        super(name, surname, witchcraftPower, transgressionRange);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstforpower = thirstforpower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstforpower() {
        return thirstforpower;
    }

    public void setThirstforpower(int thirstforpower) {
        this.thirstforpower = thirstforpower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstforpower=" + thirstforpower +
                '}';
    }

    private int getTotalPointSlitherin() {
        return cunning + determination + ambition + resourcefulness + thirstforpower;
    }

    public static void compareingStudentdsSlitherin(Slytherin StudentOne, Slytherin StudentTwo) {
        if (StudentOne.getTotalPointSlitherin() > StudentTwo.getTotalPointSlitherin()) {
            System.out.println(StudentOne.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else if (StudentOne.getTotalPointSlitherin() < StudentTwo.getTotalPointSlitherin()) {
            System.out.println(StudentTwo.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}

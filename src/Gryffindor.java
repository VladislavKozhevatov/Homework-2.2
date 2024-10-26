import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility ;
    private int honor ;
    private int bravery ;


    public Gryffindor(String name, String surname, int witchcraftPower, int transgressionRange, int nobility, int honor, int bravery) {
        super(name, surname, witchcraftPower, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void getSummOfPoints(Gryffindor[]gryffindors){
        int sumOfPoints=nobility+honor+bravery;
        System.out.println(sumOfPoints);
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    private int getTotalPointGryffendor() {
        return nobility + honor + bravery;
    }

    public static void compareingStudentdsGryffendor(Gryffindor StudentOne, Gryffindor StudentTwo) {
        if (StudentOne.getTotalPointGryffendor() > StudentTwo.getTotalPointGryffendor()) {
            System.out.println(StudentOne.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else if (StudentOne.getTotalPointGryffendor() < StudentTwo.getTotalPointGryffendor()) {
            System.out.println(StudentTwo.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}

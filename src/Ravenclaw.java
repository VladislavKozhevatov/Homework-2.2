public class Ravenclaw extends Hogwarts{
    private  int smart ;
    private int wise ;
    private int witty ;
    private int creativity ;


    public Ravenclaw(String name, String surname, int witchcraftPower, int transgressionRange, int smart, int wise, int witty, int creativity) {
        super(name, surname, witchcraftPower, transgressionRange);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int getTotalPointRavenclaw() {
        return smart + wise + witty + creativity;
    }

    public static void compareingStudentdsRavenclaw(Ravenclaw StudentOne, Ravenclaw StudentTwo) {
        if (StudentOne.getTotalPointRavenclaw() > StudentTwo.getTotalPointRavenclaw()) {
            System.out.println(StudentOne.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else if (StudentOne.getTotalPointRavenclaw() < StudentTwo.getTotalPointRavenclaw()) {
            System.out.println(StudentTwo.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}

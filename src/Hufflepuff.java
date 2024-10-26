public class Hufflepuff extends Hogwarts {
    private int hardworking ;
    private int loyal ;
    private int honest ;


    public Hufflepuff(String name, String surname, int witchcraftPower, int transgressionRange, int hardworking, int loyal, int honest) {
        super(name, surname, witchcraftPower, transgressionRange);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    private int getTotalPointHufflepuff() {
        return hardworking + loyal + honest;
    }

    public static void compareingStudentdsHufflepuff(Hufflepuff StudentOne, Hufflepuff StudentTwo) {
        if (StudentOne.getTotalPointHufflepuff() > StudentTwo.getTotalPointHufflepuff()) {
            System.out.println(StudentOne.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else if (StudentOne.getTotalPointHufflepuff() < StudentTwo.getTotalPointHufflepuff()) {
            System.out.println(StudentTwo.getName() + " Обладает большей мощью чем " + StudentTwo.getName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}

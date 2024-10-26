public class Main {

    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 34, 55, 64, 23, 45),
                new Gryffindor("Гермиона", "Грейнджер", 35, 23, 56, 77, 54),
                new Gryffindor("Рон", "Уизли", 56, 45, 33, 78, 55)
        };


        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 26, 53, 26, 33, 76),
                new Hufflepuff("Седрик", "Диггори", 25, 65, 76, 84, 23),
                new Hufflepuff("Джастин", "Финч", 67, 45, 32, 78, 45)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 26, 76, 43, 85, 43, 32),
                new Ravenclaw("Падма", "Патил", 65, 43, 76, 43, 47, 32),
                new Ravenclaw("Маркус", "Балби", 37, 84, 22, 54, 67, 34),
        };


        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 24, 66, 45, 79, 54, 43, 56),
                new Slytherin("Грэхэм", "Монтегю", 11, 11, 11, 11, 11, 11, 11),
                new Slytherin("Грегори", "Гойл", 11, 11, 11, 11, 11, 11, 11)
        };

        printMethod PrintMethod = new printMethod();
        printMethod.print(gryffindors);
        printMethod.print(hufflepuffs);
        printMethod.print(ravenclaws);
        printMethod.print(slytherins);
        Hogwarts.compareingStudentds(slytherins[1], gryffindors[2]);
        Gryffindor.compareingStudentdsGryffendor(gryffindors[1], gryffindors[0]);
        Hufflepuff.compareingStudentdsHufflepuff(hufflepuffs[1], hufflepuffs[2]);
        Ravenclaw.compareingStudentdsRavenclaw(ravenclaws[0], ravenclaws[1]);
        Slytherin.compareingStudentdsSlitherin(slytherins[1], slytherins[2]);

    }
}


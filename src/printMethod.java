public class printMethod {

    public static void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Факултет Грифиндор " +
                    "Имя - " + gryffindor.getName() +
                    ", Фамилия - " + gryffindor.getSurname() +
                    ", Сила магии =" + gryffindor.getWitchcraftPower() +
                    ", Расстояние трансгрессии =" + gryffindor.getTransgressionRange() +
                    ", Благородство = " + gryffindor.getNobility() +
                    ", Честь = " + gryffindor.getHonor() +
                    ", Храбрость = " + gryffindor.getBravery());
        }
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Факултет Пуффендуй " +
                    "Имя - " + hufflepuff.getName() +
                    ", Фамилия - " + hufflepuff.getSurname() +
                    ", Сила магии =" + hufflepuff.getWitchcraftPower() +
                    ", Расстояние трансгрессии =" + hufflepuff.getTransgressionRange() +
                    ", Трудолюбие = " + hufflepuff.getHardworking() +
                    ", Лояльность = " + hufflepuff.getLoyal() +
                    ", Честность = " + hufflepuff.getHonest());
        }
    }

    public static void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Факултет Когтевран " +
                    "Имя - " + ravenclaw.getName() +
                    ", Фамилия - " + ravenclaw.getSurname() +
                    ", Сила магии =" + ravenclaw.getWitchcraftPower() +
                    ", Расстояние трансгрессии =" + ravenclaw.getTransgressionRange() +
                    ", Интеллект = " + ravenclaw.getSmart() +
                    ", Мудрость = " + ravenclaw.getWise() +
                    ", Остроумие = " + ravenclaw.getWitty() +
                    ", Творчество = " + ravenclaw.getCreativity());
        }
    }


    public static void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Факултет Cлизерин " +
                    "Имя - " + slytherin.getName() +
                    ", Фамилия - " + slytherin.getSurname() +
                    ", Сила магии =" + slytherin.getWitchcraftPower() +
                    ", Расстояние трансгрессии =" + slytherin.getTransgressionRange() +
                    ", Хитрость = " + slytherin.getCunning() +
                    ", Решительность = " + slytherin.getDetermination() +
                    ", Амбициозность = " + slytherin.getAmbition() +
                    ", Находчивость = " + slytherin.getResourcefulness() +
                    ", Жажда власти = " + slytherin.getThirstforpower());
        }
    }

}

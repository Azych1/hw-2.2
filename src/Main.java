public class Main {
    public static void main(String[] args) {

        Hogwarts[] pupils = {
                new Gryffindor("Harry Potter", 98, 45, 44, 45, 47),
                new Gryffindor("Hermione Granger", 95, 52, 12, 46, 52),
                new Gryffindor("Ron Weasley", 20, 55, 24, 68, 30),

                new Hufflepuff("Draco Malfoy", 97, 46, 45,17,2),
                new Hufflepuff("Graham Montagu", 78, 45, 44,45,1),
                new Hufflepuff("Gregory Goyle", 99, 27, 43,37,55),

                new Ravenclaw("Zacharias Smith", 91, 45, 44,45,47, 77),
                new Ravenclaw("Cedric Diggory", 97, 45, 44,45,47, 45),
                new Ravenclaw("Justin Finch-Fletchley", 92, 45, 44,45,47,50),

                new Slytherin("Zhou Chang", 88, 45, 44,45,47, 77, 51),
                new Slytherin("Padma Patil", 77, 45, 44,45,47, 71,28),
                new Slytherin("Marcus Belby", 99, 45, 44,45,47, 60,44),
        };

        System.out.println(pupils[0].toString());
        System.out.println(pupils[0].compareWith((Gryffindor) pupils[1]));


    }
}
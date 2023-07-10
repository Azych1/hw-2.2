public class Hufflepuff extends Hogwarts {

    private int hardworking;

    private int loyalty;

    private int honesty;

    public Hufflepuff(String name, String surname, int magic, int transgression,
                      int hardworking, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                ", hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void compareTo(Hufflepuff other) {
        int countThis = this.hardworking + this.loyalty + this.honesty;
        int countOther = other.hardworking + other.loyalty + other.honesty;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(this, other);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }

    private void printComparableStudent(Hufflepuff bestStudent, Hufflepuff worseStudent) {
        System.out.println(bestStudent.getName() + "" + bestStudent.getSurname() +
                " лучший Пуффендуец чем " + worseStudent.getName() + worseStudent.getSurname());
    }
}

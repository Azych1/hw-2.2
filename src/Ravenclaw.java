public class Ravenclaw extends Hogwarts {

    private int smart;

    private int wisdom;

    private int wit;

    private int creation;

    public Ravenclaw(String name, String surname, int magic, int transgression,
                     int smart, int wisdom, int wit, int creation) {
        super(name, surname, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString() +
                ", smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    public void compareTo(Ravenclaw other) {
        int countThis = this.smart + this.wisdom + this.wit + this.creation;
        int countOther = other.smart + other.wisdom + other.wit + other.creation;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(this, other);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }

    private void printComparableStudent(Ravenclaw bestStudent, Ravenclaw worseStudent) {
        System.out.println(bestStudent.getName() + "" + bestStudent.getSurname() +
                " лучший Когтевранец чем " + worseStudent.getName() + worseStudent.getSurname());
    }
}

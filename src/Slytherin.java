public class Slytherin extends Hogwarts {

    private int cunning;

    private int determination;

    private int ambition;

    private int inventiveness;

    private int powerLust;

    public Slytherin(String name, String surname, int magic, int transgression,
                     int cunning, int determination, int ambition,
                     int inventiveness, int powerLust) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", inventiveness=" + inventiveness +
                ", powerLust=" + powerLust +
                '}';
    }

    public void compareTo(Slytherin other) {
        int countThis = this.cunning + this.determination + this.ambition + this.inventiveness + this.powerLust;
        int countOther = other.cunning + other.determination + other.ambition + other.inventiveness + other.powerLust;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(this, other);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }

    private void printComparableStudent(Slytherin bestStudent, Slytherin worseStudent) {
        System.out.println(bestStudent.getName() + "" + bestStudent.getSurname() +
                " лучший Слизеринец чем " + worseStudent.getName() + worseStudent.getSurname());
    }
}

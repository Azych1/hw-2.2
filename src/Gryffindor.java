public class Gryffindor extends Hogwarts {

    private int nobility;

    private int honor;

    private int bravery;

    public Gryffindor(String name, String surname, int magic, int transgression,
                      int nobility, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void compareTo(Gryffindor other) {
        int countThis = this.nobility + this.honor + this.bravery;
        int countOther = other.nobility + other.honor + other.bravery;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(this, other);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }

    private void printComparableStudent(Gryffindor bestStudent, Gryffindor worseStudent) {
        System.out.println(bestStudent.getName() + "" + bestStudent.getSurname() +
                " лучший Гриффиндорец чем " + worseStudent.getName() + worseStudent.getSurname());
    }

}

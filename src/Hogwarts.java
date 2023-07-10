public abstract class Hogwarts {
    private String name;

    private String surname;

    private int magic;

    private int transgression;

    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void compareTo(Hogwarts other) {
        int countThis = this.magic + this.transgression;
        int countOther = other.magic + other.transgression;

        if (countThis > countOther) {
            printComparableStudent(this, other);
        } else if (countThis < countOther) {
            printComparableStudent(this, other);
        } else {
            System.out.println("Студенты одинаково сильны");
        }
    }

    private void printComparableStudent(Hogwarts bestStudent, Hogwarts worseStudent) {
        System.out.println(bestStudent.getName() + "" + bestStudent.getSurname() +
                " лучший студент Хогвартса чем " + worseStudent.getName() + worseStudent.getSurname());
    }
}

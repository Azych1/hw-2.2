public abstract class Hogwarts {
    private String name;
    private int magic;
    private int transgress;

    public Hogwarts(String name, int magic, int transgress) {
        this.name = name;
        this.magic = magic;
        this.transgress = transgress;
    }


    public abstract String toString();

    public abstract String compareWith(Gryffindor pupil);
    public abstract String compareWith(Hufflepuff pupil);
    public abstract String compareWith(Ravenclaw pupil);
    public abstract String compareWith(Slytherin pupil);

    public abstract String compareByMagicAndTransgressionWith(Gryffindor pupil);
    public abstract String compareByMagicAndTransgressionWith(Hufflepuff pupil);
    public abstract String compareByMagicAndTransgressionWith(Ravenclaw pupil);
    public abstract String compareByMagicAndTransgressionWith(Slytherin pupil);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgress, int mind, int wisdom, int wit, int creativity) {
        super(name, magic, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgress=" + getTransgress() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public String compareWith(Hogwarts pupil) {
        return compareWith((Ravenclaw) pupil);
    }

    public String compareWith(Gryffindor pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Hufflepuff pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Ravenclaw pupil) {
        if ((this.getTransgress() + this.getMagic() + this.getCreativity() + this.getMind() + this.getWisdom() + this.getWit()) >
                (pupil.getTransgress() + pupil.getMagic() + pupil.getCreativity() + pupil.getMind() + pupil.getWisdom() + pupil.getWit())) {
            return this.getName() + " лучший Когтевранец, чем " + pupil.getName();
        } else {
            return pupil.getName() + " лучший Когтевранец, чем " + this.getName();
        }
    }

    public String compareWith(Slytherin pupil) {
        return "У них разные факультеты!";
    }

    public String compareByMagicAndTransgressionWith(Hogwarts pupil) {
        Gryffindor gryffindor = new Gryffindor("1", 1, 1, 1, 1, 1);
        Hufflepuff hufflepuff = new Hufflepuff("1", 1, 1, 1, 1, 1);
        Ravenclaw ravenclaw = new Ravenclaw("1", 1, 1, 1, 1, 1, 1);
        Slytherin slytherin = new Slytherin("1", 1, 1, 1, 1, 1, 1, 1);

        if (pupil.getClass() == gryffindor.getClass()) {
            return compareByMagicAndTransgressionWith((Gryffindor) pupil);
        } else if (pupil.getClass() == hufflepuff.getClass()) {
            return compareByMagicAndTransgressionWith((Hufflepuff) pupil);
        } else if (pupil.getClass() == ravenclaw.getClass()) {
            return compareByMagicAndTransgressionWith((Ravenclaw) pupil);
        } else {
            return compareByMagicAndTransgressionWith((Slytherin) pupil);
        }
    }

    public String compareByMagicAndTransgressionWith(Gryffindor pupil) {
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии и трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии, но меньшей мощностью трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName() + " обладает меньшей мощностью магии и трансгрессии чем " + pupil.getName();
        }
    }

    ;

    public String compareByMagicAndTransgressionWith(Hufflepuff pupil) {
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии и трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии, но меньшей мощностью трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName() + " обладает меньшей мощностью магии и трансгрессии чем " + pupil.getName();
        }
    }

    ;

    public String compareByMagicAndTransgressionWith(Ravenclaw pupil) {
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии и трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии, но меньшей мощностью трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName() + " обладает меньшей мощностью магии и трансгрессии чем " + pupil.getName();
        }
    }

    ;

    public String compareByMagicAndTransgressionWith(Slytherin pupil) {
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии и трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName() + " обладает большей мощностью магии, но меньшей мощностью трансгрессии чем " + pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName() + " обладает меньшей мощностью магии и трансгрессии чем " + pupil.getName();
        }
    }

    ;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}

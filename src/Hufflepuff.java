public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgress=" + getTransgress() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public String compareWith(Hogwarts pupil) {
        return compareWith((Hufflepuff) pupil);
    }

    public String compareWith(Gryffindor pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Hufflepuff pupil) {
        if ((this.getTransgress() + this.getMagic() + this.getHonesty() + this.getIndustriousness() + this.getLoyalty()) >
                (pupil.getTransgress() + pupil.getMagic() + pupil.getHonesty() + pupil.getIndustriousness() + pupil.getLoyalty())) {
            return this.getName() + " лучший Пуффендуец, чем " + pupil.getName();
        } else {
            return pupil.getName() + " лучший Пуффендуец, чем " + this.getName();
        }
    }

    public String compareWith(Ravenclaw pupil) {
        return "У них разные факультеты!";
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


    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}

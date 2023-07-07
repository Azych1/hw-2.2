public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgress=" + getTransgress() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }


    public String compareWith(Hogwarts pupil) {
        return compareWith((Slytherin) pupil);
    }

    public String compareWith(Gryffindor pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Hufflepuff pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Ravenclaw pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Slytherin pupil) {
        if ((this.getTransgress() + this.getMagic() + this.getAmbition() + this.getCunning() + this.getDetermination() + this.getLustForPower() + this.getResourcefulness()) >
                (pupil.getTransgress() + pupil.getMagic() + pupil.getAmbition() + pupil.getCunning() + pupil.getDetermination() + pupil.getLustForPower() + pupil.getResourcefulness())) {
            return this.getName() + " лучший Слизеринец, чем " + pupil.getName();
        } else {
            return pupil.getName() + " лучший Слизеринец, чем " + this.getName();
        }
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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}

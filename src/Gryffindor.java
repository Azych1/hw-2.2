public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgress, int nobility, int honor, int bravery) {
        super(name, magic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "name=" + getName() +
                ", magic=" + getMagic() +
                ", transgress=" + getTransgress() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public String compareWith(Gryffindor pupil) {
        if ((this.getTransgress()+this.getMagic()+this.getBravery()+this.getNobility()+this.getHonor())>
                (pupil.getTransgress()+pupil.getMagic()+pupil.getBravery()+pupil.getNobility()+pupil.getHonor())){
            return this.getName()+" лучший Гриффиндорец, чем "+pupil.getName();
        } else {
            return pupil.getName()+" лучший Гриффиндорец, чем "+this.getName();
        }
    }

    public String compareWith(Hufflepuff pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Ravenclaw pupil) {
        return "У них разные факультеты!";
    }

    public String compareWith(Slytherin pupil) {
        return "У них разные факультеты!";
    }

    public String compareByMagicAndTransgressionWith(Gryffindor pupil){
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии и трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии, но меньшей мощностью трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName()+" обладает меньшей мощностью магии и трансгрессии чем "+pupil.getName();
        }
    };
    public String compareByMagicAndTransgressionWith(Hufflepuff pupil){
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии и трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии, но меньшей мощностью трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName()+" обладает меньшей мощностью магии и трансгрессии чем "+pupil.getName();
        }
    };
    public String compareByMagicAndTransgressionWith(Ravenclaw pupil){
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии и трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии, но меньшей мощностью трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName()+" обладает меньшей мощностью магии и трансгрессии чем "+pupil.getName();
        }
    };
    public String compareByMagicAndTransgressionWith(Slytherin pupil){
        if (this.getMagic() > pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии и трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() > pupil.getMagic() && this.getTransgress() < pupil.getTransgress()) {
            return this.getName()+" обладает большей мощностью магии, но меньшей мощностью трансгрессии чем "+pupil.getName();
        } else if (this.getMagic() < pupil.getMagic() && this.getTransgress() > pupil.getTransgress()) {
            return this.getName() + " обладает меньшей мощностью магии, но большей мощностью трансгрессии чем " + pupil.getName();
        } else {
            return this.getName()+" обладает меньшей мощностью магии и трансгрессии чем "+pupil.getName();
        }
    };

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}

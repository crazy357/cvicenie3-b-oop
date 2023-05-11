package cvicenie3;

public class Student {
    private int ID;
    private String meno;
    private String priezvisko;
    private int vek;

    public Student(int ID, String meno, String priezvisko, int vek) {
        this.ID = ID;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezviko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public String toString() {
        return this.ID + " " + this.meno + " " + this.priezvisko + " " + this.vek;
    }
}

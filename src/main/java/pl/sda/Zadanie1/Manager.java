package pl.sda.zadanie1;

public class Manager extends Person1 {

     private String dzial;
     private float wynagrodzenie;

    public Manager(String dzial, float wynagrodzenie) {
        this.dzial = dzial;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getDzial() {
        return dzial;
    }

    public float getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setDzial(String dzial) {
        this.dzial = dzial;
    }

    public void setWynagrodzenie(float wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "dzial='" + dzial + '\'' +
                ", wynagrodzenie=" + wynagrodzenie +
                '}';
    }
}

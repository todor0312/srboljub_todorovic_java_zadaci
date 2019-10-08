package zadatak1;

public class Kuca extends Nekretnina {
    private double povrsinaOkucnice;

    public Kuca() {
    }

    public Kuca(double povrsinaOkucnice) {
        this.povrsinaOkucnice = povrsinaOkucnice;
    }

    @Override
    double cena() {
        return getKvadratura() * cenaPoZoni(getZona()) + (povrsinaOkucnice * cenaPoZoni(getZona()) * 0.15);
    }

    @Override
    public String toString() {
        return "Tip nekretnine: kuca. " + "\n" + "Adresa: " + getAdresa() + ",\n" + "Zona: " + getZona() + ",\n" + "Kvadratura: " + getKvadratura() + ",\n" + "Vlasnik: " + getVlasnik() + ",\n" + "Povrsina okucnice: " + povrsinaOkucnice + ",\n" + "Ukupna cena nekretnine: " + cena() + ".\n";
    }

    public double getPovrsinaOkucnice() {
        return povrsinaOkucnice;
    }

    public void setPovrsinaOkucnice(double povrsinaOkucnice) {
        this.povrsinaOkucnice = povrsinaOkucnice;
    }
}

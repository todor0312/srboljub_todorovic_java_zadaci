package zadatak1;

public class Kuca extends Nekretnina {
    private double povrsinaOkucnice;

    public Kuca(double povrsinaOkucnice) {
        if (povrsinaOkucnice < 0) {
            throw new IllegalArgumentException(GRESKA + GRESKA_POVRSINA_OKUCNICE);
        }
        this.povrsinaOkucnice = povrsinaOkucnice;
    }

    @Override
    double cena() {
        return getKvadratura() * cenaPoZoni(getZona()) + (povrsinaOkucnice * cenaPoZoni(getZona()) * 0.15);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        return (str.append(" Tip nekretnine: kuca.\n Adresa: ").append(getAdresa()).append(",\n Zona: ").append(getZona()).append(",\n Kvadratura: ").append(getKvadratura()).append(",\n Vlasnik: ").append(getVlasnik()).append(",\n Povrsina okucnice: ").append(povrsinaOkucnice).append(",\n Ukupna cena nekretnine: ").append(cena()).append(".\n")).toString();
    }
}

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
        return new StringBuilder(" Tip nekretnine: kuca.\n Adresa: ").append(getAdresa()).append(",\n Zona: ").append(getZona()).append(",\n Kvadratura: ").append(getKvadratura()).append(" m\u00B2").append(",\n Vlasnik: ").append(getVlasnik()).append(",\n Povrsina okucnice: ").append(povrsinaOkucnice).append(" m\u00B2").append(",\n Ukupna cena nekretnine: ").append(cena()).append(" €").append(".\n").toString();
    }
}

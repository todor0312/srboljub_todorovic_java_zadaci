package zadatak1;

public class Stan extends Nekretnina {
    private double povrsinaPodruma;
    private double povrsinaTerase;

    public Stan() {
    }

    public Stan(double povrsinaPodruma, double povrsinaTerase) {
        this.povrsinaPodruma = povrsinaPodruma;
        this.povrsinaTerase = povrsinaTerase;
    }

    @Override
    double cena() {
        return getKvadratura() * cenaPoZoni(getZona()) + (povrsinaPodruma + povrsinaTerase) * cenaPoZoni(getZona()) * 0.33;
    }

    @Override
    public String toString() {
        return "Tip nekretnine: stan. " + "\n" + "Adresa: " + getAdresa() + ",\n" + "Zona: " + getZona() + ",\n" + "Kvadratura: " + getKvadratura() + ",\n" + "Vlasnik: " + getVlasnik() + ",\n" + "Povrsina podruma: " + povrsinaPodruma + ",\n" + "Povrsina terase: " + povrsinaTerase + ",\n" + "Ukupna cena nekretnine: " + cena() + ".\n";
    }

    public double getPovrsinaPodruma() {
        return povrsinaPodruma;
    }

    public void setPovrsinaPodruma(double povrsinaPodruma) {
        this.povrsinaPodruma = povrsinaPodruma;
    }

    public double getPovrsinaTerase() {
        return povrsinaTerase;
    }

    public void setPovrsinaTerase(double povrsinaTerase) {
        this.povrsinaTerase = povrsinaTerase;
    }
}

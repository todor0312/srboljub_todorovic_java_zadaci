package zadatak1;

public class Stan extends Nekretnina {
    private double povrsinaPodruma;
    private double povrsinaTerase;

    public Stan(double povrsinaPodruma, double povrsinaTerase) {
        if (povrsinaPodruma < 0 || povrsinaTerase < 0) {
            throw new IllegalArgumentException(GRESKA + GRESKA_POVRSINA_TERASE_ILI_PODRUMA);
        }
        this.povrsinaPodruma = povrsinaPodruma;
        this.povrsinaTerase = povrsinaTerase;
    }

    @Override
    double cena() {
        return getKvadratura() * cenaPoZoni(getZona()) + (povrsinaPodruma + povrsinaTerase) * cenaPoZoni(getZona()) * 0.33;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        return (str.append(" Tip nekretnine: stan.\n Adresa: ").append(getAdresa()).append(",\n Zona: ").append(getZona()).append(",\n Kvadratura: ").append(getKvadratura()).append(",\n Vlasnik: ").append(getVlasnik()).append(",\n Povrsina podruma: ").append(povrsinaPodruma).append(",\n Povrsina terase: ").append(povrsinaTerase).append(",\n Ukupna cena nekretnine: ").append(cena()).append(".\n")).toString();
    }
}

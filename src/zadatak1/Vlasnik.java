package zadatak1;

public class Vlasnik {
    private String ime;
    private String prezime;
    private String jmbg;
    private String brojlicneKarte;

    public Vlasnik() {
    }

    public Vlasnik(String ime, String prezime, String jmbg, String brojlicneKarte) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.brojlicneKarte = brojlicneKarte;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + ", jmbg: " + jmbg + ", br. licne karte: " + brojlicneKarte;
    }

    public void setIme(String ime) {
        if (ime.matches(".*\\d.*") || ime.matches(".*\\W.*")) {
            throw new IllegalArgumentException(Nekretnina.GRESKA + Nekretnina.GRESKA_IME);
        } else {
            this.ime = ime;
        }
    }

    public void setPrezime(String prezime) {
        if (prezime.matches(".*\\d.*") || prezime.matches(".*\\W.*")) {
            throw new IllegalArgumentException(Nekretnina.GRESKA + Nekretnina.GRESKA_PREZIME);
        } else {
            this.prezime = prezime;
        }
    }

    public void setJmbg(String jmbg) {
        if (jmbg.length() != 13 || jmbg.matches(".*\\D.*")) {
            throw new IllegalArgumentException(Nekretnina.GRESKA + Nekretnina.GRESKA_JMBG);
        }
        this.jmbg = jmbg;
    }

    public void setBrojlicneKarte(String brojlicneKarte) {
        if (brojlicneKarte.length() != 9 || brojlicneKarte.matches(".*\\D.*")) {
            throw new IllegalArgumentException(Nekretnina.GRESKA + Nekretnina.GRESKA_LICNA_KARTA);
        }
        this.brojlicneKarte = brojlicneKarte;
    }
}

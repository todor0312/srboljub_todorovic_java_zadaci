package zadatak1;

public class Vlasnik {
    private String ime;
    private String prezime;
    private long jmbg;
    private int brojlicneKarte;

    public Vlasnik() {
    }

    public Vlasnik(String ime, String prezime, long jmbg, int brojlicneKarte) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.brojlicneKarte = brojlicneKarte;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + ", jmbg: " + jmbg + ", br. licne karte: " + brojlicneKarte;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public long getJmbg() {
        return jmbg;
    }

    public void setJmbg(long jmbg) {
        this.jmbg = jmbg;
    }

    public int getBrojlicneKarte() {
        return brojlicneKarte;
    }

    public void setBrojlicneKarte(int brojlicneKarte) {
        this.brojlicneKarte = brojlicneKarte;
    }
}

package zadatak1;

public abstract class Nekretnina {
    private String adresa;
    private int zona;
    private double kvadratura;
    private Vlasnik vlasnik;

    public Nekretnina() {
    }

    public Nekretnina(String adresa, int zona, double kvadratura, Vlasnik vlasnik) {
        this.adresa = adresa;
        this.zona = zona;
        this.kvadratura = kvadratura;
        this.vlasnik = vlasnik;
    }

    abstract double cena();

    public int cenaPoZoni(int zona) {
        int cenaZaZonu;
        switch (zona) {
            case 1:
                cenaZaZonu = 3000;
                return cenaZaZonu;
            case 2:
                cenaZaZonu = 2000;
                return cenaZaZonu;
            case 3:
                cenaZaZonu = 1000;
                return cenaZaZonu;
            case 4:
                cenaZaZonu = 500;
                return cenaZaZonu;
            default:
                return  1;
        }
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }
}

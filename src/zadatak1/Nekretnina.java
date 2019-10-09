package zadatak1;

public abstract class Nekretnina {
    private String adresa;
    private int zona;
    private double kvadratura;
    private Vlasnik vlasnik;

    public static final String GRESKA = "Neispravan unos!";
    public static final String GRESKA_POVRSINA_TERASE_ILI_PODRUMA = "Povrsine terase i/ili podruma moraju biti pozitivne vrednosti";
    public static final String GRESKA_POVRSINA_OKUCNICE = "Povrsina okucnice mora biti pozitivna vrednost";
    public static final String GRESKA_ADRESE = "Morate uneti adresu!";
    public static final String GRESKA_ZONE = "Zona mora biti u intervalu od 1 do 4";
    public static final String GRESKA_KVADRATURE = "Kvadratura nekretnine mora biti pozitivna vrednost!";
    public static final String GRESKA_IME = "Ime vlasnika ne moze sadrzati brojeve i/ili specijalne karaktere!";
    public static final String GRESKA_PREZIME = "Prezime vlasnika ne moze sadrzati brojeve i/ili specijalne karaktere!";
    public static final String GRESKA_JMBG = "JMBG mora imati 13 cifara i moze sadrzati samo brojeve";
    public static final String GRESKA_LICNA_KARTA = "Broj licne karte mora imati 9 cifara i moze sadrzati samo brojeve";


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
                return 1;
        }
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        if (adresa == null || adresa == "") {
            throw new IllegalArgumentException(GRESKA + GRESKA_ADRESE);
        } else {
            this.adresa = adresa;
        }
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        if (zona > 0 && zona <= 4) {
            this.zona = zona;
        } else {
            throw new IllegalArgumentException(GRESKA + GRESKA_ZONE);
        }
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        if (kvadratura <= 0) {
            throw new IllegalArgumentException(GRESKA + GRESKA_KVADRATURE);
        }
        this.kvadratura = kvadratura;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }
}

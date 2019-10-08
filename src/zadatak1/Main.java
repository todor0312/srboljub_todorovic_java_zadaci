/*
    ZADATAK1:
 Napraviti apstraktnu klasu Nekretnina koja od atributa ima adresu, zonu, kvadraturu i podatke o vlasniku/instancu klase Vlasnik.
 Vlasnik ima puno ime i prezime, JMBG i broj lične karte.
 Izvedene klase, Stan i Kuca imaju toString() metodu gde se ispisuju sve informacije o nekretnini uključujući Vlasnika i cenu.
 Cena se računa po principu kvadratura X zona (I zona 3000, II zona 2000, III zona 1000, IV zona 500 €).
 Kuća ima dodatno polje površinaOkućnice.
 U cenu kuće ulazi i cena okućnice koja se računa po principu (površinaOkućnice X zona X 15%).
 Stan ima dva dodatna polja , površinaPodruma i površinaTerase.
 U cenu Stana ulazi i cena podruma i terase ((povrsinaPodruma+povrsinaTerase) X Zona X 33%).
 Napraviti Main klasu i u njoj kreirati instance klase Nekretnina i napraviti objekte izvedenih klasa sa proizvoljnim argumentima.
 Ispisati String reprezentaciju objekata –toString()
 Napomena:-Projekat nazovite ime_prezime_java_zadaci
 Projekat organizujte tako da svi paketi budu smesteni u src folder.
 Za svaki zadatak napravite novi paket (zadatak1, zadatak2 itd.)
 Komentarisite kod gde god mislite da ima smisla.
 U zaglavlju glavne klase dodajte javadoc tag sa imenom autora.
 U zaglavlju glavne klase napisati tekst zadatka.

 @author Srboljub Todorovic
*/

package zadatak1;


public class Main {
    public static void main(String[] args) {
        Nekretnina stan = new Stan(46, 12);
        Nekretnina kuca = new Kuca(6);

        Vlasnik v1 = new Vlasnik("Marko", "Markovic", 1207967784536L, 12345);
        Vlasnik v2 = new Vlasnik("Janko", "Jankovic", 2405975784536L, 67890);

        stan.setAdresa("Trgovacka 13, 11030 Cukarica");
        stan.setZona(4);
        stan.setKvadratura(45.60);
        stan.setVlasnik(v1);

        kuca.setAdresa("Radnicka 23, 11030 Cukarica");
        kuca.setZona(1);
        kuca.setKvadratura(124.50);
        kuca.setVlasnik(v2);

        if (kuca.cenaPoZoni(kuca.getZona()) == 1 || stan.cenaPoZoni(stan.getZona()) == 1) {
            System.out.println("Vrednost atributa zona mora biti u okviru od 1  do 4!");
        } else {
            System.out.println(kuca);
            System.out.println(stan);
        }
    }
}

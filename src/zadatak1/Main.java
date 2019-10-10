/**
 * @author Srboljub Todorovic
 **/

package zadatak1;


public class Main {
    public static void main(String[] args) {
        try {
            Nekretnina stan = new Stan(12, 15);
            Nekretnina kuca = new Kuca(7);

            Vlasnik vlasnik1 = new Vlasnik();
            vlasnik1.setIme("Janko");
            vlasnik1.setPrezime("Janković");
            vlasnik1.setJmbg("1207907784231");
            vlasnik1.setBrojlicneKarte("121300987");

            Vlasnik vlasnik2 = new Vlasnik();
            vlasnik2.setIme("Marko");
            vlasnik2.setPrezime("Marković Petrović");
            vlasnik2.setJmbg("1207907700421");
            vlasnik2.setBrojlicneKarte("121009870");

            stan.setAdresa("Trgovacka 13, 11030 Cukarica");
            stan.setZona(4);
            stan.setKvadratura(45.60);
            stan.setVlasnik(vlasnik1);

            kuca.setAdresa("Radnicka 23, 11030 Cukarica");
            kuca.setZona(1);
            kuca.setKvadratura(45);
            kuca.setVlasnik(vlasnik2);


            System.out.println(kuca);
            System.out.println(stan);

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}

/**
 * @author Srboljub Todorovic
 **/

package zadatak1;


public class Main {
    public static void main(String[] args) {
        try {
            Nekretnina stan = new Stan(12, 15);
            Nekretnina kuca = new Kuca(7);

            Vlasnik v1 = new Vlasnik();
            v1.setIme("Janko");
            v1.setPrezime("Jankovic");
            v1.setJmbg("1207907784231");
            v1.setBrojlicneKarte("121300987");

            Vlasnik v2 = new Vlasnik();
            v2.setIme("Marko");
            v2.setPrezime("Markovic");
            v2.setJmbg("1207907700421");
            v2.setBrojlicneKarte("121009870");

            stan.setAdresa("Trgovacka 13, 11030 Cukarica");
            stan.setZona(4);
            stan.setKvadratura(45.60);
            stan.setVlasnik(v1);

            kuca.setAdresa("Radnicka 23, 11030 Cukarica");
            kuca.setZona(1);
            kuca.setKvadratura(45);
            kuca.setVlasnik(v2);


            System.out.println(kuca);
            System.out.println(stan);

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}

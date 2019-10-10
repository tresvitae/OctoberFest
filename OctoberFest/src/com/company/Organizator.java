package com.company;

public class Organizator {

    private int zasobPieniedzy;

    public Organizator() {
    }

    public int getZasobPieniedzy() {
        return zasobPieniedzy;
    }

    public void setZasobPieniedzy(int zasobPieniedzy) {
        this.zasobPieniedzy = zasobPieniedzy;
    }

    public void zaPraceBarmanki(Barmanka barmanka){
        int temp = barmanka.zapotrzebowanieBarmanek * barmanka.iloscDniPrzepracowanych; //np10barmanek * 4 dni przepracowane
        temp *= barmanka.DZIENNE_WYNAGRODZENIE;
        zasobPieniedzy -= temp;
        setZasobPieniedzy(zasobPieniedzy);
    }

    public void zarobkiNaPiwie(Konsument konsument){
        int sumaZarobkowNaPiwie = konsument.cenaZaPiwa;
        setZasobPieniedzy(sumaZarobkowNaPiwie);
    }
}

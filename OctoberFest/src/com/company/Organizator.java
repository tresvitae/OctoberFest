package com.company;

public class Organizator {

    private int zasobPieniedzy;

    public Organizator() {
    }

    public int zaPraceBarmanek(Barmanka barmanka){
        zasobPieniedzy -= barmanka.wynagrodzenieBarmanki(barmanka.iloscDniPrzepracowanych);
        return zasobPieniedzy;
    }

    public int zarobkiNaPiwie(Konsument konsument){
        int sumaZarobkowNaPiwie = konsument.cenaZaPiwa;
        return sumaZarobkowNaPiwie;
    }
}

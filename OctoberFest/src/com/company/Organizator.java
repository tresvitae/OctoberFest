package com.company;

public class Organizator {

    private int zasobPieniedzy;
    Barmanka barmanka;


    public int zaPraceBarmanek(Barmanka barmanka){
        zasobPieniedzy -= barmanka.wynagrodzenieBarmanki(barmanka.iloscDniPrzepracowanych);
        return zasobPieniedzy;
    }
}

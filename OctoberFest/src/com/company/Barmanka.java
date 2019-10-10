package com.company;

public class Barmanka extends Czlowiek {

    final int DZIENNE_WYNAGRODZENIE = 100;
    final int DZIESIEC_KLIENTOW = 10;
    int iloscDniPrzepracowanych;
    int wynagrodzenie;

    int poziomUrody; //1-100
    int nowyPoziomUrody;
    int napiwek;
    int zapotrzebowanieBarmanek;

    public Barmanka(int iloscDniPrzepracowanych, int poziomUrody) {
        this.iloscDniPrzepracowanych = iloscDniPrzepracowanych;
        this.poziomUrody = poziomUrody;
    }

    public Barmanka() {
    }

    public void setPoziomUrody(int poziomUrody) {
        this.poziomUrody = poziomUrody;
    }
    public int getPoziomUrody() {
        return poziomUrody;
    }



    public int wynagrodzenieBarmanki(int iloscDniPrzepracowanych){
        wynagrodzenie = iloscDniPrzepracowanych * DZIENNE_WYNAGRODZENIE;
        System.out.println("wynagrodzenie = " + wynagrodzenie + " EURO za " + iloscDniPrzepracowanych + " dni pracy.");
        return wynagrodzenie;
    }

    public int obliczenieZatrudnieniaBarmanek(int iloscKlientow){
        zapotrzebowanieBarmanek = iloscKlientow / DZIESIEC_KLIENTOW;
        if(iloscKlientow % DZIESIEC_KLIENTOW != 0)
            zapotrzebowanieBarmanek++;
        return zapotrzebowanieBarmanek;
    }

    public int sumaZarobionychPieniedzy(Konsument konsument, Barmanka barmanka){
        return wynagrodzenieBarmanki(iloscDniPrzepracowanych) + konsument.obliczanieNapiwku(barmanka);
    }
}

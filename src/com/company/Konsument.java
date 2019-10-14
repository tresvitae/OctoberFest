package com.company;

public class Konsument extends Czlowiek {

    private int stanKontaNaKarcie;
    private int tolerancjaIlosciWypicia;
    private int numerIdentyfikatora;

    final int WARTOSC_PIWA = 2;
    int poziomUpicia;
    Barmanka barmanka;
    int iloscKupionychPiw;
    int cenaZaPiwa;

    public Konsument(int stanKontaNaKarcie, int tolerancjaIlosciWypicia, int numerIdentyfikatora) {
        this.stanKontaNaKarcie = stanKontaNaKarcie;
        this.tolerancjaIlosciWypicia = tolerancjaIlosciWypicia;
        this.numerIdentyfikatora = numerIdentyfikatora;
        poziomUpicia = 0;
        iloscKupionychPiw = 0;
        this.barmanka = new Barmanka();
    }


    public void setStanKontaNaKarcie(int stanKontaNaKarcie) {
        this.stanKontaNaKarcie = stanKontaNaKarcie;
    }

    public int getStanKontaNaKarcie() {
        return stanKontaNaKarcie;
    }

    public void setTolerancjaIlosciWypicia(int tolerancjaIlosciWypicia) {
        this.tolerancjaIlosciWypicia = tolerancjaIlosciWypicia;
    }

    public int getTolerancjaIlosciWypicia() {
        return tolerancjaIlosciWypicia;
    }

    public int getNumerIdentyfikatora() {
        return numerIdentyfikatora;
    }


    public int obliczanieNapiwku(Barmanka barmanka) {
        int napiwek = ((iloscKupionychPiw * WARTOSC_PIWA) * ustaleniePoziomuUrodyBarmanki(barmanka));
        System.out.println("napiwek = " + napiwek);
        return napiwek;
    }

    public void kupionePiwo() {
        iloscKupionychPiw++;
        cenaZaPiwa = iloscKupionychPiw * WARTOSC_PIWA; //obliczenie ilosci zakupionych piw
        System.out.println("wypiles piwo nr " + iloscKupionychPiw);
    }



    // Kazdy KONSUMENT pije  w umor.
    public int ustaleniePoziomuUpiciaKonsumenta() {

        while (stanKontaNaKarcie > 0 && tolerancjaIlosciWypicia > 0 && poziomUpicia <= 100) {
            poziomUpicia+=3;
            kupionePiwo();

            if(poziomUpicia >= 100){
                System.out.println("poziomUpicia to  = " + poziomUpicia + " DO DOMU");
               // break;
            }
            
            stanKontaNaKarcie--;
            if (stanKontaNaKarcie == 0) {
                System.out.println(" zabraklo ci kasy. Game over");
            }

            tolerancjaIlosciWypicia--;
            if (tolerancjaIlosciWypicia == 0) {
                System.out.println("upiles sie i lezysz pod stolem");
            }

            System.out.println("Poziom upicia: " + poziomUpicia);
//            System.out.println("stanKontaNaKarcie = " + stanKontaNaKarcie);
//            System.out.println("tolerancjaIlosciWypicia = " + tolerancjaIlosciWypicia);
        }
        return poziomUpicia;
    }

    int ustaleniePoziomuUrodyBarmanki(Barmanka barmanka) {
        int poziomUrodyBarmanki = (barmanka.getPoziomUrody() +
                (barmanka.getPoziomUrody() * ustaleniePoziomuUpiciaKonsumenta()));
        System.out.println("metoda ustaleniePoziomuUrodyBarmanki() = " + poziomUrodyBarmanki);
        return poziomUrodyBarmanki;
    }
}
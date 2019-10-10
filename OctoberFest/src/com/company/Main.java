package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random randomGenerator = new Random();

        Barmanka barmanka = new Barmanka(3,4);


        int numerIdentyfikatoraKonsumenta = 1;
        Konsument konsumentTest1= new Konsument(randomGenerator.nextInt(60), randomGenerator.nextInt(15), numerIdentyfikatoraKonsumenta++);
        Konsument konsumentTest2= new Konsument(randomGenerator.nextInt(100), randomGenerator.nextInt(20), numerIdentyfikatoraKonsumenta++);
        Konsument konsumentTest3= new Konsument(randomGenerator.nextInt(100), randomGenerator.nextInt(20), numerIdentyfikatoraKonsumenta);

        System.out.println("stanKonta: " + konsumentTest1.getStanKontaNaKarcie() + " tolerancja: " + konsumentTest1.getTolerancjaIlosciWypicia() +
                " id: " + konsumentTest1.getNumerIdentyfikatora());


        konsumentTest1.ustaleniePoziomuUpiciaKonsumenta();

        System.out.println("/////////////////////////////////////////////////");
//        System.out.println(konsumentTest1.ustaleniePoziomuUrodyBarmanki(barmanka));
        System.out.println(konsumentTest1.obliczanieNapiwku(barmanka));

//        System.out.println("/////////////////////////////////////////////////");
//        System.out.println(barmanka.wynagrodzenieBarmanki(barmanka.iloscDniPrzepracowanych));
//        numerIdentyfikatoraKonsumenta = 11;
//        System.out.println("numerIdentyfikatoraKonsumenta = " + numerIdentyfikatoraKonsumenta);
//        System.out.println("ilosc zatrudnionych barmanek: " + barmanka.obliczenieZatrudnieniaBarmanek(numerIdentyfikatoraKonsumenta));

        System.out.println("/////////////////////////////////////////////////");
        System.out.println("Suma zarobionych pieniedzy to m. napiwek() + ()wynagrodzenieBarmanki, czyli " + barmanka.sumaZarobionychPieniedzy(konsumentTest1, barmanka));
//        System.out.println("konsumentTest1.iloscKupionychPiw = " + konsumentTest1.iloscKupionychPiw);
    }
}

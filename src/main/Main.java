package main;


import array.SimpleArray;

public class Main {

    public static void main(String[] args) {

        double[ ] array = SimpleArray.erstelleFeld (10);

        SimpleArray.druckeFeld ( array );
        System.out.println ( "minElement " + SimpleArray.minElement ( array ) );
        System.out.println ( "maxElement " + SimpleArray.maxElement ( array ) );
        System.out.println ( "berechneDurchschnitt " + SimpleArray.berechneDurchschnitt ( array ) );
        System.out.println ( "bestimmeKleinstenAbstand " + SimpleArray.bestimmeKleinstenAbstand ( array ) );
        char[ ] number  = {'1','2','3'};
        System.out.println ( "berechneQuersumme " + SimpleArray.berechneQuersumme ( number ) );



    }
}

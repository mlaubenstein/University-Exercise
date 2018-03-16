package array;

public class SimpleArray {
    /**
     * erstellt ein double -Array der Laenge laenge ,
     * dessen Elemente mit Zufallszahlen
     * zwischen 0.0 (inklusive) und 100.0 (exklusive)
     * initialisiert werden (nutzen Sie Math.random())
     *
     * @param length die Laenge des zu erstellenden Feldes
     */
    public static double[] erstelleFeld( int length ) {
        double[] array = new double[length];
        double max = 100;

        for( int i = 0; i<array.length; i++ ) {
            array[i] = ( int )( Math.random()* max );
        }
        return array;

    }


    /**
     * gibt den Wert des kleinsten Elements zurueck * @param array[]
     */
    public static double minElement ( double array[] ){
        double min = Double.MAX_VALUE;
        for (double anArray : array) {
            if (min > anArray) {
                min = anArray;
            }
        }
        return min;
    }
    /**
     * gibt den Wert des groessten Elements zurueck * @param array[]
     */
    public static double maxElement( double array[] ){
        double max = Double.MIN_VALUE;
        for (double anArray : array) {
            if (max < anArray) {
                max = anArray;
            }
        }
        return max;
    }
    /**
     * gibt das Feld auf die Kommandozeile aus * @param array[]
     */
    public static void druckeFeld( double array[] ){
        if ( array != null )
            for (double anArray : array) {
                System.out.println ( anArray );
            }
    }
    /**
     * gibt das arithmetische Mittel aller Elemente zurueck * @param array[]
     */
    public static double berechneDurchschnitt( double array[] ){
        double average = 0;
        for (double anArray : array) {
            average = average + anArray;
        }
        average = average/array.length;
        return average;

    }
    /**
     * gibt den kl. Abstand zweier benachbarter Elemente zurueck * @param array
     */

    public static double bestimmeKleinstenAbstand ( double array[] ) {
        double distance;
        double mindistance = Double.MAX_VALUE;

        for ( int i = 0; i < array.length-1; i++ ) {
            distance = array[i] - array[i+1];
            if ( Math.abs( distance ) < mindistance ) {
                mindistance = Math.abs( distance );
            }
        }
        return mindistance;
    }
    /**
     * berechnet die Quersumme und gibt sie zurueck
     */
    public static int berechneQuersumme ( char number[] ) {

        int checksum = 0;
        for (char aNumber : number) {
            int numberInteger = aNumber - 48;
            checksum = checksum + numberInteger;
        }
        return checksum;
    }

    public static void sortArray (double[] array ) {
        double dummy;
        double[] sortArray = new double[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    dummy = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = dummy;
                    sortArray = array;
                }
            }
        }

    }



}



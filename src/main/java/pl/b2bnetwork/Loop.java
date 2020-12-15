package pl.b2bnetwork;

public class Loop {

    // Wyświetl w main wykorzystując pętle for kolejne liczby całkowite od 0 do 10
    public void printNumberFrom0to10() {
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // Wyświetl w main wykorzystując pętle for kolejne liczby całkowite od 2 do 8
    public void printNumberFrom2To8(int min, int max) {

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printEvenNumberFrom10To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void printSumOddNumberFrom20To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void printSumNumberFromRange(int min, int max, boolean czyParzysta) {
        int resztaZDzielenia = 0;
        if (czyParzysta == true) {
            resztaZDzielenia = 0;
        } else if (czyParzysta == false) {
            resztaZDzielenia = 1;
        }
        for (int i = min; i <= max; i++) {
            if (i % 2 == resztaZDzielenia)
                System.out.println(i);
        }
    }


    // Wyświetl w main wykorzystując pętle for kolejne liczby całkowite parzyste od 10 do 100


    // Wyświetl w main wykorzystując pętle for sumę liczb całkowitych nieparzystych od 20 do 100


    // Wyświetl w main wykorzystując pętle for średnią z liczb od 2 do 12
    public void printAvaregeFrom2To12() {

        int średnia;
        int sum = 0;
        int iloścLiczb = 0;

        for (int i = 2; i <= 12; i++) {
            sum += i;
//            iloścLiczb = iloścLiczb + 1;
            iloścLiczb++;

        }
        średnia = sum / iloścLiczb;
        System.out.println(średnia);
    }

    // Wyświetl w main wszystkie dzielniki liczby 12
    public void printDividers12(int max) {

        for (int i = 1; i <= 12; i++) {
            if (max % i == 0)
                System.out.println(i);
        }

    }
}

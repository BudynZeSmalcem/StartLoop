package pl.b2bnetwork;

public class Loop {


    // Wyświetl w main wykorzystując pętle for kolejne liczby całkowite od 0 do 10
    public void printNumberFrom0to10(int liczba) {
        for (int i = liczba; i <= 10; i++) {
            System.out.println(i);
        }

    }

    // Wyświetl w main wykorzystując pętle for kolejne liczby całkowite
    public void printNumberFrom2To8(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    // Wyświetl w main wykorzystując pętle for kolejne liczby całkowite parzyste od 10 do 100
    public void printEvenNumberFrom10To100() {
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // true lub false
    public void printNumberFromRange(int min, int max, boolean czyParzysta) {
        int resztaZDzielenia = 0;
        if (czyParzysta == true) {
            resztaZDzielenia = 0;
        } else if (czyParzysta == false) {
            resztaZDzielenia = 1;
        }
        for (int i = min; i <= max; i++) {
            if (i % 2 == resztaZDzielenia)
                System.out.println(i);
            System.out.println(i);
        }
    }

    // Wyświetl w main wykorzystując pętle for sumę liczb całkowitych nieparzystych od 20 do 100
    public void printSumOddNumberFrom20To100() {
        for (int i = 20; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    // Wyświetl w main wykorzystując pętle for średnią z liczb od 2 do 12
    public void printAvaregeFrom2To12() {
        // int srednia
        // zmienna, która trzyma sume
        double srednia;
        int sum = 0;
        int iloscLiczb = 0;
        // petla od 2 do 12
        for (int i = 2; i <= 12; i++) {
            //dodawanie do sumy
            sum += i;
            iloscLiczb++;
        }
        srednia = sum / iloscLiczb;
        System.out.println(srednia);
    }

    // Wyświetl w main wszystkie dzielniki liczby 12
    public void printDividers(int max) {
        // for(i=1; 1 <= max;i++)
        for (int i = 1; i <= 12; i++) {
            // if(max % i == 0)
            if (max % i == 0) {
                System.out.println(i);
            }
        }
    }

}

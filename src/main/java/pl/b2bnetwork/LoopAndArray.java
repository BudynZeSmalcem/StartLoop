package pl.b2bnetwork;

import java.util.List;

public class LoopAndArray {
    private int name;

    public LoopAndArray() {
    }

    //używająć pętli for stwórz listę zawierającą liczby całkowite parzyste z zakresu od 9 do 21
    public List<Integer> fillListAndPrintEvenNumber() {
        return null;
    }

    //używająć pętli for stwórz listę zawierającą liczby całkowite parzyste i podzielne przez 3 z zakresu od 10 do 31
    public List<Integer> fillListWithEvenNumberStart10AndEnd31() {
        return null;
    }

    // wyszukaj największą wartość w liscie
    public int highestFromList(final List<Integer> list) {
        int result = 0;
        for (Integer integer : list) {
            if (result < integer) {
                result = integer;
            }
        }
        return result;
    }

    // oblicz średnią wartość listy
    public int averageValueFromList(final List<Integer> list) {
        return 0;
    }
}


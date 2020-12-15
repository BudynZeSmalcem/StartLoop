package pl.b2bnetwork;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(final String[] args) {
        Loop loop = new Loop();
//        loop.printNumberFrom0to10();
//        loop.printNumberFrom2To8(3,5);
//        loop.printEvenNumberFrom10To100();
//        loop.printSumOddNumberFrom20To100();
//        loop.printSumNumberFromRange(1,2,true);
//            loop.printAvaregeFrom2To12();
//            loop.printAvaregeFrom2To12();
//        loop.printDividers12(12);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            list.add(i);
        }
        LoopAndArray loopAndArray = new LoopAndArray();
        System.out.println(loopAndArray.highestFromList(list));
    }

}











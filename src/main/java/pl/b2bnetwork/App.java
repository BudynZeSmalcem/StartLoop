package pl.b2bnetwork;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class App {
    @Test
    public static void main(final String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            list.add(i);
        }
//        Loop loop = new Loop();
//        loop.printDividers(12);
        LoopAndArray loopAndArray = new LoopAndArray();
        System.out.println(loopAndArray.highestFromList(list));
    }
}

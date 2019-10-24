package lesson2;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int size = 10000;
        ArrayActions a1 = new ArrayActions(size);
        ArrayActions a2 = new ArrayActions(size);
        ArrayActions a3 = new ArrayActions(size);

        for(int i = 0; i < size; i++) {
            int rand = randomNumber(1,10000);
            a1.insert(rand);
            a2.insert(rand);
            a3.insert(rand);
        }

        System.out.println("Bubble");
        long start = System.currentTimeMillis();
        Sort.sortBubble(a1.get());
        long finish = System.currentTimeMillis();
        System.out.println((finish-start)+"мс.");

        start = finish;
        System.out.println("Insert");
        Sort.sortInsert(a2.get());
        finish = System.currentTimeMillis();
        System.out.println((finish-start)+"мс.");

        start = finish;
        System.out.println("Select");
        Sort.sortSelect(a3.get());
        finish = System.currentTimeMillis();
        System.out.println((finish-start)+"мс.");

    }

    private static int randomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

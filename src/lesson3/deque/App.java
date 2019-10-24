package lesson3.deque;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        DequeTest();
        DequeAsQueueTest();
    }

    private static void DequeTest() {
        try {
            Deque d = new DequeImpl(10);
            d.insertLeft(3);
            d.insertLeft(2);
            d.insertLeft(1);
            d.insertRight(5);
            d.insertRight(6);
            d.insertRight(7);
            System.out.println(Arrays.toString(((DequeImpl) d).getDequeArray()));
            System.out.println("Удаляем справа "+d.removeRight());
            System.out.println("Удаляем слева "+d.removeLeft());
            System.out.println("Смотрим слева "+d.peekLeft());
            System.out.println("Смотрим справа "+d.peekRight());
            System.out.println("Удаляем справа "+d.removeRight());
            System.out.println("Смотрим справа "+d.peekRight());
            System.out.println("Удаляем справа "+d.removeRight());
            System.out.println("Смотрим справа "+d.peekRight());
            System.out.println("Удаляем слева "+d.removeLeft());
            System.out.println("Смотрим справа "+d.peekRight());
            System.out.println("Удаляем слева "+d.removeLeft());
            System.out.println("Смотрим справа "+d.peekRight());

        } catch (DequeException e) {
            System.out.println(e.getMessage());
            System.out.println("Невозможная операция. Работа с деком прекращена");
        }
    }

    private static void DequeAsQueueTest() {
        try {
            System.out.println("Проверяем на примере из урока");
            Deque q = new DequeImpl(5);
            q.insertLeft(11);
            q.insertLeft(22);
            q.insertLeft(33);
            q.insertLeft(44);
            q.insertLeft(55);
            System.out.println(Arrays.toString(((DequeImpl) q).getDequeArray()));
            q.removeRight();
            q.removeRight();

            q.insertLeft(66);
            q.insertLeft(77);

            while (!q.isEmpty()) {
                int n = q.removeRight();
                System.out.println(n);
            }
        } catch (DequeException e) {
            System.out.println(e.getMessage());
        }
    }
}

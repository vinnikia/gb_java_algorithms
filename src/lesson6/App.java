package lesson6;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        int MAX_DEPTH = 6;
        int balanced = 0;
        int notBalanced = 0;

        //строим 20 деревьев, пока не будет 6 уровней
        for(int t = 1; t <=20; t++) {
            int currentDepth = 0;
            Tree tree = new Tree();
            while (currentDepth < MAX_DEPTH) {
                int i = randomNumber(-100, 100);
                tree.insert(i);
                currentDepth = tree.depth(tree.root);
            }

            //tree.order(tree.root);
            if(tree.isBalanced()) {
                System.out.println("Дерево "+t+" сбалансировано");
                balanced++;
            } else {
                System.out.println("Дерево "+t+" не сбалансировано");
                notBalanced++;
            }
        }

        int rate = notBalanced * 100 / (balanced + notBalanced);
        System.out.println("Процент несбалансированных деревьев = "+rate+"%");


    }

    private static int randomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}

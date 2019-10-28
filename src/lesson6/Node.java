package lesson6;

public class Node {

    int elem;
    Node leftChild;
    Node rightChild;

    void display() {
        System.out.println(String.format("Node key is %d", elem));
    }

}
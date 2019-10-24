package lesson6;

public class Tree {

    Node root;

    Node find(int e) {
        Node current = root;
        while (current.elem != e) {
            if (e < current.elem) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    void insert(int e) {
        Node node = new Node();
        node.elem = e;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (e < current.elem) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }

            }
        }
    }

    void order(Node root) {
        if (root != null) {
            order(root.leftChild);
            root.display();         //посещение узла
            order(root.rightChild);
        }
    }

    Node min() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last; //самый левый лист
    }


    Node max() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    boolean delete(int e) {
        Node current = root;
        Node parent = root;

        boolean isLeftChild = true;

        while (current.elem != e) {
            parent = current;
            if (e < current.elem) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        //если нет потомков
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }
        //если нет левого потомка, то узел заменяется правым поддеревом
        else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        //если нет правого потомка, то узел заменяется левым поддеревом
        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        }
        //если есть два потомка
        else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    //глубина дерева (поддерева)
    int depth(Node node) {
        if (node == null) {
            return -1; // пустое значение
        } else {
            int leftDepth = depth(node.leftChild);
            int rightDepth = depth(node.rightChild);
            int higherDepth = (leftDepth > rightDepth ) ? leftDepth : rightDepth;

            return higherDepth + 1;
        }
    }

    //сбалансировано ли
    boolean isBalanced() {
        return Math.abs(depth(root.leftChild) - depth(root.rightChild)) <= 1;
    }


}



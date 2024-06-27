package binary_tree;

import java.util.Objects;

public class BinaryTree <V extends Comparable<V>>{

    private final Node<V> root;

    public BinaryTree(V value) {
        this.root = new Node<>(value);
    }

    public void insert(V value) {
        insertRec(this.root,value);
    }

    public boolean remove(V value) {
        return false;
    }


    private void insertRec(Node<V> node, V value) {
        if(node.getLeft() == null && node.getRight() == null) {
            if(node.getValue().compareTo(value) > 0) {
                node.setLeft(new Node<>(value));
            }
            else {
                node.setRight(new Node<>(value));
            }
        }
        else if(node.getLeft() == null && node.getValue().compareTo(value) > 0) {
            node.setLeft(new Node<>(value));
        }
        else if(node.getRight() == null && node.getValue().compareTo(value) <= 0) {
            node.setRight(new Node<>(value));
        }
        else {
            if(node.getValue().compareTo(value) > 0) {
                insertRec(node.getLeft(),value);
            }
            else {
                insertRec(node.getRight(),value);
            }
        }

    }

    public void printBinaryTree() {
        StringBuilder stringBuilder = new StringBuilder();
        printBinaryTreeRec(this.root,stringBuilder);
    }

    private void printBinaryTreeRec(Node<V> node, StringBuilder buffer) {
        if(node.getLeft() == null && node.getRight() == null) {
            buffer.append(node.getValue());
        } else {
            if(node.getLeft() != null) {
                printBinaryTreeRec(node.getLeft(),buffer);
            }
            if(node.getRight() != null) {
                printBinaryTreeRec(node.getRight(), buffer);
            }
        }
    }

    public Node<V> getRoot() {
        return root;
    }
}

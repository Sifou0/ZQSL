package binary_tree;

public class Node<V extends Comparable<V>>{
    private final V value;
    private Node<V> left; // Strictly inferior
    private Node<V> right; // Equal or superior

    public Node( V value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    public V getValue() {
        return value;
    }

    public Node<V> getLeft() {
        return left;
    }

    public Node<V> getRight() {
        return right;
    }

    public void setLeft(Node<V> left) {
        this.left = left;
    }

    public void setRight(Node<V> right) {
        this.right = right;
    }

    // TO DO:
    // Format string
    // insert
    // delete

}

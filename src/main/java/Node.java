public class Node<T> {
    private static final int MAX_KEYS = 10;
    private int n;
    private boolean isLeaf;
    Node<T> parent;
    private T[] keys; // SIZE = MAX_KEYS-1
    Node<T>[] children; // SIZE = MAX_KEYS
}

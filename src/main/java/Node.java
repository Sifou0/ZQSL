import java.util.Arrays;

public class Node<T> {
    private static final int MAX_KEYS = 10;
    private int n;
    private boolean isLeaf;
    Node<T> parent;
    private T[] keys; // SIZE = MAX_KEYS-1
    Node<T>[] children; // SIZE = MAX_KEYS

    private void insert(T element) {}

    private T read(int index) {
        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "n=" + n +
                ", isLeaf=" + isLeaf +
                ", parent=" + parent +
                ", keys=" + Arrays.toString(keys) +
                ", children=" + Arrays.toString(children) +
                '}';
    }

}


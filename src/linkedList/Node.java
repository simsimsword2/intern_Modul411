package linkedList;

import compare.Item;

public class Node<T> {

    private Node<T> nextNode;
    private T value;

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node(T value) {
        this.value = value;
    }

    public Node(Node<T> nextNode, T value) {
        this.nextNode = nextNode;
        this.value = value;
    }
}

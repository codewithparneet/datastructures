package linkedlist;

import java.util.LinkedList;

/**
 * Empty list
 * Single element
 * Beginning
 * Ending
 * Middle
 *
 * @param <E>
 */
public class LinkedListSetup<E> {
    Node<E> head, tail;
    int currentSize;

    public LinkedListSetup() {
        head = tail = null;
    }

    public void addFirst(E input) {
        Node<E> node = new Node<>();
        // empty list
        if (head == null && tail == null) {
            node.data = input;
            head = tail = node;
        }
        node.data = input;
        node.next = head;
        head = node;
        currentSize++;
    }

    public E getElement(int index) {
        if (head == null && tail == null) {
            return null;
        }

        if (head == tail) {
            return head.data;
        }

        for (int i = 0; i <= index; i++) {
            return null;
        }
        return null;
    }

    private static class Node<E> {
        E data;
        Node<E> next;
    }
}
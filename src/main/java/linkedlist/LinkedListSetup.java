package linkedlist;

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
            currentSize++;
            return;
        }
        node.data = input;
        node.next = head;
        head = node;
        currentSize++;
    }

    public void addLast(E input) {
        // empty list
        if (head == null && tail == null) {
            addFirst(input);
            return;
        }

        Node<E> node = new Node<>();
        node.data = input;
        if (head == tail) {
            head.next = node;
            tail = node;
            currentSize++;
            return;
        }

        tail.next = node;
        tail = node;
        currentSize++;
    }

    public E getElement(int index) {
        if (head == null) {
            return null;
        }
        if (index == 0) {
            return head.data;
        }

        if (index == currentSize - 1) {
            return tail.data;
        }

        if (index >= currentSize) {
            return null;
        }

        int i = 0;
        Node<E> curr = head;
        while (i <= index) {
            curr = curr.next;
            i++;
            if (i == index) {
                return curr.data;
            }
        }
        return null;
    }


    public void removeFirst() {
        if (head == null && tail == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
            currentSize--;
            return;
        }

        head = head.next;
        currentSize--;
    }

    public void removeLast() {
        if (head == null && tail == null) {
            return;
        }

        if (head == tail) {
            removeFirst();
        }
        Node<E> current = head;
        int secondLastElementIndex = currentSize - 2;
        int i = 0;

        while (i < currentSize) {
            current = current.next;
            i++;
            if (i == secondLastElementIndex) {
                tail = current;
                currentSize--;
                return;
            }
        }

    }

    private static class Node<E> {
        E data;
        Node<E> next;
    }
}
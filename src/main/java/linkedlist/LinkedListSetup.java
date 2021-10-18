package linkedlist;

/**
 * Five Conditions to look for when writing data structures libraries:
 * 1) Empty data structure
 * 2) Single element in the data structure
 * 3) Adding/Removing beginning of the data structure
 * 4) Adding/Removing end of the data structure
 * 5) Working in the middle
 *
 * @param <E>
 */
public class LinkedListSetup<E> {
    Node<E> head, tail;
    int currentSize;

    public LinkedListSetup() {
        head = tail = null;
    }

    /**
     * Time complexity = O(1).
     * @param input new node
     */
    public void addFirst(E input) {
        Node<E> node = new Node<>(input);
        // empty list
        if (head == null && tail == null) {
            head = tail = node;
            currentSize++;
            return;
        }
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

        Node<E> node = new Node<>(input);
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

    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E obj) {
            data = obj;
            next = null;
        }
    }
}
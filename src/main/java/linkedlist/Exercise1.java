package linkedlist;

import java.util.LinkedList;

/**
 * Remove duplicates from an unsorted linked list
 */
public class Exercise1 {
    public static void main(String[] args) {
        LinkedListSetup<Integer> list = new LinkedListSetup<>();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        for (int i = 0; i < list.currentSize; i++) {
            System.out.println();
        }
    }
}

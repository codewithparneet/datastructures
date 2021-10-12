package linkedlist;

/**
 * Remove duplicates from an unsorted linked list
 */
public class Exercise1 {
    public static void main(String[] args) {
        LinkedListSetup<Integer> list = new LinkedListSetup<>();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("current size is: " + list.currentSize);
        for (int i = 0; i < list.currentSize; i++) {
            System.out.println(list.getElement(i));
        }
        System.out.println("***************");
        list.removeLast();
        System.out.println("current size is: " + list.currentSize);
        for (int i = 0; i < list.currentSize; i++) {
            System.out.println(list.getElement(i));
        }
    }
}

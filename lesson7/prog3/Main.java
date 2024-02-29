package lesson7.prog3;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Test inserting elements
        list.insert(0, 10); // Insert at the head
        list.insert(1, 20); // Insert at the tail
        list.insert(1, 15); // Insert in the middle
        list.insert(0, 5);  // Insert at the head again
        list.insert(4, 25); // Insert at the end, beyond current size

        System.out.println("After insertions:");
        list.traverseLinkedList(); // Expected: 5 -> 10 -> 15 -> 20 -> 25

        // Test removing elements
        list.remove(0); // Remove from the head
        System.out.println("\nAfter removing from head:");
        list.traverseLinkedList(); // Expected: 10 -> 15 -> 20 -> 25

        list.remove(2); // Remove from the middle
        System.out.println("\nAfter removing from middle:");
        list.traverseLinkedList(); // Expected: 10 -> 15 -> 25

        list.remove(2); // Remove from the tail
        System.out.println("\nAfter removing from tail:");
        list.traverseLinkedList(); // Expected: 10 -> 15

        // Test getting node
        Node node = list.getNode(1);
        if (node != null) {
            System.out.println("\nValue at index 1: " + node.value); // Expected: 15
        } else {
            System.out.println("\nNo node found at index 1");
        }

        // Test removeAll
        list.removeAll();
        System.out.println("\nAfter removing all elements:");
        list.traverseLinkedList(); // Expected: No output (list is empty)

        // Test inserting after removeAll
        list.insert(0, 30);
        System.out.println("\nAfter inserting into empty list:");
        list.traverseLinkedList(); // Expected: 30
    }
}

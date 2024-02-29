package lesson7.prog5;

public class Main {
    public static void main(String[] args) {
        CircularSingleLinkedList list = new CircularSingleLinkedList();

        // Insert elements
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 4); // List now: 1 -> 2 -> 3 -> 4

        System.out.println("List after insertions:");
        list.traverse();

        // Remove elements
        list.removeNode(0); // Remove head
        System.out.println("\nList after removing head:");
        list.traverse(); // Expected: 2 -> 3 -> 4

        list.removeNode(2); // Remove tail
        System.out.println("\nList after removing tail:");
        list.traverse(); // Expected: 2 -> 3

        // Remove all elements
        list.removeAll();
        System.out.println("\nList after removing all elements:");
        list.traverse(); // Expected: No output (list is empty)

        // Re-insert and test get method
        list.insert(0, 5);
        list.insert(1, 6); // List now: 5 -> 6
        System.out.println("\nList after re-insertions:");
        list.traverse(); // Expected: 5 -> 6

        Node node = list.get(1);
        System.out.println("\nValue at location 1: " + (node != null ? node.value : "Not Found"));
    }
}

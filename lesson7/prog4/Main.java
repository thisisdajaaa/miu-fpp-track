package lesson7.prog4;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Insert elements
        list.insert(0, 1); // Insert at head
        list.insert(1, 3); // Insert at index 1
        list.insert(2, 5); // Insert at tail
        list.insert(1, 2); // Insert in middle
        list.insert(3, 4); // Insert in middle, before the tail

        System.out.println("Forward Traversal:");
        list.traverseList(); // Expected: 1 -> 2 -> 3 -> 4 -> 5
        System.out.println("\nReverse Traversal:");
        list.reverseTraverseList(); // Expected: 5 -> 4 -> 3 -> 2 -> 1

        // Remove elements
        list.remove(0); // Remove head
        System.out.println("\nAfter removing head:");
        list.traverseList(); // Expected: 2 -> 3 -> 4 -> 5

        list.remove(3); // Remove tail
        System.out.println("\nAfter removing tail:");
        list.traverseList(); // Expected: 2 -> 3 -> 4

        list.remove(1); // Remove from middle
        System.out.println("\nAfter removing from middle:");
        list.traverseList(); // Expected: 2 -> 4

        // Check getNode
        Node node = list.getNode(1); // Get node at index 1
        System.out.println("\nValue at index 1: " + (node != null ? node.value : "Node not found"));
    }
    // The rest of the Main class implementation...
}

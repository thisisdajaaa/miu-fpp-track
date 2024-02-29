package lesson7.prog6;

public class Main {
    public static void main(String[] args) {
        CircularDoubleLinkedList list = new CircularDoubleLinkedList();

        // Insert elements
        list.insert(0, 1); // Insert at the beginning
        list.insert(1, 2); // Insert at the end
        list.insert(1, 3); // Insert in the middle
        list.insert(3, 4); // Insert at the end (now 1 -> 3 -> 2 -> 4)
        list.insert(0, 5); // Insert at the beginning (now 5 -> 1 -> 3 -> 2 -> 4)

        System.out.println("List after insertions:");
        list.traverse(); // Should print: 5 -> 1 -> 3 -> 2 -> 4

        // Remove elements
        list.remove(0); // Remove from the beginning
        System.out.println("\nList after removing the first element:");
        list.traverse(); // Should print: 1 -> 3 -> 2 -> 4

        list.remove(2); // Remove from the middle (index 2)
        System.out.println("\nList after removing the third element:");
        list.traverse(); // Should print: 1 -> 3 -> 4

        list.remove(2); // Remove the last element
        System.out.println("\nList after removing the last element:");
        list.traverse(); // Should print: 1 -> 3

        // Remove all
        list.removeAll();
        System.out.println("\nList after removing all elements:");
        list.traverse(); // Should print nothing
    }
}

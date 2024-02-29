package lesson7.prog4;

public class DoubleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void insert(int location, int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) { // List is empty
            head = tail = node; // Simplified assignment
        } else if (location == 0) { // Insert at head
            node.next = head;
            head.prev = node;
            head = node;
        } else if (location >= size) { // Insert at tail
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else { // Insert in the middle
            Node temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            if (temp.next != null) { // Check to prevent a NullPointerException
                temp.next.prev = node;
            }
            temp.next = node;
            node.prev = temp;
        }

        size++;
    }

    public void traverseList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) System.out.print(" -> ");
            currentNode = currentNode.next;
        }
        System.out.println(); // Add a new line for better readability
    }

    public void reverseTraverseList() {
        Node currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.prev != null) System.out.print(" -> ");
            currentNode = currentNode.prev;
        }
        System.out.println(); // Add a new line for better readability
    }

    public Node getNode(int location) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null && index < location) {
            currentNode = currentNode.next;
            index++;
        }
        return currentNode; // Will return null if location is out of bounds
    }

    public void remove(int location) {
        if (isEmpty() || location < 0 || location >= size) return; // Validate location

        if (location == 0) { // Remove head
            head = head.next;
            if (head == null) {
                tail = null; // List is now empty
            } else {
                head.prev = null;
            }
        } else if (location == size - 1) { // Remove tail
            tail = tail.prev;
            tail.next = null;
        } else { // Remove from middle
            Node temp = head;
            for (int i = 0; i < location; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        size--;
    }

    public boolean isEmpty() {
        return size == 0; // Simpler to use size for checking emptiness
    }
}

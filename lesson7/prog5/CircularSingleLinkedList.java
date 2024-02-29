package lesson7.prog5;

public class CircularSingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void insert(int location, int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = tail = node;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.next = head;
            tail.next = node;
            tail = node;
        } else {
            Node currentNode = head;
            int index = 0;

            while (index < location - 1) {
                currentNode = currentNode.next;
                index++;
            }

            Node temp = currentNode.next;
            currentNode.next = node;
            node.next = temp;
        }

        size++;
    }

    public void traverse() {
        if (isEmpty()) return;

        Node currentNode = head;

        do {
            System.out.print(currentNode.value);
            if (currentNode.next != head) System.out.print(" -> ");
            currentNode = currentNode.next;
        } while (currentNode != head);
    }

    public Node get(int location) {
        if (isEmpty()) return null;

        Node currentNode = head;
        int index = 0;

        while (index != location) {
            currentNode = currentNode.next;
            index++;
        }

        return currentNode;
    }

    public void removeNode(int location) {
        if (head == null) {
            return;
        }
        if (size == 1) { // Only one element in the list
            head = tail = null;
        } else if (location == 0) { // Removing head
            head = head.next;
            tail.next = head;
        } else { // Removing any other element
            Node currentNode = head;
            for (int i = 0; i < location - 1; i++) {
                currentNode = currentNode.next; // Find the node just before the one to remove
            }
            if (currentNode.next == tail) { // If removing tail
                tail = currentNode;
            }
            currentNode.next = currentNode.next.next; // General case removal
            if (location == size - 1) {
                tail = currentNode; // Update tail if we're removing the last element
            }
        }

        size--;
    }



    public boolean isEmpty() {
        return head == null && size == 0;
    }

    public void removeAll() {
        if (head != null) {
            head = tail = null;
            size = 0;
        }
    }

}

package lesson7.prog3;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void insert(int location, int value) {
        Node node = new Node();
        node.value = value;

        // No head or empty linked list
        if (head == null) {
            node.next = null;
            head = node;
            tail = node;
        // if attempting to insert at head node
        } else if (location == 0) {
            node.next = head;
            head = node;
        // if attempting to insert at last node
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        // if attempting to insert inside
        } else {
            Node currentNode = head;
            int index = 0;

            while(index < location - 1) {
              currentNode = currentNode.next;
              index++;
            }

            // holds value to be moved
            Node temp = currentNode.next;
            currentNode.next = node;
            node.next = temp;
        }

        size++;
    }

    public void traverseLinkedList() {
        if (isEmpty()) return;

        Node currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.value);
            if(currentNode.next != null) System.out.print(" -> ");
            currentNode = currentNode.next;
        }
    }

    public Node getNode(int location) {
        Node currentNode = head;
        int index = 0;

        if (size == 1 && location == 0) return head;

        while(currentNode != null) {
            if(index == location) return currentNode;

            currentNode = currentNode.next;
            index++;
        }

        return null;
    }

    public void remove(int location) {
        if (head == null) return; // List is empty, nothing to remove

        if (location == 0) { // Removing the head node
            head = head.next;
            if (head == null) tail = null; // If the list became empty
        } else {
            Node previousNode = head;
            for (int i = 0; i < location - 1 && previousNode.next != null; i++) {
                previousNode = previousNode.next;
            }

            if (previousNode.next != null) {
                previousNode.next = previousNode.next.next;
            } else {
                tail = previousNode;
            }
        }

        size--;
    }


    private boolean isEmpty() {
        return head == null && size == 0;
    }

    public void removeAll() {
        head = null;
        tail = null;
        size = 0;
    }
}

package org.infraxx.tests.cs.adt.list;

public class SinglyLinkedListSimple {
    private Node head;

    private static class Node {
        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int data) {
        Node first = new Node(data, head);
        head = first;
    }

    public int deleteFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        Node newHead = head.next;
        head.next = null;
        int ret = head.data;
        head = newHead;

        return ret;
    }

    public void insertLast(int data) {
        if (isEmpty()) {
            insertFirst(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data, null);
    }

    public int get(int i) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        Node current = head;
        for (int k = 0; k < i; k++) {
            if (current.next == null){
                return -1;
            }

            current = current.next;
        }

        return current.data;
    }

    public int delete(int i) {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        Node current = head;
        int k = 0;
        while (current.next != null && k < i) {
            current = current.next;
            k++;
        }

        if (k == i) {
            return current.data;
        }
        else {
            return -1;
        }
    }

    public boolean loopExists() {
        if (isEmpty()) {
            return false;
        }

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

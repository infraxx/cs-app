package org.infraxx.tests.cs.adt.list;

public class DoublyLinkedListSimple {
    private static class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}

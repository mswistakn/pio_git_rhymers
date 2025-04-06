package edu.kis.vh.nursery.list;

/**
 * Klasa implementuje dynamiczną listę jednokierunkową dla intów,
 * dostępne metody to: push, isEmpty, isFull, top, pop
 */
public class IntLinkedList {

    private static final int RETURN_MINUS_ONE = -1;
    private Node last;

    /**
     * Dodaje podany element i do listy na sam koniec
     * @param i wartosc do dodania do listy
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Zwraca czy lista jest pusta
     * @return true jezeli pusta, false jeżeli nie
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Zwraca czy lista jest pełna
     * @return true jeżeli pełna, false jeżeli nie
     */

    // TODO: W zaimplementowanej strukturze listy funkcja zawsze zwraca false - jest niepotrzebna
    public boolean isFull() {
        return false;
    }

    /**
     * Bez usuwania zwraca ostatni element listy
     * @return wartość ostatniego elementu listy albo -1 w przypadku gdy lista jest pusta
     */
    public int top() {
        if (isEmpty())
            return RETURN_MINUS_ONE;
        return last.getValue();
    }

    /**
     * Zwraca ostatni element listy z usunięciem go
     * @return wartosc ostatniego elementu listy albo -1 w przypadku gdy lista jest pusta
     */
    public int pop() {
        if (isEmpty())
            return RETURN_MINUS_ONE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Klasa wewnętrzna przedstawiająca pojedynczy element listy
     */
    private static class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
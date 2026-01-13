package gr.aueb.cf.cf9.ch17.singly_linked_list;
/*
these are the functionalities tha we need in our singly linked lists
 */

public class SingleList<T> {
    private Node<T> head = null;

    public void insertFirst(T t) { //insert in the beginning of the list
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head); //the old first node that now is the next to our new insertion
        head = tmp; // the new head should be our new insertion
    }

    /**
     * Time-complexity O(n)
     * @param t
     */
    public void insertLast(T t) { //insert in the last postion of the list
        Node<T> tmp = new Node<>(); //we create the new node
        tmp.setItem(t);
        tmp.setNext(null);

        if (isEmpty()) { //if the list is empty we simply call the insert function we built before
            insertFirst(t);
            return;
        }

        Node<T> n; //else we traverse the list until we the last node, so n becomes null
        for (n = head; n.getNext() != null; n = n.getNext());

        n.setNext(tmp);
    }

    public Node<T> removeFirst() {
        if (isEmpty()) return null;
        Node<T> tmp = head;
        head = head.getNext(); // we point to the next head as head so we omit the first node
        return tmp;
    }

    public Node<T> removeLast() {

        // if the list is empty or has only one element
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n = n.getNext()) {}

        Node<T> nodeToReturn = n.getNext(); // we point null to the node before the last one
        n.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public int size() {
        int counter = 0;
        for (Node<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
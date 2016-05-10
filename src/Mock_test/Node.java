package Mock_test;

//implementing node
public class Node {
    private Node head;
    private Node tail;
    private Node next;
    private int item;
    private int listSize;

    //initial constructor
    Node() {
        this.head = null;
        this.tail = head;
        this.listSize = 0;
    }

    Node(int item) {
        this.item = item;
        next = null;
    }

    //getters and setters
    public int getListSize() {
        return listSize;
    }

    public void addListSize() {
        this.listSize++;
    }

    public int getItem() {
        return this.item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //1. adding before the head
    public void addToHead(int item) {
        Node newNode = new Node(item);
        if (getListSize() == 0) {
            this.head = newNode;
            this.tail = head;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        addListSize();
    }

    //2. adding to the tail
    public void addToTail(int item) {
        Node newNode = new Node(item);
        if (getListSize() == 0) {
            this.head = newNode;
            this.tail = head;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        addListSize();
    }


    //*. Print out LinkedList
    @Override
    public String toString() {
        Node thisNode = this.head;
        StringBuilder sb = new StringBuilder();
        while (thisNode != null) {
            sb.append("[");
            sb.append(thisNode.getItem());
            sb.append("]");
            thisNode = thisNode.getNext();
        }
        return sb.toString();
    }


}

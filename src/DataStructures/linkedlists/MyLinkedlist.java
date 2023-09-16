package DataStructures.linkedlists;

public class MyLinkedlist {

    private Integer first;
    private MyNode head = new MyNode();

    private MyNode tail = new MyNode();

    private Integer size;

    private Integer last;

    public MyLinkedlist(Integer first) {
        this.first = first;
        this.last = first;
        this.head.setValue(first);
        this.head.setNext(null);
        this.tail.setValue(first);
        this.tail.setNext(null);
        this.size = 1;
    }

    public Integer getFirst() {
        return first;
    }

    public MyNode getHead() {
        return head;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getLast() {
        return last;
    }

    public void append(Integer value) {
        MyNode newNode = new MyNode(value, null);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.last = value;
        this.size++;
    }

    public void prepend(Integer value) {
        MyNode newNode = new MyNode(value, null);
        this.head.setNext(newNode);
        this.size++;
    }
}

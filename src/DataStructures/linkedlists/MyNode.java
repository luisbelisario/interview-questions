package DataStructures.linkedlists;

public class MyNode {

    private Integer value;
    private MyNode next;

    public MyNode() {
    }

    public MyNode(Integer value, MyNode next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}

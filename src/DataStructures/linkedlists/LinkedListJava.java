package DataStructures.linkedlists;

import java.util.LinkedList;

public class LinkedListJava {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(10);
        linkedList.addFirst(20);
        linkedList.addLast(30);
        linkedList.add(2, 15);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));
    }
}

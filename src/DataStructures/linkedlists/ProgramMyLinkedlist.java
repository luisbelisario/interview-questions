package DataStructures.linkedlists;

public class ProgramMyLinkedlist {

    public static void main(String[] args) {
        MyLinkedlist myLinkedlist = new MyLinkedlist(10);

        System.out.println(myLinkedlist.getFirst());
        System.out.println(myLinkedlist.getSize());

        myLinkedlist.append(20);

        System.out.println(myLinkedlist.getFirst());
        System.out.println(myLinkedlist.getLast());
        System.out.println(myLinkedlist.getSize());

        myLinkedlist.prepend(5);


    }
}

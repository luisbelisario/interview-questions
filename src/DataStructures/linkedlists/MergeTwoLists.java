package DataStructures.linkedlists;

public class MergeTwoLists {

    public static void main(String[] args) {
        ListNode listAux2 = new ListNode(4, null);
        ListNode listAux1 = new ListNode(2, listAux2);
        ListNode list1 = new ListNode(1, listAux1);

        ListNode list2Aux2 = new ListNode(4, null);
        ListNode list2Aux1 = new ListNode(3, list2Aux2);
        ListNode list2 = new ListNode(1, list2Aux1);
        ListNode finalList = mergeTwoLists(list1, list2);

        while (finalList.next != null) {
            System.out.println(finalList.val);
            finalList = finalList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode current = prehead;
        prehead.next = current;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 == null){
            current.next = list2;
        }else{
            current.next = list1;
        }

        return prehead.next;
    }
}


public class AddTwoNumbers {
    public static void main(String[] args) {
        // addTwoNumbers(["7","2","4","3"], ["5","6","4"]);
    }

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = reverseList(l1);
        ListNode list2 = reverseList(l2);

        int carry = 0;
        ListNode dummy = new ListNode(0);

        while (list1 != null || list2 != null) {
            int x = (list1 != null) ? list1.val : 0;
            int y = (list2 != null) ? list2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            dummy.val = sum % 10;

            ListNode node = new ListNode(carry);

            node.next = dummy;
            dummy = node;

            if (list1 != null) list1 = list1.next;
            if (list2 != null) list2 = list2.next;
        }

        if(carry == 0) {
            return dummy.next;
        }
        return dummy;
    }

     public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;

    }
}

   


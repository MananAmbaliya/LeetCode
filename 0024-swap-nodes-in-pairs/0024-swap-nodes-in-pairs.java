class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode save = dummy;

        while (save.next != null && save.next.next != null) {

            ListNode first = save.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            save.next = second;

            save = first;
        }

        return dummy.next;
    }
}
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode prev = head;
        ListNode curr = head;

        while(curr != null) {
            while(curr != null && curr.val == prev.val) {
                curr = curr.next;
            }
            prev.next = curr;
            prev = prev.next;
        }

        return head;
    }
}
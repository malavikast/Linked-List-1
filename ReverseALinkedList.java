// Time Complexity : O(n)
// Space Complexity : O(n)  , stack space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode reversed = reverseList(head.next);
        head.next.next = head; // changing the direction of the link
        head.next = null; // deleting old link
        return reversed;

    }
}
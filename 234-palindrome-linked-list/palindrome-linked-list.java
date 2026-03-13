/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode firsthalf = head;
        ListNode mid = middle(head);
        ListNode secondhalf = reverse(mid);

        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val) {
                return false;
            }
            else{
                firsthalf = firsthalf.next;
                secondhalf = secondhalf.next;
            }
    }
    return true;
    }
    private ListNode middle(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }
        private ListNode reverse(ListNode head){
            ListNode curr = head;
            ListNode pre = null;
            ListNode after = null;
            while(curr != null){
                after = curr.next;
                curr.next = pre;
                pre = curr;
                curr = after;
            }
        return pre;
        }

}
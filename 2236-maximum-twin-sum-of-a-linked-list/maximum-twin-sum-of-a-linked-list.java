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
    public int pairSum(ListNode head) {

        ListNode firsthalf = head;
        ListNode mid = middle(head);
        ListNode secondhalf = reverse(mid);
        int maxSum = 0;
        int curSum = 0;

        while(secondhalf != null){

                curSum = firsthalf.val + secondhalf.val;
                if(curSum > maxSum){
                    maxSum = curSum;
                }
                
                firsthalf = firsthalf.next;
                secondhalf = secondhalf.next;
            }
        return maxSum;
    }

    private ListNode middle(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
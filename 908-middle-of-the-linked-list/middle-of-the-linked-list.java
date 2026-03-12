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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        temp = head;
        int middle = length / 2;

        if(middle % 2 == 0){
            for(int i=1; i<=middle; i++){
                temp = temp.next;
            }
        }
        else{
            for(int i=1; i<=middle; i++){
                temp = temp.next;
            }
        }
        return temp;

    }
}
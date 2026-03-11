/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        int m = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            m++;
        }
        ListNode temp2 = headB;
        int n = 0;
        while(temp2 != null){
            temp2 = temp2.next;
            n++;
        }

        temp1 = headA;
        temp2 = headB;

        if(m > n){
            for(int i=1; i<=m-n; i++){
                temp1 = temp1.next;
            } 
        }
        else{
            for(int i=1; i<=n-m; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != null && temp2 != null){
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
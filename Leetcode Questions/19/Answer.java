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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null && n == 1){
            return null;
        } 

        int count = 0;
        ListNode ptr = head;

        while(ptr != null){
            ptr = ptr.next;
            count++;
        }

        if(count == n){
            return head.next;
        }

        count -= n;
        ptr = head;
        for(int i = 1; i < count; i++){
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return head;
    }
}

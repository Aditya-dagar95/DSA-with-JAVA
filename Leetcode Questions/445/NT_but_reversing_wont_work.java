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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int num1 = 0, num2 = 0;

        while(l1 != null){
            num1 = num1 * 10 + l1.val%10;
            l1 = l1.next;
        }
        while(l2 != null){
            num2 = num2 * 10 + l2.val%10;
            l2 = l2.next;
        }

        int sum = num1 + num2;

        ListNode dummyHead = new ListNode();
        ListNode ptr = dummyHead;

        if(sum == 0){
            ptr.val = 0;
            return ptr;
        }

        while(sum != 0){
            ptr.next = new ListNode(sum%10);
            ptr = ptr.next;

            sum /= 10;
        }

        ListNode prev = null, next = null;
        ptr = dummyHead.next;

        while(ptr != null){
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }
        return prev;
    }
}

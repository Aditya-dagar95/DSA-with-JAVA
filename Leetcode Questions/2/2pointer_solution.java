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
        
        ListNode dummyHead = new ListNode();
        ListNode ptr = dummyHead;
        int carry = 0;

        while(l1 != null || l2 != null || carry == 1){

            int num1 = (l1 != null)? l1.val: 0;
            int num2 = (l2 != null)? l2.val: 0;

            int sum = num1 + num2 + carry;

            if(sum > 9){
                carry = 1;

                ListNode temp = new ListNode(sum%10);
                ptr.next = temp;
                ptr = ptr.next;
            }else{
                ListNode temp = new ListNode(sum);
                ptr.next = temp;
                ptr = ptr.next;

                carry = 0;
            }

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        return dummyHead.next;
    }
}

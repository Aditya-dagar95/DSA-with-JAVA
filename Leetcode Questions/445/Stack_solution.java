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
        
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        
        while(l1 != null){
            stk1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stk2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;

        int carry = 0;
        while(!stk1.isEmpty() || !stk2.isEmpty() || carry == 1){

            int num1 = (stk1.isEmpty())? 0: stk1.pop();
            int num2 = (stk2.isEmpty())? 0: stk2.pop();

            int sum = num1 + num2 + carry;

            carry = sum/10;
            sum %= 10;

            ListNode temp = new ListNode(sum, head);
            head = temp;
        }

        return head;
    }
}

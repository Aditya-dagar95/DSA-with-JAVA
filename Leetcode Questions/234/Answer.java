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

        if(head.next == null){
            return true;
        }

        ListNode ptr = head;
        int count = 0;

        while(ptr != null){
            count ++;
            ptr = ptr.next;
        }

        int[] arr = new int[count];
        ptr = head;

        for(int i = 0; i < count; i++){
            arr[i] = ptr.val;
            ptr = ptr.next;
        }

        for(int left = 0, right = count - 1; left < right; left++, right--){
            if(arr[left] != arr[right]){
                return false;
            }
        }
        return true;
    }
}

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
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode ptr = headA;

        for(int i = 0; ptr != null; i++){
            map.put(ptr, i);
            ptr = ptr.next;
        }

        ptr = headB;

        while(ptr != null){
            if(map.containsKey(ptr)){
                return ptr;
            }
            ptr = ptr.next;
        }        

        return null;
    }
}

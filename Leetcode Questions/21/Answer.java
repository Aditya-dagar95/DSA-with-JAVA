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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null, pt3 = null;
        ListNode pt1 = list1, pt2 = list2;
        boolean first = true;

        if(pt1 == null && pt2 == null){
            return null;
        }

        while(pt1 != null && pt2 != null){
            if(pt1.val <= pt2.val){
                if(first){
                    ListNode temp = new ListNode(pt1.val);
                    res = temp;
                    pt3 = temp;
                    first = false;
                    
                }else{
                    ListNode temp = new ListNode(pt1.val);
                    pt3.next = temp;
                    pt3 = pt3.next;
                }
                pt1 = pt1.next;
            } else{
                if(first){
                    ListNode temp = new ListNode(pt2.val);
                    res = temp;
                    pt3 = res;
                    first = false;
                }else{
                    ListNode temp = new ListNode(pt2.val);
                    pt3.next = temp;
                    pt3 = pt3.next;
                }
                pt2 = pt2.next;
            }
        }

        while(pt1 != null || pt2 != null){
            if(pt1 == null && pt2 != null){
                if(first){
                    ListNode temp = new ListNode(pt2.val);
                    res = temp;
                    pt3 = res;
                    first = false;
                    pt2 = pt2.next;
                    continue;
                }
                ListNode temp = new ListNode(pt2.val);
                pt2 = pt2.next;
                pt3.next = temp;
                pt3 = pt3.next;

            } else if(pt1 != null && pt2 == null){
                if(first){
                    ListNode temp = new ListNode(pt1.val);
                    res = temp;
                    pt3 = res;
                    first = false;
                    pt1 = pt1.next;
                    continue;
                }
                ListNode temp = new ListNode(pt1.val);
                pt1 = pt1.next;
                pt3.next = temp;
                pt3 = pt3.next;
            }
        }
        return res;
    }
}

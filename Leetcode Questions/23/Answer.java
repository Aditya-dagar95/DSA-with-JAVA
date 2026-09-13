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
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0){
            return null;
        }

        ListNode p = null;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < lists.length; i++){       

            p = lists[i];

            while(p != null){

                arr.add(p.val);
                p = p.next;
            }
        }

        arr.sort(null);

        ListNode res = new ListNode();
        p = res;

        for(int num : arr){
            ListNode temp = new ListNode(num);
            p.next = temp;
            p = p.next;
        }

        return res.next;
    }
}

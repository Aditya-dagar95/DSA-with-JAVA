class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int [] bigger = new int[1001];

        for(int i = 0; i < nums1.length; i++){
            bigger[nums1[i]]++;
        }

        ArrayList<Integer> list = new ArrayList();

        for(int i = 0; i < nums2.length; i++){
            if(bigger[nums2[i]] > 0){
                list.add(nums2[i]);
                bigger[nums2[i]]--;
            }
        }


        int [] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}

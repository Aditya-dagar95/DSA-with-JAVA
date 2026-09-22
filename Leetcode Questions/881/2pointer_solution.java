class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0, right = people.length - 1;
        int res = 0;

        Arrays.sort(people);

        while(left <= right){

            int remaining = limit - people[right];
            right--;
            res++;

            if(left <= right && people[left] <= remaining){
                left++;
            }
        }

        return res;
    }
}

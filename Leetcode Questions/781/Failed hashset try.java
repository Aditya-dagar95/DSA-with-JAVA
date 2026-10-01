class Solution {
    public int numRabbits(int[] answers) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for(int num : answers){
            if(num == 0)sum++;
            set.add(num);
        }


        for(int num : set){
            if(num == 0) continue;
            sum += num + 1;
        }

        return sum;
    }
}

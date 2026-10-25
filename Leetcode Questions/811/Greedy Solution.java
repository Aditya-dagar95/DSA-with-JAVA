class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int light = 0, heavy = people.length - 1, boats = 0;

        while(light <= heavy){ 
            int sum = limit, max = 2;
            while(heavy > light && max > 0){ 
                if(sum - people[heavy] < 0) break;
                sum -= people[heavy];
                heavy--;
                max--;
            }
            while(light <= heavy && max  > 0){
                if(sum - people[light] < 0) break;
                sum -= people[light];
                light++;
                max--;
            }
            boats++;
        }
        return boats;
    }
}

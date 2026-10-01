class Solution {
    public int numRabbits(int[] answers) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : answers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        for (int num : map.keySet()) {

            int count = map.get(num);
            int groupSize = num + 1;

            int groups = (count + groupSize - 1) / groupSize;

            sum += groups * groupSize;
        }

        return sum;
    }
}

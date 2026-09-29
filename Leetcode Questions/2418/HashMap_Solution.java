class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer, String> map = new HashMap<>();

        for(int i = 0; i < heights.length; i++){
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] res = new String[names.length];

        for(int i = heights.length - 1, j = 0; i >= 0; i--, j++){
            res[j] = map.get(heights[i]);
        }

        return res;
    }
}

class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        if((changed.length & 1) == 1)return new int[0];

        HashMap < Integer, Integer> map = new HashMap<>();

        for(int num : changed){

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);
        int[] res = new int[changed.length/2];
        int k = 0;

        for(int num : changed){
            
            if (map.get(num) == 0)
                continue;

            if (num == 0) {
                if (map.get(0) < 2)
                    return new int[0];

                res[k++] = 0;
                map.put(0, map.get(0) - 2);
            }
            else {
                if (!map.containsKey(num * 2) || map.get(num * 2) == 0)
                    return new int[0];

                res[k++] = num;

                map.put(num, map.get(num) - 1);
                map.put(num * 2, map.get(num * 2) - 1);
            }
        }

        return res;
    }
}

class Solution {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }

        boolean[] set = new boolean[n];

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(set[i] == false){
                for (int j = i * i; j < n; j += i) {
                    set[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(set[i] == false){
                count++;
            }
        }

        return count;
    }
}

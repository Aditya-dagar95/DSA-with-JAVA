class Solution {
    public void pattern3(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= i+1; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}

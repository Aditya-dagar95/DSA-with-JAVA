class Solution {
    public void pattern2(int n) {
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j > 0; j-- ){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

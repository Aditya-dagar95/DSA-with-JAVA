class Solution {
    public void pattern5(int n) {
        for(int i = 0; i < n; i++){
            for(int j = n - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class Solution {
    public void pattern4(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}

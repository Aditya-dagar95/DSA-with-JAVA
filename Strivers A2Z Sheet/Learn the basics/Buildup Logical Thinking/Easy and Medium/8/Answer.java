class Solution {
    public void pattern8(int n) {
        for(int z = 0; z < n; z++){
            
            for(int j = n - z; j < n; j++){
                System.out.print(" ");
            }
            
            for(int i = n - z; i > 0; i--){
                System.out.print("*");
            }

            for(int k = n - z -1; k > 0; k--){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}

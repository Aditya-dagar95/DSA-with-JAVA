class Solution {
    public void pattern7(int n) {
        for(int z = 1; z <= n; z++){

            for(int i = n - z ; i > 0; i--){
                System.out.print(" ");
            }

            for(int j = 0; j < z; j++){
                System.out.print("*");  
            }

            for( int k = n - z + 1; k < n; k++){
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
    }
}

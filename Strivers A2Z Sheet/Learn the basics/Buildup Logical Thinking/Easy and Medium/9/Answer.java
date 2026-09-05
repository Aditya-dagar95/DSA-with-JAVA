class Solution {
    public void pattern9(int n) {
        for(int z = 0; z < n; z++){

            for(int i = n - z -1; i > 0; i--){
                System.out.print(" ");
            }

            for(int j = z; j >= 0; j--){
                System.out.print("*");
            }

            for(int k = z; k > 0; k--){
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for(int z = 0; z < n; z++){

            for(int j = z; j > 0; j--){
                System.out.print(" ");
            }

            for(int i = n - z; i > 0; i--){
                System.out.print("*");
            }

            for(int k = n - z - 1; k > 0; k--){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}

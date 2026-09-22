class Solution {
    public int[] decrypt(int[] code, int k) {

        int[] res = new int[code.length];
        
        for(int i = 0; i < code.length; i++){
            
            int l = k;
            int sum = 0;

            if(k > 0){
                for(int j = i + 1; l > 0; l--, j++){

                    if(j == code.length){
                        j = 0;
                    }else if(j > code.length){
                        j = 1;
                    }

                    sum += code[j];
                }
            }else if(k < 0){
                for(int j = i - 1; l < 0; l++, j--){

                    if(j < 0){
                        j = code.length - 1;
                    }

                    sum += code[j];
                }
            }

            res[i] = sum;
        }
        return res;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];

        if(temp.length == 1){
            res[0] = 0;
            return res;
        }


        
        for(int i = 0; i < temp.length - 1; i ++){

            boolean consi = true;
            int count = 0;

            for(int j = i + 1; j < temp.length; j++){

                if(consi && temp[j] == temp[i]){
                    count++;
                    continue;
                }else consi = false;

                if(temp[j] > temp[i]){

                    res[i] = j - i;

                    if(count == 0)break;

                    while(count > 0){
                        i++;
                        if(j - i < 0){
                            res[i] = 0;
                        }else{
                            res[i] = j - i;
                        }
                        count--;
                    }
                    break;
                }
            }
        }

        return res;
    }
}

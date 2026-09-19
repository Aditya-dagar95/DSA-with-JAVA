class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temp.length; i++){

            while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                int j = stack.pop();
                res[j] = i - j;
            }
            
            stack.push(i);
        }

        return res;
    }
}

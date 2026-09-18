class Solution {
    public boolean isValid(String s) {

        Stack<String> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '('){
                stk.push("(");
                continue;

            } else if(s.charAt(i) == '['){
                stk.push("[");
                continue;

            } else if(s.charAt(i) == '{'){
                stk.push("{");
                continue;
            }

            if(stk.isEmpty()){
                return false;
            }

            if(stk.peek() == "(" && s.charAt(i) == ')'){
                stk.pop();

            } else if(stk.peek() == "[" && s.charAt(i) == ']'){
                stk.pop();

            } else if(stk.peek() == "{" && s.charAt(i) == '}'){
                stk.pop();
            } else{
                return false;
            }
        }

        if(stk.isEmpty()){
            return true;
        } else{
            return false;
        }
        
    }
}

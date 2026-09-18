class MinStack {

    class Node{

        int val;
        int min;

        Node prev;

        Node(int val,int min, Node stack){
            this.val = val;
            this.min = min;
            this.prev = stack;
        }
    }

    Node stack;

    public MinStack() {

        stack = null;        
    }
    
    public void push(int value) {
        if(stack == null) {
            stack = new Node(value, value, null);
        } else {
            int min = Math.min(value, stack.min);
            stack = new Node(value, min, stack);
        }
    }
    
    public void pop() {
        stack = stack.prev;
    }
    
    public int top() {
        return stack.val;
    }
    
    public int getMin() {
        return stack.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {
    Deque<Integer> min = new LinkedList<>();
    Stack<Integer> stack = new Stack<>();
    int count=0;
    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(count==0){
            min.addFirst(val);
        }else{
            if(val<=min.peekFirst()){
                min.addFirst(val);
            }else{
                min.addLast(val);
            }
        }
        count++;
        
    }
    
    public void pop() {
        int tmp =stack.pop();
        count--;
        if(tmp<=min.peekFirst()){
            min.pollFirst();
        }else{
            min.pollLast();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        System.out.println(min.peekLast());
        return min.peekFirst();
    }
}

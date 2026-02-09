// Last updated: 09/02/2026, 13:33:58
import java.util.LinkedList;  
import java.util.Queue;  

class MyStack {  
    private Queue<Integer> queue1;  
    private Queue<Integer> queue2;  

    public MyStack() {  
        queue1 = new LinkedList<>();  
        queue2 = new LinkedList<>();  
    }  

    public void push(int x) {  
        // Add the new element to queue1  
        queue1.offer(x);  
    }  

    public int pop() {  
        // Move all elements except the last one to queue2  
        while (queue1.size() > 1) {  
            queue2.offer(queue1.poll());  
        }  
        // The last remaining element is the top of the stack  
        int poppedElement = queue1.poll();  
        
        // Swap roles of the two queues  
        Queue<Integer> temp = queue1;  
        queue1 = queue2;  
        queue2 = temp;  

        return poppedElement;  
    }  

    public int top() {  
        // Move all elements except the last one to queue2  
        while (queue1.size() > 1) {  
            queue2.offer(queue1.poll());  
        }  
        // The last element is the top of the stack  
        int topElement = queue1.peek();  
        
        // Move the last element to queue2  
        queue2.offer(queue1.poll());  

        // Swap back the roles of the two queues  
        Queue<Integer> temp = queue1;  
        queue1 = queue2;  
        queue2 = temp;  

        return topElement;  
    }  

    public boolean empty() {  
        return queue1.isEmpty();  
    }  
}  
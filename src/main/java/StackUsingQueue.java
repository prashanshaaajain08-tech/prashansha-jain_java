import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();
  
    void push(int x) {
        q.add(x);
      
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
  
    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return q.remove();
    }

    int peek() {
        if (q.isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        return q.peek();
    }

    void display() {
        System.out.println(q);
    }
}

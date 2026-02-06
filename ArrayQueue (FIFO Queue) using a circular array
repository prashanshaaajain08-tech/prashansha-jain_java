class SimpleQueue {
    int arr[] = new int[5];
    int front = 0;
    int rear = -1;
    int count = 0;

    void enqueue(int x) {
        if (count == 5) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % 5;
        arr[rear] = x;
        count++;
    }

    void dequeue() {
        if (count == 0) {
            System.out.println("Queue Empty");
            return;
        }
        front = (front + 1) % 5;
        count--;
    }

    void display() {
        if (count == 0) {
            System.out.println("Queue Empty");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % 5] + " ");
        }
        System.out.println();
    }
}

package Mock;

import java.util.Arrays;

//Implementing Queue operations using Array
public class QueueImplementation {
    private final int maxSize;
    private int[] queueArray;
    private int top;
    private int end;

    public QueueImplementation(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.top = 0;
        this.end = -1;
    }

    public void add(int value) {
        if (isFull()) {
            System.out.println("Queue is full, can't add " + value);
        }
        queueArray[++end] = value;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty, can't remove ");
            return -1;
        }
        return queueArray[top++];
    }

    public boolean isFull() {
        return (end == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top > end);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, can't remove ");
            return -1;
        }
        return queueArray[top];
    }

    public void PrintQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, can't remove ");
        }
        for (int i = top; i <= end; i++) {
            System.out.println("Queue elements" + queueArray[i]);
        }
    }

    public static void main(String[] args) {
        QueueImplementation queueResult = new QueueImplementation(5);

        queueResult.add(10);
        queueResult.add(20);
        queueResult.add(30);
        queueResult.PrintQueue();
        System.out.println("Popped: " + queueResult.remove());
        System.out.println("Peek: " + queueResult.peek());
        queueResult.PrintQueue();
    }
}

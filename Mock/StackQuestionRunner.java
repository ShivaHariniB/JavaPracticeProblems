package Mock;

public class StackQuestionRunner {


    public static void main(String[] args) {
        StackImplementation stackResult = new StackImplementation(5);
        QueueImplementation queueImplementation = new QueueImplementation(5);
        StackImplementation stackResult3 = new StackImplementation(5);

        stackResult.add(10);
        stackResult.add(20);
        stackResult.add(30);
        stackResult.PrintQueue();
        System.out.println("Popped: " + stackResult.remove());
        System.out.println("Peek: " + stackResult.peek());
        stackResult.PrintQueue();
    }
}

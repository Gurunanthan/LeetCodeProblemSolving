package DSAimplementation;
import java.util.Stack;

public class QueueImplementationUsingStacks<T> {
    private Stack<T> stackEnqueue = new Stack<>();
    private Stack<T> stackDequeue = new Stack<>();

    public void enqueue(T item) {
        stackEnqueue.push(item);
    }

    public T dequeue() {
        if (stackDequeue.isEmpty()) {
            // If dequeue stack is empty, transfer elements from enqueue stack
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        // If both stacks are empty, the queue is empty
        if (stackDequeue.isEmpty()) {
            return null;
        }

        return stackDequeue.pop();
    }

    public static void main(String[] args) {
        QueueImplementationUsingStacks<Integer> queue = new QueueImplementationUsingStacks<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.dequeue());  // Output: 2
        System.out.println(queue.dequeue());  // Output: 3
        System.out.println(queue.dequeue());  // Output: null (queue is empty)
    }
}

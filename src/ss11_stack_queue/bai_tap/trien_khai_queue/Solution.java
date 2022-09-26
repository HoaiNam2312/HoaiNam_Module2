package ss11_stack_queue.bai_tap.trien_khai_queue;

public class Solution {
    public static class Node {
        public int data;
        public Node front;
    }

    public static class Queue {
        public Node front, rear;
    }

    public static void enQueue(int value, Queue queue) {
        Node temp = new Node();
        Node rearFront = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
            queue.front.front = null;
        }else {
            rearFront = queue.rear;
        }
        queue.rear = temp;
        queue.rear.front = rearFront;
    }
    public static int deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        } else {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.front;
            queue.rear.front = queue.front;
        }
        return value;
    }
    public static void displayQueue(Queue q) {
        Node temp = q.rear;
        System.out.println("Elements in Circular Queue are: ");
//        System.out.println(q.rear.front);
        while (temp.front != null){
            System.out.printf("%d ", temp.data);
            temp = temp.front;
        }
    }
}

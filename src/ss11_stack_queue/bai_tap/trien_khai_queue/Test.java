package ss11_stack_queue.bai_tap.trien_khai_queue;

public class Test {
    public static void main(String[] args) {
        Solution.Queue queue = new Solution.Queue();

        Solution.enQueue(1,queue);
        Solution.enQueue(2,queue);
        Solution.enQueue(3,queue);
        Solution.enQueue(4,queue);
        Solution.displayQueue(queue);
    }
}

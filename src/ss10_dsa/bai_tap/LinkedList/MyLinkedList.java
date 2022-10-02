package ss10_dsa.bai_tap.LinkedList;

public class MyLinkedList<E> {
    private Node head,tail;
    private int numNodes;

    public MyLinkedList() {

    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        numNodes++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        if (index <= numNodes) {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }else {
            addLast(data);
        }
    }

    public void addLast(Object data) {
        if (tail == null) {
            addFirst(data);
        } else {
            tail = head;
            for (int i = 1; i < numNodes; i++) {
                tail = tail.next;
            }
            tail.next = new Node(data);
            tail = tail.next;
            numNodes++;
        }
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Object remove(int index) {
        if (index < 0 || index >= numNodes) {
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node current = temp.next;
            temp.next = current.next;
            numNodes--;
            return current.data;
        }
    }

    public Object remove(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.next.data).equals(data)) {
                Node current = temp.next;
                temp.next = current.next;
                numNodes--;
                return current.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public Object get(int index) {
        Node temp = head;
        if (index >= 0 && index < numNodes) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        return null;
    }

    public Object getFirst() {
        if (head != null) {
            return head.data;
        }
        return null;
    }

    public Object getLast() {
        if (tail != null) {
            return tail.data;
        }
        return null;
    }

    public void clear() {
        head = tail = null;
    }

    public boolean checkTail() {
        return (tail!=null)?true:false;
    }
}

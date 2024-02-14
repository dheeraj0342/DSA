package GLA.DataStructure.Queue;

public class Main {

    public static void main(String[] args) {
        Dequeue deque = new Dequeue(5);
        deque.insertAtRear(10);
        deque.insertAtRear(20);
        deque.display();
        deque.insertAtRear(40);
        deque.insertAtRear(50);
        deque.display();
        deque.deleteAtFront();
        deque.deleteAtFront();
        deque.display();
    }
}

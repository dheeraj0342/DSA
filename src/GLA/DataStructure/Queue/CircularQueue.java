package GLA.DataStructure.Queue;

public class CircularQueue {
     Integer[] arr ;
     Integer front;
     Integer rear;

    public CircularQueue(int size) {
        arr = new Integer[size];
        this.front = -1;
        this.rear =-1;
    }

    public boolean isFull() {
        return (rear + 1) % arr.length == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = val;
        return true;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        Integer val = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
        return val;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % arr.length;
        }
        System.out.print(arr[rear]);
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(6);
        cq.enqueue(5);
        cq.dequeue();
        cq.dequeue();
        cq.display();
        cq.peek();
    }



}

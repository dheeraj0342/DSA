package GLA.DataStructure.Queue;

public class Dequeue {

    private Integer[] arr;
    private Integer front, rear;
    private Integer size;

    public Dequeue(Integer size) {
        arr = new Integer[size];
        front = 0;
        rear = -1;
        this.size = size;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || front == rear + 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void insertFront(int val) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = val;
    }

    public void insertRear(int val) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = val;
    }

    public Integer deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        Integer val = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return val;
    }

    public Integer deleteRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        Integer val = arr[rear];
        if (front == rear) {
            front = rear = -1;

        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
        return val;
    }

    public Integer getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return arr[front];
    }

}

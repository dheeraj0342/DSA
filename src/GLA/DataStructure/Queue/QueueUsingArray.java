package GLA.DataStructure.Queue;

public class QueueUsingArray {

    private Integer[] arr;
    private Integer front, rear;

    public QueueUsingArray(Integer size) {
        arr = new Integer[size];
        front = 0;
        rear = 0;
    }

    public boolean isFull() {
        return rear == arr.length;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        arr[rear++] = val;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        Integer val = arr[front];
        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return val;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Queue is Full");
            return null;
        }
        return arr[front];
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}







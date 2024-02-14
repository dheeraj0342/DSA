package GLA.DataStructure.Queue;

public class CircularQueue {
     Integer[] arr ;
     Integer front;
     Integer rear;

    public CircularQueue(int size) {
        arr = new Integer[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty(){
        return front==-1 && rear ==-1;
    }
    public boolean isFull(){
        return front == (rear+1)%arr.length;
    }

    public void push(int x){
        if(isFull()){
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1) % arr.length;
        arr[rear] = x;

    }

    public Integer pop(){
        if(isEmpty()){
            return null;
        }
        int val = arr[front];
        front = (front+1) % arr.length;
        return val;
    }

    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        return arr[front];
    }

}

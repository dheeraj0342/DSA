package GLA.DataStructure.Queue;
public class Dequeue {
    Integer[] items;
    int front;
    int rear;
    public Dequeue(int size){
        items=new Integer[size];
        front=-1;
        rear=-1;
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public  boolean isFull(){
        return front==(rear+1)% items.length;
    }

    public Integer frontValue(){
        if(isEmpty()){
            return null;
        }
        return items[front];
    }
    public Integer rearValue(){
        if(isEmpty()){
            return null;
        }
        return items[rear];
    }
    public boolean insertAtFront(Integer data){
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = rear = 0;
            items[front] = data;
            return true;
        }
        if(front<1){
            front = items.length - 1;
        }else {
            front--;
        }
        items[front] = data;
        return true;
    }
    public Integer deleteAtFront(){
        if(isEmpty()){
            return null;
        }
        if(front == rear){
            Integer val = items[front];
            front = rear = -1;
            return val;
        }
        Integer val = items[front];
        front = (front + 1) % items.length;
        return val;
    }

    public Integer deleteAtRear(){
        if(isEmpty()){
            return null;
        }

        if(front == rear){
            Integer val = items[rear];
            front = rear = -1;
            return val;
        }
        Integer val = items[rear];
        if(rear < 1){
            rear = items.length-1;
        }
        else {
            rear--;
        }
        return val;
    }
    public boolean insertAtRear(Integer data) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % items.length;
        }

        items[rear] = data;
        return true;
    }
    public void display() {
        if (isEmpty()) {
            return;
        }

        int i = front;
        while (true) {
            System.out.print(items[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % items.length;
        }
        System.out.println();
    }


}
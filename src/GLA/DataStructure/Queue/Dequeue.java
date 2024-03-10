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

    public boolean insertFront(int val){
        if(isFull()){
            System.out.println("Dequeue is Full");
            return false;
        }
        if(isEmpty()){
            front=rear=0;
        }else if(front==0){
            front=items.length-1;
        }else{
            front--;
        }
        items[front]=val;
        return true;
    }

    public boolean insertRear(int val){
        if(isFull()){
            System.out.println("Dequeue is Full");
            return false;
        }
        if(isEmpty()){
            front=rear=0;
        }else if(rear==items.length-1){
            rear=0;
        }else{
            rear++;
        }
        items[rear]=val;
        return true;
    }

    public Integer deleteFront(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return null;
        }
        Integer val=items[front];
        if(front==rear){
            front=rear=-1;
        } else if (front==items.length-1) {
           front=0;
        } else{
            front++;
        }
        return val;
    }

    public Integer deleteRear(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return null;
        }
        Integer val=items[rear];
        if(front==rear){
            front=rear=-1;
        }else if(rear==0){
            rear=items.length-1;
        }else{
            rear--;
        }
        return val;
    }

    public Integer getFront(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return null;
        }
        return items[front];
    }

    public Integer getRear(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return null;
        }
        return items[rear];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Dequeue is Empty");
            return;
        }
        int i =front;
      while(i!=rear){
          System.out.print(items[i]+" ");
          i=(i+1)%items.length;
      }
        System.out.println(items[rear]);
    }

public static void main(String[] args) {
        Dequeue dequeue = new Dequeue(5);
        dequeue.insertFront(1);
        dequeue.insertFront(2);
        dequeue.insertRear(3);
        dequeue.insertRear(4);
        dequeue.display();
         System.out.println(dequeue.deleteFront());

        dequeue.deleteRear();
        dequeue.display();
        dequeue.insertFront(5);
        dequeue.insertRear(6);
        dequeue.display();
    }




}
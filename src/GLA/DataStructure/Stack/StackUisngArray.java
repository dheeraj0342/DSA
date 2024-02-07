package GLA.DataStructure.Stack;

public class StackUisngArray {

   private Integer[] arr ;
   private int top;
   public StackUisngArray(int size){
       arr = new Integer[size];
       top=-1;
   }

    public boolean isEmpty(){
       return top ==-1;
    }
    public boolean isFull(){
       return top == arr.length-1;
    }

    public boolean push (int val){
       if(isFull()) {
           System.out.println("stack is full");
           return false;
       }

       arr[++top] = val;
       return true;
    }

    public Integer pop (){
       if(isEmpty()){
           System.out.println("stack is Empty");
           return null;
       }
        return arr[top--];
    }

    public Integer peek(){
       if(isEmpty()){
           System.out.println("stack is Empty");
           return null;
       }
       return arr[top];
    }


}

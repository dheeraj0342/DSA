package com.dheeraj.DSA.Arrays;

public class Array {
    private int lastIndex ;
    private int [] ptr;

    Array(int size){
        lastIndex =-1;
        ptr = new int[size];
    }

    public void append(int data){
        try {
                ptr[lastIndex +1] = data;
                lastIndex++;
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array is Full !");
        }
    }

    public void insert(int index , int data){
        try {
            if (index < 0 || index > lastIndex +1) {
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            }
            for(int i= lastIndex ; i>=index ; i--){
                ptr[i+1] = ptr[i];
            }
            ptr[index] = data;
            lastIndex++;
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array is full!");
        }
    }

    public void edit(int index , int data){
        try {
            if (index < 0 || index > lastIndex ) {
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            }
            ptr[index] = data;
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array is full!");
        }
    }

    public void delete(int index , int data){
        try {
            if (index < 0 || index > lastIndex ) {
                throw new ArrayIndexOutOfBoundsException("Invalid Index");
            }
            for(int i=index ; i<lastIndex;i++){
                ptr[i] = ptr[i+1];
            }
            lastIndex--;
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array is full!");
        }
    }
    public int count(){
        return lastIndex+ 1;
    }

    public boolean isEmpty(){
        return lastIndex == -1;
    }

    public boolean isFull(){
        return lastIndex + 1 == ptr.length;
    }

    public int getvalue(int index){
        try{
            if(index < 0 || index > lastIndex){
                throw  new ArrayIndexOutOfBoundsException("Invalid Index");
            }
            return ptr[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is full!");

        }
        return 0;
    }
    public int capacity(){
        return  ptr.length;
    }

}


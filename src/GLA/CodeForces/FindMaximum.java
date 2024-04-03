package GLA.CodeForces;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr ={-1,5,9,0,2,3};
        int first =Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(first < arr[i]){
                third = second;
                second=first;
                first=arr[i];
            }
            else if(arr[i] > second && arr[i] > third && arr[i]<first){
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third && arr[i]<second && arr[i]<first){
                third = arr[i];
            }
        }
        System.out.println(first + " " +second+" " +third);
    }
}

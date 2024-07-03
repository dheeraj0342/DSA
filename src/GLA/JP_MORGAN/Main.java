package GLA.JP_MORGAN;
import java.util.*;
public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int i=0;
            while(i<n){
                int check = arr[i]-1;
                if(arr[i] != arr[check]){
                    int temp = arr[i];
                    arr[i] = arr[check];
                    arr[check]=temp;
                }
                else{
                    i++;
                }
            }
            ArrayList<Integer> result = new ArrayList<>();

            for(int j=0;j<n;j++){
                if(arr[j] != j+1){
                    result.add(arr[j]);
                }
            }
            Collections.sort(result);
            for(int j=0;j<result.size();j++){
                System.out.print(result.get(j)+" ");
            }
            System.out.println();
            }
}




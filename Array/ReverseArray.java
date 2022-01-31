import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray{

    public void reverseArray(int[] arr){
        System.out.println("Array: " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array: "+Arrays.toString(arr));

    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i = 0; i<size; i++){
           arr[i] = sc.nextInt();
       } 
       ReverseArray array = new ReverseArray();
       array.reverseArray(arr);
    }
}
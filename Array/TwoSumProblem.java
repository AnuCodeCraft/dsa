import java.util.Arrays;
import java.util.Scanner;
//to find the sum of pair equal to target value.
public class TwoSumProblem {

    public int[] targetSum(int[] arr, int targetValue){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+arr[j] == targetValue){
                   return new int[] {i, j};
                }
                
            }
        }
        return new int[] {-1,-1};

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        };
        System.out.println("Enter the target Value");
        int targetValue = sc.nextInt();
        
        TwoSumProblem pairs = new TwoSumProblem();
        int[] result = pairs.targetSum(arr, targetValue);
        System.out.println(Arrays.toString(result));
        


    }

    
}

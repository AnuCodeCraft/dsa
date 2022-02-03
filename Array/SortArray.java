import java.util.Scanner;
import java.util.Arrays;

//To sort an array of 0s, 1s and 2s using Dutch National Flag
public class SortArray {
    public void sortArray(int nums[]){
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        int temp ;
        while(mid <= high){
            switch(nums[mid]){
                case 0:{
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = nums[temp];
                    high--;
                    break;
                }

            }
        }
        
        System.out.print(Arrays.toString(nums));

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        SortArray array = new SortArray();
        array.sortArray(arr);

    }
    
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer arr[] = new Integer[rowIndex+1]; 
        Arrays.fill(arr, 0);
        arr[0]=1; 

        for(int i=0; i<rowIndex+1; i++){
            for(int j=i; j>0; j--){
                arr[j]=arr[j]+arr[j-1];
            }
        }

        return Arrays.asList(arr);
    }
}
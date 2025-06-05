class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        int small=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
               small=max;
                max=arr[i];
            }
            else if(max==arr[i]){
                max=arr[i];
            }
            else if(small<arr[i]){
                small=arr[i];
            }
        }
        return (small==0)?-1:small;
    }
}
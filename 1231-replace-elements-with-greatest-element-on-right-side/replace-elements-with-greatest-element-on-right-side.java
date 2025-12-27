class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int right=-1;
            for(int j=i+1;j<n;j++){
                right=Math.max(arr[j],right);

            }
            arr[i]= right;
        }
        return arr;
        
    }
}

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
         int count=0;
        for(int i =0;i<arr.length ;i++){
            if(arr[i]!=0){
                if(i!=count){
                int temp=arr[i];
                 arr[i] = arr[count];
                 arr[count] = temp;
                }
               
                 count++;
            }
           
    
        }
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] arr = {1,2,0,4,0,5,0};
        sol.pushZerosToEnd(arr);
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
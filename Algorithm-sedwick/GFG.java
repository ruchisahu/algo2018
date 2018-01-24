// A simple Java program to find max subarray XOR
class GFG {
    static int maxSubarrayXOR(int arr[], int n)
    {
        int pos;
        int ans = Integer.MIN_VALUE; // Initialize result
      
        
        for (int i=0; i<n; i++)
        {
               
            int curr_xor = 0; 
      
           
            for (int j=i; j<n; j++)
            {
                curr_xor = curr_xor ^ arr[j];
                ans = Math.max(ans, curr_xor);
                pos=arr[j];
                 System.out.println(pos);
             }
        }
     // System.out.println(pos);
        return ans;
    }
      
    // Driver program to test above functions
    public static void main(String args[])
    {
        int arr[] = {4,2,0,13,49};
        int n = arr.length;
        System.out.println("Max subarray XOR is " + 
                                 maxSubarrayXOR(arr, n));
    }
}

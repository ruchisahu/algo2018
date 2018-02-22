//Largest Sum Contiguous Subarray using dynamic approach

import java.io.*;
// Java program to print largest contiguous array sum
import java.util.*;
 
class GFG
{
    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
 
    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max = a[0]; 
         int   curr_max=a[0];
 
        for (int i = 0; i < size; i++)
        {
            curr_max = Math.max(a[i],curr_max + a[i]);
            max=Math.max(max,curr_max);
        }
        return max;
    }
}
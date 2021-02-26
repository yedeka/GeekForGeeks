package com.gfg.gcl12.arrays.tracks.slidingwindow;

/*
* Problem Statement -   Find maximum subarray size, such that all subarrays of that size have sum less than k
* Input             -   arr[] = {1, 2, 3, 4} and k = 8
* Output            -   2
* Explanation       - Sum of subarrays of size 1: 1, 2, 3, 4.
                      Sum of subarrays of size 2: 3, 5, 7.
                      Sum of subarrays of size 3: 6, 9.
                      Sum of subarrays of size 4: 10.
**/
public class MaxSizeSumLessThanK {
    // Function to find the
// largest size subarray
    public static void func(int arr[],
                            int k, int n)
    {

        // Variable declaration
        int ans = n;
        int sum = 0;
        int start = 0;

        // Loop till N
        for(int end = 0; end < n; end++)
        {

            // Sliding window from left
            sum += (int)arr[end];

            while (sum > k)
            {

                // Sliding window from right
                sum -= (int)arr[start];
                start++;

                // Storing sub-array size - 1
                // for which sum was greater than k
                ans = Math.min(ans, end - start + 1);

                // Sum will be 0 if start>end
                // because all elements are positive
                // start>end only when arr[end]>k i.e,
                // there is an array element with
                // value greater than k, so sub-array
                // sum cannot be less than k.
                if (sum == 0)
                    break;
            }

            if (sum == 0)
            {
                ans = -1;
                break;
            }
        }

        // Print the answer
        System.out.println(ans);
    }

    // Driver code
    public static void main (String[] args)
    {
        int arr[] = { 1, 2, 3, 4 };
        int k = 8;
        int n = arr.length;

        // Function call
        func(arr, k, n);
    }
}

1480. Running Sum of 1d Array


Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

### Brute-force Approach

  Two options: 
  1. Without modifying original Array 
  class Solution{
  
     public int[] RunningSum(int[] nums){
        
        int[] output = new int[nums.length];
        output[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            output[i] = nums[i] + output[i-1];
        }
        
        return output;
        
     }
  }
  
  2. Modifying original Array
  
  class Solution{
  
     public int[] RunningSum(int[] nums){
        
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        
        return nums;
     }
  }
  

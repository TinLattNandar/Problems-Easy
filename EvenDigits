Given an array nums of integers, return how many of them contain an even number of digits.

- We can count the number of digits by dividing 10.
- As a next step, the count can be identified whether it is even or not. 

######

class Solution {
    public int findNumbers(int[] nums) {
        
        int length = nums.length;
        int count;
        int evenDigit = 0;
        for(int i = 0; i<length; i++){
            count = 0;
            while(nums[i] > 0){
                nums[i] = nums[i]/10;
                count++;
            }            
            if(count%2 == 0){
                evenDigit++;
            }
        }
        return evenDigit;
    }
}

#####

Run time - 1ms

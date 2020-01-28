Given an integer number n, return the difference between the product of its digits and the sum of its digits

- Convert int to string
- Use Character.digit to point out each digit

######
class Solution {
    public int subtractProductAndSum(int n) {
        
        int product = 1;
        int sum = 0;
        int result = 0;
   
        String num = String.valueOf(n);
        int length = num.length();
        
        for(int i = 0; i < length; i++) {
            
            int j = Character.digit(num.charAt(i), 10);
            product *= j;
            sum +=j;
            
        }
        
        result = product - sum;
        
        return result;
        
    }
}

#####
Run Time - 0ms

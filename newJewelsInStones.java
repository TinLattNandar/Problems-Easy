You are given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels. The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Brute-Force Approach 
- Just pointing out each element whether it is match.

########
class Solution {
    public int numJewelsInStones(String J, String S) {
    int count = 0;
    int Slength = S.length();
    int Jlength = J.length();
        
    for(int i = 0; i < Slength; i++){
        for(int j= 0; j< Jlength; j++){
            if(J.charAt(j) == S.charAt(i)){
                count++;
                break;
            }            
        } 
    }     
    return count;        
    }
}

#######
Run Time - 0ms

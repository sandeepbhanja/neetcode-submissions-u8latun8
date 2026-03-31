class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] returnArray = new int[n*2];
        
        for(int i=0;i<n;i++){
            returnArray[i] = nums[i];
            returnArray[i+n] = nums[i];
        }
        return returnArray;
    }
}
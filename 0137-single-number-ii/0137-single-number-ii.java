class Solution {
    public int singleNumber(int[] nums) {
        int one=0;int two=0;
        for(int val:nums){
          one=(one^val)&~two;
          two=(two^val) &~one;
        }
        return one;
    }
}
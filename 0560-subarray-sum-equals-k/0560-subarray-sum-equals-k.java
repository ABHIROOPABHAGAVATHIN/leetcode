class Solution {
    public int subarraySum(int[] nums, int k) {
       int currentprefix=0;int c=0;
       HashMap<Integer,Integer>hm=new HashMap<>();
       hm.put(0,1);
       for(int n:nums){
          currentprefix+=n;
          int need=currentprefix-k;
          if(hm.containsKey(need)){
            c=c+hm.get(need);
          }
          hm.put(currentprefix,hm.getOrDefault(currentprefix,0)+1);
       }
return c;
    }
}
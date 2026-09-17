class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        int []res=new int[size];double ans;
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[i+nums1.length]=nums2[i];
        }
        Arrays.sort(res);
        int ind=size/2;
        if(size%2!=0){
            ans=res[ind];
        }else{
          ans=(res[ind-1]+res[ind])/2.0;
        }
      return ans;
    }
}
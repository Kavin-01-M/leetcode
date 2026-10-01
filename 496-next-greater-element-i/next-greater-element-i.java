class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int a=0;
    int [] ans=new int[nums1.length];
       while(a!=nums1.length){
        int b=0;
        for(int i=0;i<nums2.length;i++){
            
            if(nums1[a]==nums2[i]){
                b=i;
                break;
            }

        }
        ans[a]=-1;
        for(int i=b+1;i<nums2.length;i++){
            if(nums2[i]>nums1[a]){
                ans[a]=nums2[i];
                break;
            }
            
        }
        a++;
       }
    
    return ans;
        
    }
}
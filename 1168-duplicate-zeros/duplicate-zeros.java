class Solution {
    public void duplicateZeros(int[] arr) {
        int [] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
            if(j<arr.length){
                temp[j]=0;

                j++;

            }
            if(j<arr.length){
                temp[j]=0;

                j++;
            }

        }
        else{
            if(j<arr.length){
                temp[j]=arr[i];
                j++;
            }
        }}
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
}
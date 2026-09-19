class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        while(sum!=1 && !set.contains(sum)){
            set.add(sum);
            sum=0;
            while(n!=0){
                int rem=n%10;
                n/=10;
                sum+=(rem*rem);
            }
            n=sum;
        }
        if(n!=1){
            return false;
        }
        return true;
    }
}
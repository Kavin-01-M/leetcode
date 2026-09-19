class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        while(sum!=1 && !set.contains(sum)){
            set.add(sum);
            sum=0;
            int num=n;
            while(num!=0){
                int rem=num%10;
                num/=10;
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
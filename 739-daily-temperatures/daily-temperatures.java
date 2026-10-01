class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] answer=new int[n];
        Stack<Integer> a=new Stack<>();
        for(int i=0;i<n;i++){
            while(!a.isEmpty() && temperatures[i]>temperatures[a.peek()]){
                int prev=a.pop();
                answer[prev]=i-prev;
            }
             a.push(i);
        }
        return answer;

        
    }
}
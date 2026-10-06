class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> ab=new Stack<>();
        for(char c:s.toCharArray()){

            if(ab.isEmpty()){
                ab.push(c);

            }
            else if(ab.peek()=='(' && c==')'){

                ab.pop();
            }
            else{
                ab.push(c);
            }
        }
        return ab.size();
    }
}
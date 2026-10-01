class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> a=new Stack<>();
        Stack<Character> b=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                a.push(c);
            }
            else if(!a.isEmpty()){
                a.pop();
            }
        }
         for(char z:t.toCharArray()){
            if(z!='#'){
                b.push(z);
            }
            else if(!b.isEmpty()){
                b.pop();
            }
        }
      
       
   return a.equals(b);
        
    }
}
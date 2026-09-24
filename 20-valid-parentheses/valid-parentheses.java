class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
       for(char ch:s.toCharArray()){
        if(ch=='('||ch=='['||ch=='{'){
            stack.push(ch);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char a=stack.pop();
            if((ch==')'&&a!='(')||(ch==']'&&a!='[')||(ch=='}'&&a!='{')){
                return false;
            }
        }
       }
       return stack.isEmpty();


    }
}
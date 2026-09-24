class Solution {
    public int calPoints(String[] ope) {
     Stack<Integer> sta = new Stack<>();
     for(String p : ope) {
        if(p.equals("C")){
            sta.pop();
        }
        else if(p.equals("D")){
            sta.push(sta.peek()*2);
        }
        else if(p.equals("+")){
            int f = sta.pop();
            int se = sta.peek();

            sta.push(f);
            sta.push(f+se);
        }
        else{
            sta.push(Integer.parseInt(p));
        }
     }
        int sum = 0 ;
        while(!sta.empty()){
            sum = sum + sta.pop();
        }
        return sum;
     }
    }
    

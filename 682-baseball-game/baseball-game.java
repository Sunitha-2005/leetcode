class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
            
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if(s.equals("+")){
                int t=st.pop();
                int t1=st.peek();
                int sol=t+t1;
                st.push(t);
                st.push(sol);
            }else if(s.equals("D")){
                int t=st.peek();
                st.push(t*2);
            }else if(s.equals("C")){
                st.pop();
            }else{
                st.push(Integer.valueOf(s));
            }
            
        }
        int so=0;
        for(int i:st){
            so+=i;
        }
        return so;
    }

}
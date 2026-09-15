class Solution {
    public int evalRPN(String[] tokens) {
        int len=tokens.length;
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        int ans=0;
        for(int i=0;i<len;i++){
            String ch=tokens[i];
            if(ch.equals("*")||ch.equals("-")||ch.equals("+")||ch.equals("/")){
                int b=stack.pop();

                int a=stack.pop();
                if(ch.equals("*")){
                    stack.push(a*b);
                }else if(ch.equals("+")){
                    stack.push(a+b);
                }else if(ch.equals("-")){
                    stack.push(a-b);
                }else{
                    stack.push(a/b);
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}

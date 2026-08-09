class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right=s.length()-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=s.charAt(right)){
                return false;

            }
right--;
        }
        return true;
    }
}

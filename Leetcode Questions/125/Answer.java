class Solution {
    public boolean isPalindrome(String s) {
      
      char[] ch = new char[s.length()];
        int j = 0;

        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c+32);
            }
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                ch[j] = c;
                j++;
            }
        }

        int left = 0, right = j - 1;

        while(left < right){
            if(ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

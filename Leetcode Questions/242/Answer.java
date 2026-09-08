class Solution {
    public boolean isAnagram(String s, String t) {
        int [] arr = new int[99999];
        char[] ch =  s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            arr[ch[i]]++;
        }

        char[] ch2 = t.toCharArray();

        for(int i = 0; i < t.length(); i++){
            if(arr[ch2[i]] == 0){
                return false;
            } else{
                arr[ch2[i]]--;
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(arr[ch[i]] != 0){
                return false;
            }
        }
        return true;
    }
}

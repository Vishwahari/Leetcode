class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        char [] c = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            arr[c[i]-'a']++;
        }
        for(int i = 0;i<s.length();i++){
            if(arr[c[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
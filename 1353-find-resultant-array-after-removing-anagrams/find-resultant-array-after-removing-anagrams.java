class Solution {
    static boolean isAnagram(String s1,String s2){
        if (s1.length() != s2.length()) return false;
        char [] a = s1.toCharArray();
        char [] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
    public List<String> removeAnagrams(String[] words) {
        List <String> result = new ArrayList<>();
        result.add(words[0]);

        for(int i = 1;i<words.length;i++){
            String lastWord = result.get(result.size()-1);
            if(!isAnagram(lastWord,words[i])){
                result.add(words[i]);
            }
        }
        return result;
    }
}
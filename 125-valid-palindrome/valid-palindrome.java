class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev = new StringBuilder(result).reverse().toString();
        if(result.equals(rev)) return true;
        else return false;
    }
}
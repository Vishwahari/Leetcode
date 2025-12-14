class Solution {
    public boolean judgeCircle(String moves) {
        char [] c = moves.toCharArray();
        int x = 0,y=0;
        for(int i = 0;i<c.length;i++){
            if(c[i]=='R') x++;
            else if(c[i]=='L') x--;
            else if(c[i]=='U') y++;
            else y--;
        }
        return x==0&&y==0;
    }
}
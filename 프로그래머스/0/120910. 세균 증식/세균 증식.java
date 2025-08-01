import java.io.*;

class Solution {
    public int solution(int n, int t) {
        int p = (int)Math.pow(2,t);
        return n*p;
    }
}
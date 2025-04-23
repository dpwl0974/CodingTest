class Solution
{
    public int solution(int n, int a, int b)
    {
        int cnt = 1;
        while((a+1)/2 != (b+1)/2){
            cnt++;
            //라운드에서 만났을 때
            if((a+1)/2 == (b+1)/2) break;
            //안만났을ㄷ 때
            a = (a+1)/2;
            b = (b+1)/2;
        }
        return cnt;
    }
}
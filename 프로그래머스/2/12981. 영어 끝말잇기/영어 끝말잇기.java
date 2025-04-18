import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        //중복되지 않은 단어 저장 할 리스트
        ArrayList<String> wordlist = new ArrayList<>();
        //처음 시작
        wordlist.add(words[0]);

        for(int i = 1; i < words.length; i++){
            //중복 단어 찾기
            if(wordlist.contains(words[i])) {
                return new int[] {(i%n) + 1,(i/n) + 1};
            }
            else {wordlist.add(words[i]);}
            
            //틀린 끝말잇기 찾기
            if(words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)){
                return new int[] {(i%n) + 1,(i/n) + 1};       
            }
        }
        //탈락자 생기지 않는 경우
        return new int[] {0,0};
    }
}
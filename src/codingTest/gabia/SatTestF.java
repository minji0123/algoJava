package codingTest.gabia;

import java.util.*;

public class SatTestF {
    public static int solution(String s, String [] word_dict){
        int answer = 0;




        return answer;
    }

    // 뒷글자 잘라주는 메소드
    public static ArrayList<String> cutWord(ArrayList<String> wordDict){
        ArrayList<String> wordList = new ArrayList<>();

        for (int i = 0; i<wordDict.size(); i++) {
            String word = wordDict.get(i).substring(0, wordDict.get(i).length() - 1);
            wordList.add(word);
        }
        return wordList;
    }

    public static void main(String[] args) {
        String s = "aaaababab";
        String [] word_dict = {"aaa","aaaa","ab","bab","aababa"};
        int cnt = 0;
        int realCnt = 0;

        // cnt가 있으면 반복
//        while(true){
            cnt = 0;
            realCnt = 0;

            // 뒷글자 하나씩 잘라주기
            ArrayList<String> wordList = new ArrayList<>();
            ArrayList<String> 임시 = new ArrayList<>();

//            for (int i = 0; i<word_dict.length; i++) {
//                String word = word_dict[i].substring(0, word_dict[i].length() - 1);
//                wordList.add(word);
//            }
        ArrayList<String> wordDict = new ArrayList<>(Arrays.asList(word_dict));

        wordList =cutWord(wordDict);
            // 잘라준 문자열이랑 기존 데이터 붙여서 같은지 비교
            for(int i = 0; i<wordList.size(); i++){
                for (int j = 1; j<word_dict.length; j++){
                    System.out.println("===================");
                    if(s.startsWith(wordList.get(i) + word_dict[j])){
                        System.out.println(i+""+wordList.get(i) +"  "+ word_dict[j]);
                        임시.add(wordList.get(i) + word_dict[j]);
                        cnt++;
                    }

                }
            }

            realCnt++;
            if (임시.size() == 1){
//                break;
            }else{
                임시.clear();
            }

//        }

    }
}

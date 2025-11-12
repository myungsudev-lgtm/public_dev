package com.exam.programmers.solution;

//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
//"hello"의 각 문자를 세 번씩 반복한 "hhheeellllllooo"를 return 합니다.
public class Q_120825 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuilder sb = new StringBuilder();
            String[] split = my_string.split("");
            for (int i = 0; i < my_string.length(); i++){
                sb.append(split[i].repeat(n));
            }
            return sb.toString();
        }
    }

}

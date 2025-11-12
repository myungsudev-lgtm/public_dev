package com.exam.programmers.solution;

//정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는
// solution 함수를 완성해 주세요.
//
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

import java.util.ArrayList;

public class Q_181921 {

    class Solution {
        public ArrayList<Integer> solution(int l, int r) {
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i = l; i <= r; i++) {
                if (i % 5 == 0 && i % 10 == 0) {
                        arr.add(i);
                }
                if (arr.isEmpty()) {
                    arr.add(-1);
                }
            }
            return arr;
        }
    }

}

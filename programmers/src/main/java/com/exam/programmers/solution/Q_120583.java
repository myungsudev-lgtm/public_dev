package com.exam.programmers.solution;

//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
// array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

import java.util.Arrays;

public class Q_120583 {

    class Solution {
        public int solution(int[] array, int n) {
            return (int)Arrays.stream(array).filter(v -> v == n).count();
        }
    }

}

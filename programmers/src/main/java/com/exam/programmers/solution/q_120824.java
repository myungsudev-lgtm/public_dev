package com.exam.programmers.solution;
//정수가 담긴 리스트 num_list가 주어질 때,
// num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

public class q_120824 {

    public int[] solution(int[] num_list) {
        int even = 0, odd = 0;
        for (int i : num_list) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }
}

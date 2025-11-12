package com.exam.programmers.solution;
//양의 정수 n이 매개변수로 주어질 때,
// n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든
// 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

import java.util.ArrayList;
import java.util.List;

public class Q_181935 {

    public int solution(int n) {
        List<Integer> arr = new ArrayList<>();
        int result = 0;
            for (int i = 0; i <= n; i++) {
                arr.add(i);
            }
        if (n % 2 != 0) {
            result = arr.stream()
                    .filter(v -> v % 2 != 0)
                    .mapToInt(Integer::intValue)
                    .sum();
        }else {
            result = arr.stream()
                    .filter(v -> v % 2 == 0)
                    .mapToInt(v -> v * v)
                    .sum();
        }
        return result;
    }
}

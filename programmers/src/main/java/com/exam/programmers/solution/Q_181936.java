package com.exam.programmers.solution;

//정수 number와 n, m이 주어집니다.
// number가 n의 배수이면서 m의 배수이면 1을
// 아니라면 0을 return하도록 solution 함수를 완성해주세요.

public class Q_181936 {

    public int solution(int number, int n, int m) {
        if(number % n ==0 && number % m == 0){
            return 1;
        }else {
            return 0;
        }
    }
}
